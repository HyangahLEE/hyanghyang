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
		 * 		days04.cstvsBaord 패키지
		 * 1. BoardDTO
		 * 2. IBoardDAO
		 * 3. BoardDAOImpl : 필드 Connection DI + setter + 생성자
		 * 4. BaordService : 필드 BoardDAOImple DI + ( setter 또는 생성자 )
		 * 5. BaordController 컨트롤러. x
		 * 6. Ex06.java 테스트
		 * */

	}

}
