package days08;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBConn;

import days02.DeptDTO;
import days03.EmpDTO;

public class TestDeptEmp_mine extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pdeptno = request.getParameter("deptno");
		int deptno = pdeptno ==null? 10 : Integer.parseInt(pdeptno);
		
		String sql_dept = " select * from dept ";
		String sql_emp = " select * from emp where deptno= ? ";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs_dept = null;
		ResultSet rs_emp = null;
		ArrayList<DeptDTO> list_dept = new ArrayList<>();
		ArrayList<EmpDTO> list_emp = null;
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql_dept);
			rs_dept = pstmt.executeQuery();
			DeptDTO dto_dept = null;
			while (rs_dept.next()) {
				dto_dept = new DeptDTO();
				dto_dept.setDeptno(rs_dept.getInt("deptno"));
				dto_dept.setDname(rs_dept.getString("dname"));
				list_dept.add(dto_dept);
				
			}
			//
			pstmt = con.prepareStatement(sql_emp);
			pstmt.setInt(1, deptno);
			rs_emp = pstmt.executeQuery();
			EmpDTO emp_dto = null;
			if(rs_emp.next()) {
				list_emp = new ArrayList<>();
				do {
					emp_dto = new EmpDTO();
					emp_dto.setEmpno(rs_emp.getInt("empno"));
					emp_dto.setEname(rs_emp.getString("ename"));
					list_emp.add(emp_dto);				
				} while (rs_emp.next());		
			}
			
			//
			request.setAttribute("list_dept", list_dept);
			request.setAttribute("list_emp", list_emp);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/days08/ex01_mine.jsp");
			dispatcher.forward(request, response);
			
			
			} catch (Exception e) {
			System.out.println("> ExDeptEmp.doGet() : "+ e.toString());
		}finally {
			if(rs_dept != null) { try{ rs_dept.close();}catch(Exception e){}}
			if(rs_emp != null) { try{ rs_emp.close();}catch(Exception e){}}
			if(pstmt != null) { try{ pstmt.close();}catch(Exception e){}}
			if(con != null) { try{ DBConn.close();}catch(Exception e){}}
		}
		
		
		
		}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	
}
