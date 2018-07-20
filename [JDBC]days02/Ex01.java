package days02;

import java.sql.Connection;

import com.util.DBConn;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
			try {
				
				Connection con = DBConn.getConnection();
				System.out.println(con);
				DBConn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		

	}

}
