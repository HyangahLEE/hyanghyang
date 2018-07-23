package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.util.DBConn;

public class Ex03 {

	public static void main(String[] args) {
		// 회원가입 할 때 ID 중복체크하는 프로시저를 만들어서 
		// up_idcheck
		//			1) id  		in
		// 			2) result		out  1(사용가능) & -1(사용불가능)
		// ID 사용여부 출력하는 자바 테스트
		// EMP 테이블에 EMPNO(ID)
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("> 중복 체크할 empno(ID) 입력 :  ");
		empno = sc.nextInt();
		
		Connection con = DBConn.getConnection();
		String sql = " { call up_idcheck(?,?) } ";
		CallableStatement cstmt = null;
		try {
			
			cstmt = con.prepareCall(sql);
		    cstmt.setInt(1, empno);
			
			//oracle.jdbc.OracleTypes.INTEGER
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			//실행			
			cstmt.executeQuery();
			int result = (int) cstmt.getObject(2); //out매개변수를 담아서result에~
			if(result ==0) {
				System.out.println("사용 가능한 id입니다.");
			}else {
				System.out.println("이미 존재하는 ID입니다.");
			}
			cstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


/*
 create or replace procedure up_idcheck
(
    pid in emp.empno%type
    , presult out number
)
is
begin
   select count(*) into presult   -- 1
   from emp
   where empno = pid;
end;
 */