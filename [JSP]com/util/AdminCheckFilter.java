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

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import days09.Member;

//인증(권한 x)
public class AdminCheckFilter implements Filter {
		
	private String grade;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.grade = filterConfig.getInitParameter("grade");
		if(this.grade == null) {
			this.grade = "admin";
		}
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request; 
		System.out.println("> AdminCheckFilter.doFilter()" + httpRequest.getRequestURI() );
		HttpSession session =  httpRequest.getSession(false);// 없으면 생성한다.
		boolean admin = false;
		Member member = (Member)session.getAttribute("member");
		
		if(member.getGrade().equals("admin")) {
			
		
			admin = true; //로그인함
				
				
			
		}
		if(admin) { //관리자 권한 o
			chain.doFilter(request, response);
			
		}else {
			
			String refererUrl = (String)httpRequest.getHeader("Referer");
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;//***
			httpServletResponse.sendRedirect(refererUrl+"?error=1004");
		}
		
		
		
		
	}

	
	@Override
	public void destroy() {
		
		
	}

}
