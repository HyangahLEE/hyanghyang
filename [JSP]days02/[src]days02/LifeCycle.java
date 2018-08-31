package days02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> doGet() 호출됨");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> doPOST() 호출됨");
	}

	@Override
	public void destroy() {
		System.out.println("> destroy() 호출됨");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("> init() 호출됨");
	}

	
	
}
