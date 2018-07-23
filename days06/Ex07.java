package days06;

import java.sql.Connection;
import java.sql.SQLException;

import com.util.ConnFactory;
import com.util.DBConn;

public class Ex07 {

	public static void main(String[] args) {
		//	jdbc.properties
		// JDBC config file
		
		//1. Connection 객체
		//Connection con = DBConn.getConnection();
		
		//2. XXXFactory 클래스 - XXX를 만들 수 있는 공장
		
		//싱글톤
		//connFactoty conn = new ConnFactory xxxxxxxxx
		ConnFactory factory = ConnFactory.getDefaultFactory(); //new 로 생성자 말고 모두다 똑같은 공장에서 찎어낸거를 가져오겠다.
		Connection con;
		try {
			con = factory.createConnection(); //== getConnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		// [ Connection Pool ] // 미리 일정한 수만큼 미리 생성하여 커넥션을 빌려주고 다시반환받아서 커넥션을 관리
		// 장점 : 디비 연결 시간을 줄일 수 있다. 
		
	}

}
