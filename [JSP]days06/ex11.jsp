<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



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

<!-- p140 에러 처리 -->
<!--


 1. 익셉션 처리
2. 에러 페이지
3. 에러 상태 코드 404, 500 와 익셉션 타입별 에러페이지 지정 


-->

<%

try{
	
	 String name = request.getParameter("name"); //null
	 int age = Integer.parseInt(request.getParameter("age"));
%>	 
	 <!-- HTTP Status500 / 톰캣에 만든 에러메시지-->
	 name : <%= name%> <br>
	 age : <%= age %><br>
<% 	
}catch(Exception ex){
%>	
	예외발생 
	
	<% 
}
%>




</body>
</html>