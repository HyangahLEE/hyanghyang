package days05;

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

import days03.EmpDTO;


public class EmpModal extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		// 모든 사원  list 저장
		String sql = "select * from emp";
		Connection con = null;
		PreparedStatement pstmtEmp ;
		ResultSet rsEmp ;
		ArrayList<EmpDTO> list = new ArrayList<>();
		try {
			con = DBConn.getConnection();
			pstmtEmp = con.prepareStatement(sql);
			rsEmp = pstmtEmp.executeQuery();
			while(rsEmp.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEmpno(rsEmp.getInt("empno"));
				dto.setEname(rsEmp.getString("ename"));
				dto.setJob(rsEmp.getString("job"));
				dto.setHiredate(rsEmp.getString("hiredate"));
				
				list.add(dto);			
				
			}  
			rsEmp.close();
			pstmtEmp.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("list", list);
		//
		RequestDispatcher dispatcher 
		   = request.getRequestDispatcher("ex05.jsp");
		dispatcher.forward( request, response );
	}


	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
