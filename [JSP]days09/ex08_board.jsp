<%@page import="com.util.Cookies"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="ex08_sessioninfo.jsp" %>

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
<a href="ex08_default.jsp">Home</a>
<% if(auth!=null){ %>
	<!-- 로그인 인증 o 알반 사용자, 관리자 -->
	<a href="ex08_default.jsp">글쓰기</a>
		<% if(auth.equals("dlgiddk20")){ %>
		<!-- 로그인 인증 o 관리자 -->
		<a href="ex08_default.jsp">글수정</a>
		<a href="ex08_default.jsp">글삭제</a>
	<% } %>

<% } %>
<img src="List.do.PNG"></img>
</body>
</html>
