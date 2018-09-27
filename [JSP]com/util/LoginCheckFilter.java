package com.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//인증(권한 x)
public class LoginCheckFilter implements Filter {
		
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request; //다운캐스트 필요
		System.out.println("> LoginCheckFilter.doFilter()"+httpRequest.getRequestURI() );
		HttpSession session =  httpRequest.getSession(false);// 없으면 생성한다.
		boolean login = false;
		if(session != null) {
		
			 if(session.getAttribute("member") != null ) {
					login = true; //인증 받았다.
				}
		}
		if(login) {//로그인 o
			chain.doFilter(request, response);//다음페이지 넘김
			
		}else {//로그인 x
			
			//원래 가고자하는 페이지를 기억공간에 저장하기 위해 session에 넣어줌(cookie도 사용가능)
			session.setAttribute("originalUrl", httpRequest.getRequestURI());
			
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;//***
			httpServletResponse.sendRedirect("/days14/member/ex10_logon.jsp");
			/*RequestDispatcher dispatcher = request.getRequestDispatcher("/days14/member/ex10_logon.jsp");
			dispatcher.forward(request,response);*/
		}
		
		
		
	}

	
	@Override
	public void destroy() {
		
		
	}

}
