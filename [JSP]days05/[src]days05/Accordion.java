package days05;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBConn;

import days03.EmpDTO;

public class Accordion extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    public Accordion() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		/*
		ArrayList<EmpDTO> empList_10 = new ArrayList<>();
		EmpDTO emp1 = new EmpDTO();
		emp1.setEmpno(7782); emp1.setEname("ClARK");
		empList_10.add(emp1);
		
		EmpDTO emp2 = new EmpDTO();
		emp2.setEmpno(7839); emp2.setEname("KING");
		empList_10.add(emp2);
		
		EmpDTO emp3 = new EmpDTO();
		emp3.setEmpno(7934); emp3.setEname("MILLER");
		empList_10.add(emp3);
		
		Hashtable<Integer,ArrayList<EmpDTO>> ht = 
				new Hashtable<>();
		int deptno = 10;
		ht.put(deptno, empList_10);
		
		deptno = 20;
		ArrayList<EmpDTO> empList_20 = new ArrayList<>();
		
		
		emp1.setEmpno(7369); emp1.setEname("SMITH");
		empList_20.add(emp1);
		
		emp2 = new EmpDTO();
		emp2.setEmpno(7566); emp2.setEname("JONES");
		empList_20.add(emp2);
		
		emp3 = new EmpDTO();
		emp3.setEmpno(7902); emp3.setEname("FORD");
		empList_20.add(emp3);
		ht.put(deptno,empList_20);
		*/
		
		/*
		Hashtable<String, ArrayList<EmpDTO>>
		ArrayList<EmpDTO> empList = null;
		String name = "kenik";
				
		// 포워딩
		request.setAttribute("deptList", deptList);
		request.setAttribute("empList", empList);
		request.setAttribute("name", name);
		*/
		/*
		Hashtable<String, ArrayList<EmpDTO>> ht = 
				new Hashtable<>();
		ArrayList<EmpDTO> empList = null;
		EmpDTO dto = null;
		//start
			String vsql = "select deptno, dname from dept";
			
						
			Connection con = DBConn.getConnection();
						
			
			String sql = " select deptno, ename ,empno from emp ";
			
			try {
				Statement stmt = con.createStatement();
				ResultSet rsemp = stmt.executeQuery(sql);
				while( rsemp.next()) {					
					int deptno = rsemp.getInt(1);
					int empno = rsemp.getInt(2);
					String ename = rsemp.getString(3);
					dto = new EmpDTO();
					dto.setDeptno(deptno);
					dto.setEmpno(empno);
					dto.setEname(ename);
					empList.add(dto);
					
					
				}
				rsemp.close();
				stmt.close();
				DBConn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		//end
		request.setAttribute("ht", ht);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ex03_accordion.jsp");
		dispatcher.forward(request, response );*/
		
		//넣는 '순서대로', Map(key,value) -entry
		LinkedHashMap<String, ArrayList<EmpDTO>> ht =
				new LinkedHashMap<>();
		//Hashtable<String, ArrayList<EmpDTO>> ht =
		//		new Hashtable<>();
		
		// start
		String sql = "select deptno, dname from dept";
		Connection con = null;
		PreparedStatement pstmtDept , pstmtEmp ;
		ResultSet rsDept , rsEmp ;
		try {
			con = DBConn.getConnection();
			pstmtDept = con.prepareStatement(sql);
			rsDept = pstmtDept.executeQuery();
			while(rsDept.next()) {
				int deptno = rsDept.getInt(1); // deptno
				String dname = rsDept.getString(2); // dname
				System.out.printf("[%d(%s)]\n", deptno, dname);
				// deptno 부서에 해당하는 사원 정보 출력
				String sqlEmp = "select * from emp where deptno=?";
				pstmtEmp = con.prepareStatement(sqlEmp);
				pstmtEmp.setInt(1, deptno);
				rsEmp = pstmtEmp.executeQuery();
		
				ArrayList<EmpDTO> empList =  new ArrayList<>();
		        if( rsEmp.next() ) { 
		        	do {
		        		EmpDTO dto = new EmpDTO(); 
						dto.setEmpno( rsEmp.getInt("empno") );
						dto.setEname( rsEmp.getString("ename"));
						dto.setMgr(rsEmp.getInt("mgr"));
						dto.setJob(rsEmp.getString("job"));
						dto.setHiredate(rsEmp.getString("hiredate"));
						dto.setSal(rsEmp.getDouble("sal"));
						dto.setComm(rsEmp.getDouble("comm"));
						empList.add(dto);
		        	}while( rsEmp.next() );
		        }
				 
				rsEmp.close();
				pstmtEmp.close();
				
				ht.put(dname+"("+deptno+")", empList);
			} // while rsDept.next()
			rsDept.close();
			pstmtDept.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// end
		request.setAttribute("ht", ht);
		
		/*RequestDispatcher dispatcher 
		   = request.getRequestDispatcher("ex03_accordion.jsp");*/
		RequestDispatcher dispatcher  = request.getRequestDispatcher("/days07/ex04_days05_ex03_el.jsp");
		dispatcher.forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}