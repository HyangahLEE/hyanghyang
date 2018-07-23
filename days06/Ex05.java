package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.util.DBConn;

public class Ex05 {

	public static void main(String[] args) {

		String sql = " { call up_insertDept(?,?,?) } ";
		Connection con = null;
		CallableStatement cstmt = null;
		int cnt = 0;

		try {
			con = DBConn.getConnection();
			//Ʈ����� ó���ϱ�
			//1) ����Ŀ�� - false ó��
			con.setAutoCommit(false);
			
			// #1�� ó��
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 70);
			cstmt.setString(2, "�ѹ���");
			cstmt.setString(3, "����");
			cnt = cstmt.executeUpdate();
			System.out.println("> �ѹ��� : " + cnt);
			
			// # 2�� ó��
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 70);
			cstmt.setString(2, "������");
			cstmt.setString(3, "����");
			cnt = cstmt.executeUpdate();
			System.out.println("> ������ : " + cnt);
			
			con.commit();// 1���� 2���� ��� ���� ���� ������ �Ǹ� commit
						
			cstmt.close();
			DBConn.close();
						
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
