package days09;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.Cookies;


@WebServlet("/days09/ex08_logon.do")
public class Ex08Logon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Ex08Logon() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		 String pwd = request.getParameter("pwd");
		 
		 HttpSession session =  request.getSession();//없으면 만들어라
		 
		 if(id.equals("dlgiddk20") && pwd.equals("1234")){
			 //세션
			 session.setAttribute("auth", "관리자");
			 session.setAttribute("member", new Member(id,pwd,"VVIP"));
			 response.sendRedirect("ex08_default.jsp");	
			 
		 }else if(id.equals("py1234")&& pwd.equals("4321")){
			 session.setAttribute("auth", "일반사용자");
			 session.setAttribute("member", new Member(id,pwd,"VIP"));
			 response.sendRedirect("ex08_default.jsp");
		 }else{
			 response.sendRedirect("ex08_default.jsp?error");
			 
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
