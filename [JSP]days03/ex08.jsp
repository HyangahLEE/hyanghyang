<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<!-- p88 요청 헤더 정보의 처리 -->
<!--    
Stirng  request.getHeader(h_name); //헤더 h_name을 이용하여 val값 가져오기
Stirng[]  request.getHeaders(h_name);
열거자  	request.getHeaderNames();
int   request.getIntHeader(h_name);
Date  request.DateHeader();
 -->
 <!-- p82 리스트 3.16 -->
 
 <%
 Enumeration<String> er = request.getHeaderNames();
 while(er.hasMoreElements()){
	 String h_name = er.nextElement();
	 String h_value = request.getHeader(h_name);
	 %>	 
	<li><%= h_name %> -<%= h_value %></li>
  <%}
 %>
</body>
</html>