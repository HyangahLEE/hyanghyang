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
<h3>회원가입</h3>
<form action="joinMember.do">
<table border="1">
<tr>
	<td>MemberID</td>
	<td><input type="text" name="memberid" value="yhdja22"/>
	<input type="button" value="ID중복체크" /></td>
</tr>
<tr>
	<td>Password</td>
	<td><input type="text" name="password" value="2555"/></td>
</tr>
<tr>
	<td>name</td>
	<td><input type="text" name="name" value="이향긔"/></td>
</tr>
<tr>
	<td>Email</td>
	<td><input type="text" name="email" value="yhdja22@naver.com" /></td>
</tr>
<tr>
	<td colspan="2">
	<input type="submit" value="저장-" />
	<input type="button" value="취소" /></td>
</tr>
</table>
</form>
</body>
</html>
