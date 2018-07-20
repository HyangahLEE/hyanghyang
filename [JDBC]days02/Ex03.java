package days02;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.Scanner;

import com.util.DBConn;

public class Ex03 {

	public static void main(String[] args) {
		
			
			//prop.config ���������� ���ڿ��������� �о�ͼ� ����...
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
		
		//���Ǿ��(sql)�� ������ ����� �����ϴ� ��ü�� statement
		//

	}

}
