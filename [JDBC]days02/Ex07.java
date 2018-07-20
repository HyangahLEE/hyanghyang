package days02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import com.util.DBConn;

public class Ex07 {

	public static void main(String[] args) {
		//dept 50 ������ ���� �߰� (insert)
		// ��. ������ �μ���ȣ(50) �ش��ϴ� ���ڵ� �˻�..
		String sql = "select deptno, dname, loc from dept ";
		sql += " where deptno = 50";
	
		
		
		try (Connection con = DBConn.getConnection();
				Statement stmt =	con.createStatement();	){
			
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.printf("%d // %s // %s", deptno, dname, loc);
			}else {
				System.out.println("> 50�� �μ� x");
			}
			
			rs.close();
		
			// 
			// ���� , ���� �ϱ� ���� �˻�..
			//	��.	 50  �μ��� �Ǵ� ������ ���� (update)
			
			String u_dname , u_loc;
			Scanner sc = new Scanner(System.in);
			System.out.printf("> ������ �μ���, ���� �Է�? ");
			// ������ ��
			u_dname = sc.next();
			u_loc = sc.next();
			
			sql = "update dept ";
			sql += " set dname='"+ u_dname+"', loc='"+u_loc+"'";
			sql += " where deptno = 50 ";
			
			sql = String.format("update dept set dname = '%s', loc = '%s' where deptno =%d"
					, u_dname, u_loc,50);
			//System.out.println(sql); -����Ȯ��
			
			//con.isClosed(); Ȯ��.. false
			
			int cnt = stmt.executeUpdate(sql);
			if(cnt == 1) { 
				System.out.println("> 50�� �μ� ���� �����Ϸ� ");
			}
			
			
//			��.	 50  �μ� ���� (delete)
			/*
			sql = "delete from dept where deptno = 50";
			
			int cnt = stmt.executeUpdate(sql);
			if ( cnt ==1 ) System.out.println("> 50�� �μ� ���� �Ϸ� !!");*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		

	}

}
