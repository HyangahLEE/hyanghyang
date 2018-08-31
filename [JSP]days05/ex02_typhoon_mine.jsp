<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String empno = request.getParameter("empno");
String ename = request.getParameter("ename");
%>
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
<h3>Typhoon</h3>
empno : <%= empno%><br>
ename : <%= ename%><br>
<hr>
empno :${param.empno }<br>
ename : ${param.ename }<br>
</body>
</html>