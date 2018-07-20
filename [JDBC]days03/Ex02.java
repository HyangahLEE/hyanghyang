package days03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {

	public static void main(String[] args) {
		/*
			int deptno=10;

			Scanner sc = new Scanner(System.in);
			System.out.println("부서번호 입력");
			deptno = sc.nextInt();

		String sql= "select d.deptno, dname,e.empno, ename, job, mgr, hiredate,sal ";
				sql += " from emp e join dept d on e.deptno = d.deptno ";
				sql += String.format("  order by deptno", deptno );



			Connection con = DBConn.getConnection();
			try (Statement stmt = con.createStatement()){
				ResultSet rs = stmt.executeQuery(sql);

				while (rs.next()) {
				System.out.printf("%d\t %s\n",rs.getInt(1),rs.getString(2));




				while (rs.next()) {

					System.out.printf("  %d\t %s\t %s\t %d\t %s\t %d\n"
							,rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6)
							,rs.getString(7).substring(0, 10),rs.getInt(8));	
				}
				}
				rs.close();
				DBConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 */


		
		String sql = " select deptno, dname from dept ";
		
		
		
	

		Connection con = DBConn.getConnection();

		try (Statement stmtdept = con.createStatement()) {
			ResultSet rsdept = stmtdept.executeQuery(sql);
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
