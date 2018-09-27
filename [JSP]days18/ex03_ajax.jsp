<%@page import="java.util.Date"%>
<%@ page trimDirectiveWhitespaces="true"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
 	//비동기적 처리 ex03_ajax.jsp 호출...
 	Thread.sleep(3000);
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	
	Date now = new Date();
	String ajax_res = String.format("> 안녕하세요. 서버 ajax처리된 %s님 ~ %s", name, now.toLocaleString());
%>
<%= ajax_res %>

