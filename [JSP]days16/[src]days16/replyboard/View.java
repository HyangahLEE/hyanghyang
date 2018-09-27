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
import com.util.JdbcUtil;

public class View extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
			
			conn.setAutoCommit(false);
			dao.updateReadcount(conn,num); //조회수 증가
			ReplyBoardDTO dto = dao.selectOne(conn,num);
			
			request.setAttribute("dto", dto);
			
			RequestDispatcher dispatcher =  request.getRequestDispatcher("view.jsp");
			dispatcher.forward(request, response);
			
			conn.commit();
		} catch (Exception e) {
			System.out.println("> List.doGet() : "+e.toString());
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println(">> View(conn.rollback)");
				e1.printStackTrace();
			}
		}finally {
			if(conn !=null) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	
}
