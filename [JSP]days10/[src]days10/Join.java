package days10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.ConnectionProvider;

/**
 * Servlet implementation class Join
 */
@WebServlet("/day10/joinMember.do")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Join() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberid = request.getParameter("memberid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	
		Member m = new Member();
		m.setMemberid(memberid);
		m.setPassword(password);
		m.setName(name);
		m.setEmail(email);
		
		String sql = " insert into member values(?,?,?,?) ";
		PreparedStatement pstmt = null;
		
		try (Connection conn = ConnectionProvider.getConnection()){
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==1) {
				HttpSession session = request.getSession();
				session.setAttribute("just", m);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null)try {	pstmt.close();	} catch (SQLException e) {	e.printStackTrace();	}		
			response.sendRedirect("T1.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
