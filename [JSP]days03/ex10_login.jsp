<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String id = request.getParameter("memberId");
if(id.equals("dlgiddk20")){
	//로그인 성공
	response.sendRedirect("ex05.jsp");
}
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
아이디 다시 확인 !! 로그인 실패!!<br>
<a href="ex09.jsp">다시 로그인 페이지로 이동</a>
</body>
</html>