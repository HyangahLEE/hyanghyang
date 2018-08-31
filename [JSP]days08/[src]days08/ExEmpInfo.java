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

public class ExEmpInfo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pempno = request.getParameter("empno");
		int empno = Integer.parseInt(pempno);
		
		String sql_emp = " select * from emp where empno= ? ";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs_emp = null;
		
		try {
			
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql_emp);
			pstmt.setInt(1, empno);
			rs_emp = pstmt.executeQuery();
			
			EmpDTO emp_dto = null;
			if(rs_emp.next()) {
			/*	while(rs_emp.next()) {*/
					emp_dto = new EmpDTO();
					emp_dto.setEmpno(rs_emp.getInt("empno"));
					emp_dto.setEname(rs_emp.getString("ename"));
					emp_dto.setHiredate(rs_emp.getString("hiredate"));
					emp_dto.setJob(rs_emp.getString("job"));
					emp_dto.setMgr(rs_emp.getInt("mgr"));
					emp_dto.setSal(rs_emp.getDouble("sal"));
					emp_dto.setComm(rs_emp.getDouble("comm"));
				/*}*/
			}
			
			//
			request.setAttribute("emp_dto", emp_dto);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/days08/ex02.jsp");
			dispatcher.forward(request, response);
			
			
			rs_emp.close();
			pstmt.close();
			DBConn.close();
			
			} catch (Exception e) {
			System.out.println("> ExEmpInfo.doGet() : "+ e.toString());
		}finally {
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
