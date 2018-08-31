package days05;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/days05/typhoon.do")*/
//@WebServlet("typhoon.do")
public class Typhoon_mine extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Typhoon_mine() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*request.setCharacterEncoding("utf-8");
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		System.out.printf("> empno : %s, ename: %s \n",empno, ename );
		
		//sendRedirect 일때는 새로 요청이 되기때문에  request, response 값 유지xxx
		//response.sendRedirect("/days05/ex02_typhoon.jsp");
		response.sendRedirect("ex02_typhoon.jsp");
		String url = String.format("ex02_typhoon.jsp?empno=%s&ename=%s", empno, URLEncoder.encode(ename, "UTF-8"));
		response.sendRedirect(url);*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_typhoon.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
