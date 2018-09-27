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
public class ControllerUsingFile extends HttpServlet {

	
	
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
			
		}
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
	// Hellohandler hadler = Map.get(hello)
		
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1단계 http요청 get/post
		//2단계 요청분석 ?cmd=xxx
		String command = request.getParameter("cmd");
		
		//3단계 모델을 사용하여 요청한 기능 수행 - CommandHandler 인터페이스를 구현한 클래스
		CommandHandler handler = commandHandlerMap.get(command);
		System.out.println(handler);
		if(handler==null) {
			handler = new NullHandler();
		}
		String viewPage = null;
		try {
			//4단계, request, session에 처리 결과를 저장
			viewPage = handler.process(request, response);
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		if(viewPage !=null) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			
		}
		
	}
	
	
}
