package days04.cstvsBaord;

import java.sql.SQLException;
import java.util.List;

public interface IBoardDAO {

	//�Խñ� ����
	int insert(BoardDTO dto) throws SQLException;
	
	//�Խñ� ��� (������������ȣ =1 , ������ �� ������ �� ����=10 )
	List<BoardDTO> select(int currentPage, int pageSize) throws SQLException;
	
	//�αױ��
	void log(String message);

	//�Խñ� ����
	int update(BoardDTO dto) throws SQLException;
	
	//��ȸ�� ����
	void increasedReaded(int seq) throws SQLException;

	// �Խñ� ����
	BoardDTO selectOne(int seq) throws SQLException;

	// �� ���ڵ�� 
	// �� ������ �� 
	int getTotalPages(int pageSize,String searchCondition, String searchWord) throws SQLException;
	
	// ����¡�� "|< < 11 51 52 54 [55] 56 57 58 59 20 > >|"
	String pageBlock(int currentPage, int pageSize, int pageBlock, int totalPages);

	//�Խñ� �˻�
	//List<BoardDTO> searchArticle(int SearchCondition,String SearchWord) throws SQLException;
	List<BoardDTO> search(String SearchCondition,String SearchWord, int currentPage, int pageSize) throws SQLException;
	
	//�Խñ� ����
	int delete(int seq) throws SQLException;
	
}
