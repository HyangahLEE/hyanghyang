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

@WebServlet({ "/ViewList", "/days10/T1_viewlist.do" })
public class ViewList extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ViewList() {
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		if(session.getAttribute("auth")==null) { //로그인 안했으면
			response.sendRedirect("T1.jsp");
			return;
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = null;
		Member member = null;
		String sql =null;
		
		Member s_m = new Member();
		String s_memid=s_m.getMemberid();
		if(s_memid.equals("dlgiddk20")) {
			sql= " select * from member ";
			
		}else {
			sql= " select * from member where memberid= ? ";
			
		}
		try (Connection conn = ConnectionProvider.getConnection();){
			pstmt = conn.prepareStatement(sql);			
			if(!s_memid.equals("dlgiddk20")) pstmt.setString(1, s_memid);
			rs = pstmt.executeQuery();
			if(rs.next()) {//사원이 있으면 list객체 생성
				list  = new ArrayList<>();
				do {
					member = new Member();
					member.setMemberid(rs.getString("memberid"));
					member.setPassword(rs.getString("password"));
					member.setName(rs.getString("name"));
					member.setEmail(rs.getString("email"));
					list.add(member);
					
				} while (rs.next());				
			}
			
			request.setAttribute("list", list);
			
			//
			RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_viewMemberList.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			System.out.println("> ViewMemberList doget() : "+ e.toString());
		}finally {
			if(rs != null)	try {	rs.close();		} catch (SQLException e) {	e.printStackTrace();	}
			if(pstmt !=null)try {	pstmt.close();	} catch (SQLException e) {	e.printStackTrace();	}
				
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
