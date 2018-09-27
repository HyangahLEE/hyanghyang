<%@page import="com.util.Cookies"%>
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
<!-- p256 객체 접근 
	EL cookie 객체 : <쿠키이름, Coookie객체> 맵(map)
	auth hyang
	cookie.auth ==	cookie["auth"]
-->

<%
/* Cookie cookie = new Cookie("auth","hyang");
response.addCookie(cookie); - 쿠키생성*/
Cookie cookie =  Cookies.createCookie("auth","hyang");
response.addCookie(cookie);

cookie =  Cookies.createCookie("id","dlgiddk20");
response.addCookie(cookie);

cookie =  Cookies.createCookie("name","이향아");
response.addCookie(cookie);
%>
<a href="ex04.jsp">ex04.jsp</a>
</body>
</html>
