<%@page import="com.util.Cookies"%>
<%@page import="java.util.HashMap"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>

<%
 HashMap<String, String> member = new HashMap<>();
 member.put("dlgiddk", "1234"); //등급 : 관리자(글쓴이)
 member.put("py1234", "4321"); //등급 : 일반사용자

 String id = request.getParameter("id");
 String pwd = request.getParameter("pwd");
 
 if(id.equals("dlgiddk20") && pwd.equals("1234")){
	 response.addCookie(Cookies.createCookie("auth", "관리자", "/", -1));// -1 브라우저 닫을 때 쿠키 삭제
	 response.sendRedirect("ex02_default.jsp");	
 }else if(id.equals("py1234")&& pwd.equals("4321")){
	 response.addCookie(Cookies.createCookie("auth", "일반사용자", "/", -1));// -1 브라우저 닫을 때 쿠키 삭제
	 response.sendRedirect("ex02_default.jsp");
 }else{
	 response.sendRedirect("ex02_default.jsp?error");
	 
 }
%>
