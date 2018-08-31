package days09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.Cookies;


@WebServlet("/days09/ex08_logout.do")
public class Ex08Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Ex08Logout() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		String auth = (String)session.getAttribute("auth");
		session.invalidate();

		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert(\"["+auth+"]\"로그아웃 완료');");
		out.println("location.href=\"ex08_default.jsp\";");
		out.println("</script>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
