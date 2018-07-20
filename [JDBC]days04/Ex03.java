package days04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConn;

public class Ex03 {

	public static void main(String[] args) {
		//[ PreparedStatement ]

		String sql = "select * from dept";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql); // ĳ�ÿ� �÷����� �غ���ѳ���
			rs= pstmt.executeQuery();
			
			if( rs.next()) {
			do {
				
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.printf("%d\t%s\t%s\n", deptno, dname, loc);
							
			} while (rs.next());
			}else {
				
				System.out.println("> �μ��� ���������ʽ��ϴ�.");
			}

			rs.close();
			pstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("> �������ڵ� <");
		}
	}

}
