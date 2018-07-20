package days04;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.util.DBConn;

public class Ex04 {

	public static void main(String[] args) {
		// [ emp 검색 ]
		// 1. 부서번호 검색
		// 2. 사원명 검색
		// 3. job 검색
		// 검색 조건, 검색어 입력. 
		int searchCondition ;
		String searchWord;
		Scanner sc = new Scanner(System.in);
		System.out.println("> 검색조건, 검색어 입력 :");
		searchCondition = sc.nextInt();
		searchWord = sc.next();
		//
		String sql= "select deptno, empno, ename, job, hiredate from emp ";
		switch (searchCondition) {
		case 1:
			sql += " where deptno = ?";
			break;
		case 2:
			sql += " where ename like ?";
			searchWord = '%'+searchWord+'%';//*******
			
			break;
		case 3:
			sql += " where job = ?";
			break;
		case 4:
			sql += " where hiredate between ? and ?";
			break;
		}
		//
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql); // 캐시에 올려놔서 준비시켜놔라
			pstmt.setString(1, searchWord);
			
			rs= pstmt.executeQuery();
			
			if( rs.next()) {
				do {
					
					int deptno = rs.getInt(1);
					int empno = rs.getInt(2);
					String ename = rs.getString(3);
					String job = rs.getString(4);
					Date hiredate = rs.getDate(5);
					
					System.out.printf("%d\t%d\t%s\t%s\t%tF\n", deptno,empno,ename,  job,hiredate);
								
				} while (rs.next());
				}else {
					
					System.out.println("> 사원이 존재하지않습니다.");
				}
			
			rs.close();
			pstmt.close();
			DBConn.close();
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("> 마무리코딩 <");
		}
	}

}
