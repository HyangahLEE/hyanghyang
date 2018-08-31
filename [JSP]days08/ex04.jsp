<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<!-- ex04.jsp 요청 -->
<%
String c_name="name";
String c_value=URLEncoder.encode("이향아","utf-8");
Cookie cookie = new Cookie(c_name,c_value); //1. 쿠키생성
response.addCookie(cookie);// 2.쿠키저장
%>

> 쿠키의 이름 : <%= cookie.getName() %> <br>
> 쿠키의 값 : <%= cookie.getValue() %> <br>

<a href="ex05.jsp">ex05.jsp</a>
</body>
</html>
