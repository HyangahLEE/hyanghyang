package days10;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.ConnectionProvider;


@WebServlet({ "/JoinMember", "/days10/joinMember.do" })
public class JoinMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public JoinMember() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberid = request.getParameter("memberid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		
		Member member = new Member();
		member.setMemberid(memberid);
		member.setPassword(password);
		member.setName(name);
		member.setEmail(email);
		/*MemberDAO.insert(member);*/
		
		
		PreparedStatement pstmt = null;
		String sql = " insert into member values(?,?,?,?) ";
		String url ="ex01.jsp";
		
		try (Connection conn = ConnectionProvider.getConnection();){
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==1 ) {
				HttpSession session = request.getSession();
				session.setAttribute("auth", member);
			}
			
				
			//
			/*RequestDispatcher dispatcher = request.getRequestDispatcher("ex01.jsp");
			dispatcher.forward(request, response);*/
		} catch (Exception e) {
			System.out.println("> ViewMemberList doget() : "+ e.toString());
			url += "?error=0001";
		}finally {
			if(pstmt !=null)try {	pstmt.close();	} catch (SQLException e) {	e.printStackTrace();	}		
			response.sendRedirect(url);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
