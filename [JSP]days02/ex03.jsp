<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includevariable.jspf" %>
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
<!-- 
p 505) 2.4 HTTP 각 방식별 구현 메소드
HTTP는 GET, POST, HEAD , PUT, DELETE 방식 지원
일반적으로 웹에서 사용되는 지원 방식 : GET, POST
get 방식 서블릿 요청 : doGet()
post 방식 서블릿 요청 : doPost()

get, post 방식 서블릿 요청 : service() 
-->
<!-- 브라우저 / 주소창 http://localhost/days02/servletmethod.do 요청 -> get방식 -->
<a href="<%= contextpath %>/days02/servletmethod.do">링크태그로 요청</a> <!-- a태그는 get방식  -->
<br>
<form action="<%= contextpath %>/days02/servletmethod.do" method="get">
<input type="submit" value="서블릿 get방식으로 요청"/>
</form>

<form action="<%= contextpath %>/days02/servletmethod.do" method="post">
<input type="submit" value="서블릿 post방식으로 요청"/>
</form>

<hr>
<!-- p506  서블릿 로딩과 초기화 -->
<a href="<%= contextpath %>/days02/lifecycle.do">서블릿 라이프사이클</a>
</body>
</html>