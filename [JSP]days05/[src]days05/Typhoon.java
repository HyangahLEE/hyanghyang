package days05;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Typhoon
 */
@WebServlet("/days05/typhoon.do")
public class Typhoon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Typhoon() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		
		System.out.printf("> empno : %s, ename : %s\n", empno, ename);
		
		//response.sendRedirect("/days05/ex02_typhoon.jsp");
		//response.sendRedirect("ex02_typhoon.jsp");
		/*
		String url = String.format("ex02_typhoon.jsp?empno=%s&ename=%s",empno, URLEncoder.encode(ename, "UTF-8"));
		response.sendRedirect(url);
		*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_typhoon.jsp");
		dispatcher.forward(request, response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
