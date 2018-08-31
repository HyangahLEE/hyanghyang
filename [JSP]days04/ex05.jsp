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
<!-- ex01.jsp -?submit -> action="ex02.jsp" -> sendRedirect ex03 || ex04 -->
<!-- ex01.jsp -?submit -> ex05.do -> sendRedirect ex03 || ex04 -->
<!-- 					SendPage.java 서블릿 클래스 선언 -->
<form action="ex05.do" method="post">
ID : <input type="text" name="id" value="관리자" />
</form>
</body>
</html>