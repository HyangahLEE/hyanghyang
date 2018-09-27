package days13.mvc;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//MVC 패턴의 Controller
public class ControllerServlet extends HttpServlet{

	//1단계, HTTP 요청받음
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
 
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//2단계, 요청분석
		// request 객체로부터 사용자의 요청을 분석하는 코드
	String type = request.getParameter("type");
		
	//3단계, 모델을 사용하여 요청한 기능을 수행한다. 
		//사용자에 요청에 따라 알맞은 코드
	Object resultObject = null;		
	if( type == null || type.equals("greeting")) {
		resultObject="안뇽하세용";//모델 객체
	}else if(type.equals("date")) {
		resultObject = new Date();
	}else {
		resultObject= "Invalid Type";
	}
	
	//4단계, requset나 session에 처리 결과를 저장
		request.setAttribute("result", resultObject);
		
	//5단계, RequestDispatcher를 사용하여 요청에 맞는 [알맞은 뷰]로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("ex02_view.jsp");
		dispatcher.forward(request, response);
	}
	
	
}
