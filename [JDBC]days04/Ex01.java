package days04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.util.DBConn;

public class Ex01 {

	public static void main(String[] args) {
		
		String sql = " select deptno, dname from dept ";
		
		Connection con = DBConn.getConnection();
		ResultSet rsdept = null;
		try (Statement stmtdept = con.createStatement()) {
		//	ResultSet rsdept = stmtdept.executeQuery(sql);
			
		if(	stmtdept.execute(sql) ) {
			rsdept = stmtdept.getResultSet();
		}; // (boolean) resultset t/ cnt f
			while(rsdept.next()) {
			int deptno = rsdept.getInt(1);
			String dname = rsdept.getString(2);
			
			
				System.out.printf("\n>%d번부서\t [%s]\n\n",deptno,dname);
				try (Statement stmtemp = con.createStatement()) {
					
					String sql2= " select empno, ename, job, mgr ,hiredate, sal from emp where deptno = "+ deptno ;
					ResultSet rsemp = stmtemp.executeQuery(sql2);
					
					while(rsemp.next()) {
						System.out.printf(" %d\t %s\t %s\t %d\t %s\t %d\n"
								,rsemp.getInt(1),rsemp.getString(2),rsemp.getString(3),rsemp.getInt(4)
								,rsemp.getString(5).substring(0, 10),rsemp.getInt(6));	
						}


					//stmtemp.close();
					rsemp.close();
				} catch (Exception e) {
					e.printStackTrace();
				}	

			}
			
			rsdept.close();
			DBConn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		
		
	}

}


/*	Connection con = DBConn.getConnection();
//Java 트랜잭션 처리하는 메서드 
	con.setAutoCommit(false);
con.commit();
con.rollback();
con.setSavepoint();


Statement stmt ;
stmt.addBatch();
stmt.clearBatch();
stmt.executeBatch();*/