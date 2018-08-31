package days01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//클래스 -> 서블릿 규약 -> 서블릿 
// [서블릿 규약]
//1. 접근지정자 무조건 public
//2. httpServlet 상속
//3. get방식으로 요청 doGet()
//	 post방식으로 요청 doPost()
// 	 get/post방식 모두 요청 service() 오버라이딩 구현
public class NowServlet extends HttpServlet {

	public String getNow(){
		return new Date().toLocaleString();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("> NowServlet.doGet()");
		response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html; charset=UTF-8");
		//> page 지시자의 content속성과 같은의미..
		
		Date now = new Date();
		String name = "홍길동";
		int age = 20;
		String today = getNow();
		
		PrintWriter out = response.getWriter(); // 응답하라(보내라는 객체(out)에 보낸다.)
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("<style>");
		out.println("</style>");
		out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>");
		out.println("<script>");
		out.println("$(document).ready(function(){");
		out.println("	");
		out.println("});");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Now : "+ now.toLocaleString()+ "  </h3>");
		out.println("<h3> Name : "+ name  +"  </h3>");
		out.println("<h3> Age : "+ age  +"  </h3>");
		out.println("<hr>");
		out.println("<h3> Today : "+ today +"  </h3>");
		out.println("<h3> Today : "+ getNow() +" </h3>");
		out.println("</body>");
		out.println("</html>");
	}

	/*@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("> NowServlet.doPost()");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("> NowServlet.service()");
		doGet(request, response);
	}
*/
}
