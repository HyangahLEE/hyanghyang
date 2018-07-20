package days02;

import java.sql.Connection;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {

	public static void main(String[] args) {
		
			String hostName ;
			String SID ;
			
			String userid;
			String password;
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("> hostName, SID, userid, password ют╥б ? ");
			
			hostName = scanner.nextLine();
			SID = scanner.nextLine();
			userid = scanner.nextLine();
			password = scanner.nextLine();
			
			String url = String.format( "jdbc:oracle:thin:@%s:1521:%s", hostName, SID) ; 
		
			try {
				
				Connection con = DBConn.getConnection(url, userid, password);
				System.out.println(con);
				DBConn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		

	}

}
