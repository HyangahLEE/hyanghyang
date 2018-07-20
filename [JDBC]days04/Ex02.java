package days04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {
	public static void main(String[] args) {
		// [ PreparedStatement ]
		/*
		1. Shared Pool 에서 sql질의에 대한 구문 검사를한다(*Parsing).
		2. *Execute plan 구문 해석 후 어떻게 처리할지 실행계획을 잡는다. (처리속도가 나옴)
		3. *Fetch(실행)한 후 결과물얻어냄 
		4. Data Buffer (Library) Cache에서 결과물을 올려놓고(기억공간) sql문으로 결과물을 날려줌
		
		>> pasing결과와 execute plan을 그대로 사용하게 됨으로 수행속도를 향상시킬 수 있다. 
		but insert같이 매개변수가 필요한 쿼리에는 바인딩 변수를 사용함으로써 동일하게 처리
		*/
		
		//DEPT 테이블 insert 수행...
		Scanner sc = new Scanner(System.in);
		System.out.printf("> deptno, dname, loc input? ");
		int deptno = sc.nextInt();
		String dname = sc.next();
		String loc = sc.next();
		//
		//String sql=String.format("insert into dept values(%d,'%s','%s')", deptno, dname, loc);
		// ? 바인딩변수
		String sql = "insert into dept values (?, ?, ?)"; // ''따로 안붙음
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		//
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql); // 캐시에 올려놔서 준비시켜놔라
			
			// ?,?,? 바인딩 변수에 대한 매개변수 값 설정 코딩. (java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 1)
			pstmt.setInt(1, deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);

			cnt = pstmt.executeUpdate(); // 입력되는 바인딩 변수 값을 가지고 실행해야 하기 때문에 setString 에서 변수값을 설정함
			if(cnt == 1)
				System.out.println(" 새로운 부서 추가 성공!");
			else System.out.println(" 새로운 부서 추가 실패ㅜㅜ");
			pstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("> 마무리코딩 <");
		}
	}
}


/*
ResultSet rs = null;
rs.next();
rs.previous;// 그 전 레코드로 가라
rs.first(); // bof 다음 (첫번째 레코드)
rs.last(); //eof전으로 가라 (마지막레코드)


rs.close();
*/