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
	/* $("input[type='button']").click(function(){
		
		
	}) */
$(":button").click(function(){
	//유효성 검사 
	$("form").attr("action","/typhoon.do").attr("method","post").submit();		
	
	});
});
</script>
</head>
<body>
<a href="http://localhost/typhoon.do">서블릿 호출</a>
<a href="/ex02_typhoon.jsp">서블릿 호출</a> <!-- /days05/typhoon.do -->
<a href="ex02_typhoon.jsp">서블릿 호출</a>
<form action="">
 empno : <input type="text" id="empno" name="empno" value="7566" autofocus="autofocus"/><br>
 ename : <input type="text" id="ename" name= "ename" value="관리자" /><br>
 <input type="button" value="send" />
</form>
</body>
</html>