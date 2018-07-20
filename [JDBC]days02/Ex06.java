package days02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.util.DBConn;

public class Ex06 {

	public static void main(String[] args) {


		String ename, job ;
		String sal;
		Double comm;
		int empno;
		int deptno =10;
		String hiredate;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 ㄱㄱ : ");
		deptno = sc.nextInt();

		/*String sql = String.format("select deptno, empno, ename, to_char(hiredate,'yyyy/mm/dd') hiredate, job,sal , comm\r\n" + 
				"from emp\r\n" + 
				"where deptno = %d", deptno);*/
		String sql = " select deptno, empno, ename, to_char(hiredate,'yyyy/mm/dd') hiredate"
				+ ", job, to_char(sal,'$9,999.99') sal, nvl(comm,0) comm "; //********공백중요!!!!!
		sql += " from emp ";
		sql += " where deptno =%d";

		
		sql = String.format(sql, deptno);

		//System.out.println( sql );//*******쿼리확인

		/*	좋은코딩 :)
		StringBuilder sb= new StringBuilder();
		sb.append("select deptno, empno, ename, hiredate, job,sal , comm");
		sb.append("from emp");
		sb.append("where deptno = 10");
		 */
		

		try {
			Connection con = DBConn.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if(rs.next()) {
				do {
					deptno = rs.getInt("deptno"); 
					empno = rs.getInt("empno"); 
					ename  = rs.getString("ename"); 
					//hiredate = rs.getString("hiredate").substring(0, 10); 
					hiredate = rs.getString("hiredate");
					job = rs.getString("job");
					sal = rs.getString("sal");
					comm = rs.getDouble("comm");

					System.out.printf("%d\t%d\t%s\t%s\t%s\t%s\t%.2f\n",deptno, empno,ename,hiredate,job,sal,comm);
					
				}
				while (rs.next()) ;
				
			}else System.out.println("사원이 존재하지 않습니다.");

			rs.close();
			stmt.close();		
			DBConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
