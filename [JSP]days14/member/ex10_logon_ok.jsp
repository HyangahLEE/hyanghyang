<%@page import="days09.Member"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
		 String id = request.getParameter("id");
		 String pwd = request.getParameter("pwd");
		 
		 HttpSession hsession =  request.getSession();//없으면 만들어라
		 String originalUrl = (String)hsession.getAttribute("originalUrl");
		 if(originalUrl == null){
			 originalUrl = "/days14/ex10_default.jsp";
		 }
		 
		 System.out.println("원래 가고자 하는 길" + originalUrl);
		 
		 if(id.equals("dlgiddk20") && pwd.equals("1234")){
			 //세션
			 
			 hsession.setAttribute("member", new Member(id,pwd,"admin"));			
			response.sendRedirect(originalUrl);
			
		 }else if(id.equals("py1234")&& pwd.equals("4321")){
			
			 hsession.setAttribute("member", new Member(id,pwd,"user"));
			 response.sendRedirect(originalUrl);
			 
		 }else{
			 response.sendRedirect("/days14/member/ex10_logon.jsp?error");
			 
		 }
		
%>
