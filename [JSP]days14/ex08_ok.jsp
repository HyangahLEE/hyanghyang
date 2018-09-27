<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
//필터 응용
//1. 사용자 인증
//2. 캐싱 필터
//3. 자원 접근에 대한 로깅
//4. 응답 데이터 변환
//5. 공통 기능 수행..***
//request.setCharacterEncoding("utf-8");%>
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
String name = request.getParameter("name");
String email = request.getParameter("email");

%>
이름 : ${param.name }<br>
이메일 : ${param.email }<br>
</body>
</html>
