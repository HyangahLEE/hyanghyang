<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
 String code = request.getParameter("code");
 String viewPageUrl = null;
 if(code.equals("a")){
	 viewPageUrl = "/days06/ex01.jsp";
	 
	 
 }else if(code.equals("b")){
	 viewPageUrl = "/days06/ex02.jsp";
	 
 }else if(code.equals("c")){
	 viewPageUrl = "/days06/ex03.jsp";	 
 }
 
%>

<jsp:forward page="<%= viewPageUrl %>"></jsp:forward>