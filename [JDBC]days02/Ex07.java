package days02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import com.util.DBConn;

public class Ex07 {

	public static void main(String[] args) {
		//dept 50 영업부 서울 추가 (insert)
		// ㄱ. 수정할 부서번호(50) 해당하는 레코드 검색..
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
				System.out.println("> 50번 부서 x");
			}
			
			rs.close();
		
			// 
			// 수정 , 삭제 하기 전에 검색..
			//	ㄴ.	 50  부서명 또는 지역을 수정 (update)
			
			String u_dname , u_loc;
			Scanner sc = new Scanner(System.in);
			System.out.printf("> 수정할 부서명, 지역 입력? ");
			// 생선자 구
			u_dname = sc.next();
			u_loc = sc.next();
			
			sql = "update dept ";
			sql += " set dname='"+ u_dname+"', loc='"+u_loc+"'";
			sql += " where deptno = 50 ";
			
			sql = String.format("update dept set dname = '%s', loc = '%s' where deptno =%d"
					, u_dname, u_loc,50);
			//System.out.println(sql); -쿼리확인
			
			//con.isClosed(); 확인.. false
			
			int cnt = stmt.executeUpdate(sql);
			if(cnt == 1) { 
				System.out.println("> 50번 부서 정보 수정완료 ");
			}
			
			
//			ㄷ.	 50  부서 삭제 (delete)
			/*
			sql = "delete from dept where deptno = 50";
			
			int cnt = stmt.executeUpdate(sql);
			if ( cnt ==1 ) System.out.println("> 50번 부서 삭제 완료 !!");*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		

	}

}
