package days04;

import java.sql.Connection;

import com.util.DBConn;

import days04.cstvsBaord.BoardController;
import days04.cstvsBaord.BoardDAOImpl;
import days04.cstvsBaord.BoardService;
import days04.cstvsBaord.IBoardDAO;

public class Ex06 {

	public static void main(String[] args) {
		
	Connection con = DBConn.getConnection();
	IBoardDAO dao = new BoardDAOImpl(con);
	BoardService service = new BoardService(dao);
	
	BoardController controller = new BoardController(service);
	controller.start();
		
		
		
	
		/*
		 * 
		 * 
		 * 
		 * 		days04.cstvsBaord ��Ű��
		 * 1. BoardDTO
		 * 2. IBoardDAO
		 * 3. BoardDAOImpl : �ʵ� Connection DI + setter + ������
		 * 4. BaordService : �ʵ� BoardDAOImple DI + ( setter �Ǵ� ������ )
		 * 5. BaordController ��Ʈ�ѷ�. x
		 * 6. Ex06.java �׽�Ʈ
		 * */

	}

}
