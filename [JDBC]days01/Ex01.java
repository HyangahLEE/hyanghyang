package days01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {
		//[ ***JDBC*** ] : Java DataBase Connectivity -�ڹٿ��� ��� �����ؼ� ��� �� �� �ִ� ���*
		//-> �����ͺ��̽��� ���� �� �۾��� �ϱ����� �ڹ� ǥ�� �������̽�.
		// ���� ȸ�翡�� �����ϴ� ����̹��� �־�� ���� ��� �����ϴ� �������̽��� ���� ���� ���, ���� �޼ҵ� ��� ����. 
        // �������̽��� ����ϸ� �������� , Ȯ�强 �±� 
		// JDBC ����̹� - ������ OREACLE, MYSQL, MS SQL ���� �������̽��� �������ִ� ���� �� ��Ʋ�� �̷�¸�
		
		//  JAVA���� ���α׷�
		// 			|
		//	����۾� ���� �������̽�
		//			|
		//    JDBC ����̹�
		
		
		
		/*	[ DBMS�������� ����̹� ]
		 *  -> �̵���� ���� �ʿ� ���� 
		 *  	���� �ڹٷ� ����� ������, DBMS�� ���� ȣ���ϴ� ����̹��� JDBC����̹��� �����ͺ��̽� ���� �ϴ��� �����Ƹ� ������.
		 * 
		 *  
		 * */
		
		
		/*  ����Ŭ����  
		 * 1. JDBC Driver �ٿ�ε� - ojdbc6.jar
		 * 2. jre/lib/ext ������ �־������ ���� Ŭ���� �н� ���� ���ص� �ν��̵ȴ�. 
		 * 3. jdbc driver �ε� : Class.forName()
		 * 4. Ŀ�ؼ� ��üConnection(��� ����� ������ ���� ��ü) ������ :   DriverManager.getConnection
		 * * * */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String userid = "scott";
		String password = "tiger";
		//ojdbc6.jar�ν� ���ϸ� .�ڿ� ��ü �ȳ��� ~
		//oracle.jdbc.driver.OracleDriver - ��ҹ��� ����!!
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//����̹� ����
			Connection con = DriverManager.getConnection(url, userid, password); //���ᰴü ������
			System.out.println( con );
			con.close(); //��񿬰� ����
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
