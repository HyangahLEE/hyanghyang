<%@page import="days09.Member"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<h3>ex10_logon.jsp</h3>

<form action="<%=request.getContextPath() %>/days14/member/ex10_logon_ok.jsp"><!--Ex02Logon.java  -->
	<!--  <form action="ex02_logon.jsp"> -->
 아이디 : <input type="text" name="id" value="dlgiddk20"/><br>
 비밀번호 : <input type="password" name="pwd" value="1234"/><br>
 <input type="submit" value="로그인" />
 <input type="button" value="회원가입" />
 <br>
<a href="<%=request.getContextPath() %>/days14/ex10_default.jsp">Home</a> 
</form>
</body>
</html>
