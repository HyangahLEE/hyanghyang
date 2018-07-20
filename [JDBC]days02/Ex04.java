package days02;

import java.sql.Connection;
import java.sql.Statement;

import com.util.DBConn;

public class Ex04 {

	public static void main(String[] args) {
		// 50 ������ ����
		
		//*�� �����ǰ� ������ close�ؾ��Ѵ�.
		Connection con = null;
		//Statement stmt = null;
		try {
			con = DBConn.getConnection();
			int deptno = 50;
			String dname = "������";
			String loc = "����";
			
			//stmt = con.createStatement(); //stmt ��ü ����
			//stmt.close();			
			
			
			// ����ǥ ���� !! 
			String sql= String.format("insert into dept values (%d, '%s','%s')",deptno, dname, loc);
			//String sql = "insert into dept values ('"+ deptno +"','" +dname+"','"+loc"')";
			//String sql= String.format("insert into dept values (seq_deptno.nextval, '%s','%s')",deptno, dname, loc);

			
			
			//�ڵ����� ��ü �Ҹ�
			try(Statement stmt = con.createStatement()) {
				//	stmt.executeQuery(sql); -> select �� ��붧�� ���!!!
				//sql���� ����ϱ� ���� stmt ��ü���
				int cnt =  stmt.executeUpdate(sql); //-> insert, update, delete(DML�����)
				
				//������� ���ڵ��� �� 
				if( cnt == 1) {
						System.out.println("> ���ο� �μ� �߰� ����!!");
				}
			} catch (Exception e) {
					e.getStackTrace();			
			}
			
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		
	}

}
