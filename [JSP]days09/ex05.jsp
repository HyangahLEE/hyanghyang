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
<%
 /* 
 String empno = (String)request.getAttribute("empno");
 String ename = (String)request.getAttribute("ename"); */
 
 String empno = (String)session.getAttribute("empno");
 String ename = (String)session.getAttribute("ename");
%>

> empno = <%= empno %><br>
> ename = <%= ename %><br>
<hr>

> empno = ${ sessionScope.empno }<br>
> ename = ${ sessionScope.ename }<br>

<hr>
<!-- scope 4가지 : page, request, session, application -->
> empno = ${ empno }<br>
> ename = ${ ename }<br>
</body>
</html>
