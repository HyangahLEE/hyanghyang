package days06;

import java.sql.Connection;
import java.sql.SQLException;

import com.util.ConnFactory;
import com.util.DBConn;

public class Ex07 {

	public static void main(String[] args) {
		//	jdbc.properties
		// JDBC config file
		
		//1. Connection ��ü
		//Connection con = DBConn.getConnection();
		
		//2. XXXFactory Ŭ���� - XXX�� ���� �� �ִ� ����
		
		//�̱���
		//connFactoty conn = new ConnFactory xxxxxxxxx
		ConnFactory factory = ConnFactory.getDefaultFactory(); //new �� ������ ���� ��δ� �Ȱ��� ���忡�� ����Ÿ� �������ڴ�.
		Connection con;
		try {
			con = factory.createConnection(); //== getConnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		// [ Connection Pool ] // �̸� ������ ����ŭ �̸� �����Ͽ� Ŀ�ؼ��� �����ְ� �ٽù�ȯ�޾Ƽ� Ŀ�ؼ��� ����
		// ���� : ��� ���� �ð��� ���� �� �ִ�. 
		
	}

}
