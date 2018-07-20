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
				this.dao.log("���Էα�");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return cnt;
	}
	
	//�Խñ� ���
	public List<BoardDTO> selectService(int currentPage, int pageSize)
	{	List<BoardDTO> list = null;
		try {
			list = this.dao.select(currentPage, pageSize);
			this.dao.log("�ۺ���α�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

	public int updateService(BoardDTO dto) {
		int cnt = 0;
		try {
			cnt = this.dao.update(dto);
			this.dao.log("�����α�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	
	// ���� : Ʈ����� ó�� (1 + 2)
	public BoardDTO viewArticleService(int seq) {
		BoardDTO dto =null;
		try {
			dto = new BoardDTO();
			// 1. seq ��ȸ�� 1����
			this.dao.increasedReaded(seq);
			// 2. seq �Խñ� select
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
			this.dao.log("�����α�");
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
