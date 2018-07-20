package days02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConn;

public class Ex05 {

	public static void main(String[] args) {
		//쿼리의 결과집합을 가지는 객체가 [ ResultSet ]
		
		String sql  = "select * from dept";
		
		Connection con = DBConn.getConnection();
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			/*-> BOF
			 * 10	ACCOUNTING	NEW YORK \\ rs[1] , rs["컬럼명"], rs.get자료형( 컬럼명 )
			 * 	
				20	RESEARCH	DALLAS
				30	SALES	CHICAGO
				40	OPERATIONS	BOSTON
			 * ->EOF
			 *  
			 *
			 boolean rs.next();//  커서를  다음 레코드로 이동해라 (데이터가 있는지 없는지 t/f)
			 boolean rs.next();T
			 boolean rs.next();T
			 boolean rs.next();T
			 boolean rs.next();FALSE
			  */
			
			int deptno;
			String dname, loc;
			while (rs.next()) {
				// 첫 ~마지막 레코드 읽기
				
			//	int deptno = Integer.parseInt( rs[1] );
			//	int deptno = rs.getInt(0);
				deptno = rs.getInt("deptno"); //1
				dname = rs.getString("dname"); //2
				loc = rs.getString("loc"); //3
				//
				System.out.printf("%d\t%s\t%s\n",deptno, dname, loc);
			}
			
			// close***************************중요!!
			rs.close();
			stmt.close();		
			DBConn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		

		
		

	}

}
