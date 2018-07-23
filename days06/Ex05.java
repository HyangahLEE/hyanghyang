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
			//트랜잭션 처리하기
			//1) 오토커밋 - false 처리
			con.setAutoCommit(false);
			
			// #1번 처리
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 70);
			cstmt.setString(2, "총무부");
			cstmt.setString(3, "서울");
			cnt = cstmt.executeUpdate();
			System.out.println("> 총무부 : " + cnt);
			
			// # 2번 처리
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 70);
			cstmt.setString(2, "영업부");
			cstmt.setString(3, "대전");
			cnt = cstmt.executeUpdate();
			System.out.println("> 영업부 : " + cnt);
			
			con.commit();// 1번과 2번이 모두 오류 없이 수행이 되면 commit
						
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
