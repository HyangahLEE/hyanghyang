package days04.cstvsBaord;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import days03.emp.empDAOImpl;

public class BoardService {

	private IBoardDAO dao = null;

	public void setDao(IBoardDAO dao) {
		this.dao = dao;
	}

	public BoardService(IBoardDAO dao) {
		super();
		this.dao = dao;
	}
	
	public int insertService(BoardDTO dto)  {
		int cnt = 0;
			try {
				cnt = this.dao.insert(dto);
				this.dao.log("삽입로그");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return cnt;
	}
	
	//게시글 목록
	public List<BoardDTO> selectService(int currentPage, int pageSize)
	{	List<BoardDTO> list = null;
		try {
			list = this.dao.select(currentPage, pageSize);
			this.dao.log("글보기로그");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

	public int updateService(BoardDTO dto) {
		int cnt = 0;
		try {
			cnt = this.dao.update(dto);
			this.dao.log("수정로그");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	
	// 서비스 : 트랜잭션 처리 (1 + 2)
	public BoardDTO viewArticleService(int seq) {
		BoardDTO dto =null;
		try {
			dto = new BoardDTO();
			// 1. seq 조회수 1증가
			this.dao.increasedReaded(seq);
			// 2. seq 게시글 select
			dto  = this.dao.selectOne(seq);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return dto;
	}

	public String pageBlockService(int currentPage, int pageSize, int pageBlock,String searchCondition, String searchWord) {
		int totalPages;
		String strpageBlock=null;
		try {
			totalPages = this.dao.getTotalPages(pageSize,searchCondition, searchWord);
			strpageBlock = this.dao.pageBlock(currentPage, pageSize, pageBlock, totalPages);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return strpageBlock; 
	}

	public int deleteArticleService(int seq) {
		int cnt = 0;
		try {
			cnt = this.dao.delete(seq);
			this.dao.log("삭제로그");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	
	}

	
	public  List<BoardDTO> searchArticleService(String searchCondition, String searchWord, int currentPage, int pageSize) {
		List<BoardDTO> list = null;
		try {
			
			list = this.dao.search(searchCondition, searchWord, currentPage, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	
	}

/*	public  List<BoardDTO> searchArticle(int searchCondition, String searchWord) {
		{	List<BoardDTO> list = null;
		try {
			list = this.dao.searchArticle(searchCondition, searchWord);
				} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		}
	
	}*/

}
