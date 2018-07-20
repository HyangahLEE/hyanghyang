package days02;

import java.sql.Connection;
import java.sql.Statement;

import com.util.DBConn;

public class Ex04 {

	public static void main(String[] args) {
		// 50 영업부 서울
		
		//*디가 연동되고 끝나면 close해야한다.
		Connection con = null;
		//Statement stmt = null;
		try {
			con = DBConn.getConnection();
			int deptno = 50;
			String dname = "영업부";
			String loc = "서울";
			
			//stmt = con.createStatement(); //stmt 객체 생성
			//stmt.close();			
			
			
			// 따옴표 주의 !! 
			String sql= String.format("insert into dept values (%d, '%s','%s')",deptno, dname, loc);
			//String sql = "insert into dept values ('"+ deptno +"','" +dname+"','"+loc"')";
			//String sql= String.format("insert into dept values (seq_deptno.nextval, '%s','%s')",deptno, dname, loc);

			
			
			//자동으로 객체 소멸
			try(Statement stmt = con.createStatement()) {
				//	stmt.executeQuery(sql); -> select 문 사용때만 사용!!!
				//sql문을 사용하기 위해 stmt 객체사용
				int cnt =  stmt.executeUpdate(sql); //-> insert, update, delete(DML문사용)
				
				//영향받은 레코드의 수 
				if( cnt == 1) {
						System.out.println("> 새로운 부서 추가 성공!!");
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
