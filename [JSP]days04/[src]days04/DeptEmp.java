package days04;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
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

public class DeptEmp extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		/*PrintWriter out = response.getWriter();
		String id= request.getParameter("id");
		
		String url =  id.equals("관리자") ? "ex03.jsp" : "ex04.jsp";
		response.sendRedirect(url+"?id="+URLEncoder.encode(id,"utf-8"));
		out.append("ex03");*/
		
		//1		
		String sql = " select deptno, dname from dept ";
		Connection con = DBConn.getConnection();

		ArrayList<DeptDTO> list = null;
		try (PreparedStatement stmtdept = con.prepareStatement(sql)) {
			ResultSet rsdept = stmtdept.executeQuery();
			list = new ArrayList<>();
			while (rsdept.next()) {

				int deptno = rsdept.getInt(1);
				String dname = rsdept.getString(2);
				DeptDTO dto = new DeptDTO(deptno, dname);
				list.add(dto);
				System.out.printf("\n>[%d]\t [%s]\n", deptno, dname);
			}
			rsdept.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//2
		
		//3
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ex11.jsp");
		dispatcher.forward(request, response);
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
