<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("UTF-8");

String empno = request.getParameter("empno");
String ename = request.getParameter("ename");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
   
});
</script>
<style>
</style>
</head>
<body>
<h3>ex02_typhoon.jsp</h3>
empno : <%= empno %><br>
ename : <%= ename %><br>
<hr>
empno : ${ param.empno }<br>
ename : ${ param.ename }<br>
</body>
</html>