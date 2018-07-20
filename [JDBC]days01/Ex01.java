package days01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {
		//[ ***JDBC*** ] : Java DataBase Connectivity -자바에서 디비에 연결해서 사용 할 수 있는 기술*
		//-> 데이터베이스에 연결 및 작업을 하기위한 자바 표준 인터페이스.
		// 각각 회사에서 제공하는 드라이버가 있어야 디비와 디비를 연결하는 인터페이스를 통해 같은 디비, 같은 메소드 사용 가능. 
        // 인터페이스를 사용하면 유지보수 , 확장성 굿굿 
		// JDBC 드라이버 - 각각의 OREACLE, MYSQL, MS SQL 디비와 인터페이스를 연결해주는 것을 총 통틀어 이루는말
		
		//  JAVA응용 프로그램
		// 			|
		//	디비작업 연결 인터페이스
		//			|
		//    JDBC 드라이버
		
		
		
		/*	[ DBMS프로토콜 드라이버 ]
		 *  -> 미들웨어 따로 필요 ㄴㄴ 
		 *  	순수 자바로 만들어 졌으며, DBMS를 직접 호툴하는 드라이버로 JDBC드라이버와 데이터베이스 간의 일대일 관ㄱㅖ를 가진다.
		 * 
		 *  
		 * */
		
		
		/*  오라클연결  
		 * 1. JDBC Driver 다운로드 - ojdbc6.jar
		 * 2. jre/lib/ext 폴더에 넣어놓으면 따로 클래스 패스 설정 안해도 인식이된다. 
		 * 3. jdbc driver 로딩 : Class.forName()
		 * 4. 커넥션 객체Connection(디비에 연결된 단위와 같은 객체) 얻어오기 :   DriverManager.getConnection
		 * * * */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String userid = "scott";
		String password = "tiger";
		//ojdbc6.jar인식 못하면 .뒤에 객체 안나옴 ~
		//oracle.jdbc.driver.OracleDriver - 대소문자 구분!!
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결
			Connection con = DriverManager.getConnection(url, userid, password); //연결객체 얻어오기
			System.out.println( con );
			con.close(); //디비연결 끊기
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
