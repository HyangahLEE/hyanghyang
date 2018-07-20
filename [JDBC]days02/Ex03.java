package days02;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.Scanner;

import com.util.DBConn;

public class Ex03 {

	public static void main(String[] args) {
		
			
			//prop.config 설정파일의 문자열연결정보 읽어와서 설정...
			Properties prop = new Properties();
			String path = ".\\src\\days02\\prop.properties";
			try {
				prop.load( new FileReader( path ));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			

			String hostName =prop.getProperty("hostName");
			String SID = prop.getProperty("SID");
			
			String userid = prop.getProperty("userid");
			String password= prop.getProperty("password");
			
			String url = String.format( "jdbc:oracle:thin:@%s:1521:%s", hostName, SID) ; 
		
			try {
				
				Connection con = DBConn.getConnection(url, userid, password);
				System.out.println(con);
				DBConn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		//질의언어(sql)를 가지고 명령을 수행하는 객체가 statement
		//

	}

}
