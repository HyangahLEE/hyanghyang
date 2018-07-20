package days05;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {

	public static void main(String[] args) {
		
		String sql = "{ call UP_INSERT_DEPT(?,?) }";
		
		String pdname, ploc;
		Scanner sc = new Scanner(System.in);
		System.out.println("> dname, loc  입력 : ");
		pdname = sc.next();
		ploc = sc.next();
		//
		Connection con = DBConn.getConnection();
		//1. con.createStatement();
		//2. con.prepareStatement(sql);
		//3.
		CallableStatement cstmt = null;
		try {
			cstmt = con.prepareCall(sql);
			cstmt.setString(1, "pdname");
			cstmt.setString(2, "ploc");

			int cnt = cstmt.executeUpdate();
			if(cnt ==1) {System.out.println("부서 추가 성공");}
			else System.out.println("부서 추가 실패");
			cstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		DBConn.close();
	}

}

/*		CREATE OR REPLACE PROCEDURE UP_INSERT_DEPT
(
    pdname in dept.dname%type
    ,ploc in dept.loc%type

)IS
BEGIN
    insert into dept(deptno, dname,loc)
    values(seq_dept.nextval,pdname,ploc);
    commit;
END;
*/

/*	create sequence seq_dept
increment by 10
start with 60;*/