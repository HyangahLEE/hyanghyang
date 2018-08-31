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

import days10.Member;


@WebServlet({ "/ViewMemberList", "/days10/viewMemberList.do" })
public class ViewMemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewMemberList() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//인증확인
		//ㄱ. 관리자 : 모든 회원 목록
		//ㄴ. 관리자 x : 자기자신 회원 +목록
		/*HttpSession session = request.getSession(false);*/
		HttpSession session = request.getSession();
		if(session.getAttribute("auth") ==null) {
			response.sendRedirect("ex01.jsp");
			return;
		}
		
		
		
		//회원목록		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = null;
		Member member = null;
		String sql =null;
		
		Member s_member = (Member)session.getAttribute("auth");
		String s_memberid = s_member.getMemberid();
		
		if( s_memberid.equals("dlgiddk20")) {
			sql = " select *  from member ";
			
		}else{
			sql = " select * from member where memberid= ? ";
		}
		
		
		try (Connection conn = ConnectionProvider.getConnection();){
			pstmt = conn.prepareStatement(sql);			
			if(!s_memberid.equals("dlgiddk20")) pstmt.setString(1, s_memberid);
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
