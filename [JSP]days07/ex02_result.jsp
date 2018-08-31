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

<jsp:useBean id="info" class="days06.MemberInfo" scope="request"/>
아이디 : ${info.id }<br>
이름 :  ${info.name }<br>
비번 :  ${info.password }<br>
이메일 :  ${info.email }<br>
등록일 :  ${info.registerDate }<br>

<%-- 
아이디 : <jsp:getProperty property="id" name="info"/><br>
이름 :  <jsp:getProperty property="name" name="info"/><br>
비번 :  <jsp:getProperty property="password" name="info"/><br>
이메일 :  <jsp:getProperty property="email" name="info"/><br>
등록일 :  <jsp:getProperty property="registerDate" name="info"/><br> --%>
</body>
</html>
