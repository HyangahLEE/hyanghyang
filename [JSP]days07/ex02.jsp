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
<form action="ex02_ok.jsp" method="get">
	<table border="1" style="width: 400px">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" value="admin"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" name="password" value="1234"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" value="관리자"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" value="admin@naver.com"></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit">
		<input type="reset">
		</td>
	</tr>
	</table>
</form>
</body>
</html>
