package days09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Cookies;

public class Ex02Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.addCookie(Cookies.createCookie("auth","","/",0));
		/*response.sendRedirect("ex02_default.jsp");*/
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('로그아웃 완료');");
		out.println("location.href=\"ex02_default.jsp\";");
		out.println("</script>");
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
