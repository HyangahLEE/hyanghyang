package days16.replyboard;

import java.io.IOException;
import java.sql.Connection;import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionProvider;

public class Delete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//<a href="delete.do?num=${ dto.num }">글삭제</a>
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass = request.getParameter("pass");
		int num = Integer.parseInt(request.getParameter("num"));
		
	try {
			Connection conn = ConnectionProvider.getConnection();
			ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
			int result = dao.delete(conn, num,pass);
			System.out.println(result);
			if(result == 1) {
				response.sendRedirect("list.do");
			}
			
		} catch (Exception e) {
			System.out.println("> Delete.doPost() : ");
			e.printStackTrace();
		}finally {
			
			
		}
		
	}

	
	
}
