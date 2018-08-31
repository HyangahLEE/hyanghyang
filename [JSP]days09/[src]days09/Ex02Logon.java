package days09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Cookies;

public class Ex02Logon extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		 String pwd = request.getParameter("pwd");
		 
		 if(id.equals("dlgiddk20") && pwd.equals("1234")){
			 response.addCookie(Cookies.createCookie("auth", "관리자", "/", -1));// -1 브라우저 닫을 때 쿠키 삭제
			 response.sendRedirect("ex02_default.jsp");	
		 }else if(id.equals("py1234")&& pwd.equals("4321")){
			 response.addCookie(Cookies.createCookie("auth", "일반사용자", "/", -1));// -1 브라우저 닫을 때 쿠키 삭제
			 response.sendRedirect("ex02_default.jsp");
		 }else{
			 response.sendRedirect("ex02_default.jsp?error");
			 
		 }
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
