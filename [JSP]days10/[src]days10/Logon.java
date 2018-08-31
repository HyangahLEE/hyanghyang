package days10;

import java.io.IOException;
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


@WebServlet("/days10/ex02_logon.do")
public class Logon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Logon() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member member = null;
		String sql = " select *  from member where memberid = ? and password= ? ";
		String url = "ex01.jsp";
		try (Connection conn = ConnectionProvider.getConnection()){
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("memberid"));
			pstmt.setString(2, request.getParameter("password"));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
					member = new Member();
					member.setMemberid(rs.getString("memberid"));
					member.setPassword(rs.getString("password"));
					member.setName(rs.getString("name"));
					member.setEmail(rs.getString("email"));
					
					HttpSession session = request.getSession();
					session.setAttribute("auth", member);
			}else {
				
				url +="?error=0009";
				
			}
			
		} catch (Exception e) {
			System.out.println("> ViewMemberList doget() : "+ e.toString());
		}finally {
			if(rs != null)	try {	rs.close();		} catch (SQLException e) {	e.printStackTrace();	}
			if(pstmt !=null)try {	pstmt.close();	} catch (SQLException e) {	e.printStackTrace();	}
			response.sendRedirect(url);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
