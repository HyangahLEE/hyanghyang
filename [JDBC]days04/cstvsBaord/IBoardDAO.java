package days04.cstvsBaord;

import java.sql.SQLException;
import java.util.List;

public interface IBoardDAO {

	//게시글 쓰기
	int insert(BoardDTO dto) throws SQLException;
	
	//게시글 목록 (현재페이지번호 =1 , 페이지 당 보여질 행 개수=10 )
	List<BoardDTO> select(int currentPage, int pageSize) throws SQLException;
	
	//로그기록
	void log(String message);

	//게시글 수정
	int update(BoardDTO dto) throws SQLException;
	
	//조회수 증가
	void increasedReaded(int seq) throws SQLException;

	// 게시글 보기
	BoardDTO selectOne(int seq) throws SQLException;

	// 총 레코드수 
	// 총 페이지 수 
	int getTotalPages(int pageSize,String searchCondition, String searchWord) throws SQLException;
	
	// 페이징블럭 "|< < 11 51 52 54 [55] 56 57 58 59 20 > >|"
	String pageBlock(int currentPage, int pageSize, int pageBlock, int totalPages);

	//게시글 검색
	//List<BoardDTO> searchArticle(int SearchCondition,String SearchWord) throws SQLException;
	List<BoardDTO> search(String SearchCondition,String SearchWord, int currentPage, int pageSize) throws SQLException;
	
	//게시글 삭제
	int delete(int seq) throws SQLException;
	
}
