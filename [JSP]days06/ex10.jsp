<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page errorPage = "/error/viewErrorMessage.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<!-- 에러처리하는 페이지로 이동 -->

<%

	 String name = request.getParameter("name"); //null
	 int age = Integer.parseInt(request.getParameter("age"));
%>	 
	 
	 name : <%= name%> <br>
	 age : <%= age %><br>





</body>
</html>