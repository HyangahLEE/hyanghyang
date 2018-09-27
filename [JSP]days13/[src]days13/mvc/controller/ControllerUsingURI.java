package days13.mvc.controller;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import days13.mvc.command.CommandHandler;
import days13.mvc.command.NullHandler;

//MVC Controller 서블릿
public class ControllerUsingURI extends HttpServlet {

	
	
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");//프로퍼티 파일 읽어옴
		Properties prop = new Properties();
		String configFilePath = getServletContext().getRealPath(configFile);
		try(FileReader fis = new FileReader(configFilePath)) {
			prop.load(fis);
		} catch (IOException e) {
				throw new ServletException(e);
		}
		Iterator keyIter = prop.keySet().iterator(); //프로퍼티 키값
		while (keyIter.hasNext()) {
			String command = (String) keyIter.next();
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler)handlerClass.newInstance(); //그 값으로 인스턴스 생성
				commandHandlerMap.put(command, handlerInstance);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
			
		}System.out.println(this.commandHandlerMap.size()+"/"+this.commandHandlerMap.get("/hello.do"));
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
	
	
	//<커맨드, 핸들러인스턴스> 매핑정보 저장
	private Map<String,CommandHandler> commandHandlerMap = new HashMap<>();
	//hello HelloHandler
	// Hellohandler handler = Map.get(hello)
		
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getRequestURI(); //  
		System.out.println(command);		
	
		/*if(command.indexOf(request.getContextPath()) ==0) {// jspPro/days13/ex01.jsp
			command = command.substring(request.getContextPath().length());// '/days13/ex01.jsp'
		}	*/	
	
		CommandHandler handler = commandHandlerMap.get(command);//키값 받아서 설정
			
		if(handler==null) {
			handler = new NullHandler();
			
		}
		String viewPage = null;
		try {
			
			viewPage = handler.process(request, response);//처리
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		if(viewPage !=null) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			
		}
		
	}
	
	
	
}
