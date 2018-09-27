package days16.replyboard;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionProvider;

public class Edit extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?num=3
			int num = Integer.parseInt(request.getParameter("num"));
			ReplyBoardDTO dto = null;
			Connection conn = null;
			try {
				conn = ConnectionProvider.getConnection();
				ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
				dto = dao.selectOne(conn, num);
				//if(dto != null) {}				
			} catch (Exception e) {
				System.out.println("> Write.doPost() : "+e.toString());
			}finally {
				if(conn !=null) {try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}
			}
			request.setAttribute("dto", dto);
		//포워딩
			RequestDispatcher dispatcher =  request.getRequestDispatcher("edit.jsp");
			dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//입력된 새글 또는 답글 DB저장
		//새글 또는 답글 공통
		ReplyBoardDTO dto = new ReplyBoardDTO();
		dto.setNum(Integer.parseInt(request.getParameter("num")));
		dto.setContent(request.getParameter("content"));
		dto.setEmail(request.getParameter("email"));
		dto.setIp(request.getRemoteAddr());
		dto.setPass(request.getParameter("pass"));
		dto.setWriter(request.getParameter("writer"));
		dto.setSubject(request.getParameter("subject"));
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
			int result = dao.edit(conn, dto);
			
			if(result ==1) {
				response.sendRedirect("list.do");
			}
			
		} catch (Exception e) {
			System.out.println("> Edit.doPost() ");
			e.printStackTrace();
		}finally {
			
			
		}
		
		
		
	}

	
	
}
