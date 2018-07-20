package days02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConn;

public class Ex05 {

	public static void main(String[] args) {
		//������ ��������� ������ ��ü�� [ ResultSet ]
		
		String sql  = "select * from dept";
		
		Connection con = DBConn.getConnection();
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			/*-> BOF
			 * 10	ACCOUNTING	NEW YORK \\ rs[1] , rs["�÷���"], rs.get�ڷ���( �÷��� )
			 * 	
				20	RESEARCH	DALLAS
				30	SALES	CHICAGO
				40	OPERATIONS	BOSTON
			 * ->EOF
			 *  
			 *
			 boolean rs.next();//  Ŀ����  ���� ���ڵ�� �̵��ض� (�����Ͱ� �ִ��� ������ t/f)
			 boolean rs.next();T
			 boolean rs.next();T
			 boolean rs.next();T
			 boolean rs.next();FALSE
			  */
			
			int deptno;
			String dname, loc;
			while (rs.next()) {
				// ù ~������ ���ڵ� �б�
				
			//	int deptno = Integer.parseInt( rs[1] );
			//	int deptno = rs.getInt(0);
				deptno = rs.getInt("deptno"); //1
				dname = rs.getString("dname"); //2
				loc = rs.getString("loc"); //3
				//
				System.out.printf("%d\t%s\t%s\n",deptno, dname, loc);
			}
			
			// close***************************�߿�!!
			rs.close();
			stmt.close();		
			DBConn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		

		
		

	}

}
