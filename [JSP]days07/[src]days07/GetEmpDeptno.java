package days07;

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

public class GetEmpDeptno extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//deptno=10 Emp ArrayList<EmpDTO>
		String pdeptno = request.getParameter("deptno");
		
		int deptno = pdeptno == null ? 10 : Integer.parseInt(pdeptno);
	
		String sql = " select * from emp ";
		sql += " where deptno = ? ";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> list = null;
		 
		try{
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			EmpDTO dto =null;
			if(rs.next()) {
				list = new ArrayList<>();
				do {
					dto = new EmpDTO();
					dto.setComm(rs.getDouble("comm"));
					dto.setDeptno(rs.getInt("deptno"));
					dto.setEmpno(rs.getInt("empno"));
					dto.setEname(rs.getString("ename"));
					dto.setHiredate(rs.getString("hiredate"));
					dto.setJob(rs.getString("job"));
					dto.setSal(rs.getDouble("sal"));
					list.add(dto);
				} while (rs.next());
				
			}
			// 1. 넘길 data를 request객체에 setAttribute() 저장
			request.setAttribute("list", list);
			request.setAttribute("size", list==null? 0:list.size());
			//2. 포워딩
			RequestDispatcher dispatcher = request.getRequestDispatcher("/days07/ex03_el.jsp");
			dispatcher.forward(request, response);
			
			//localhost/getEmpDeptno.do 요청 ->GetEmpDetpno서블릿-> ex03.jsp
			
			
			rs.close();
			pstmt.close();
			DBConn.close();
		}catch(Exception e){ 
			System.out.println("> GetEmpDeptno.doGet() \n" +  e.toString());
		}finally {
			if(rs!=null) try {	rs.close();	} catch (Exception e) {	}
			if(pstmt !=null) try {	rs.close();	} catch (Exception e) {	}
			if(con!=null) try {	DBConn.close();	} catch (Exception e) {	}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	
}
