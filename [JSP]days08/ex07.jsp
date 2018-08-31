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
<a href="ex07_setCookie.jsp">쿠키생성</a>
<a href="ex07_getCookie.jsp">쿠키확인</a>
<a href="ex07_editCookie.jsp">쿠키수정</a>
<a href="ex07_deleteCookie.jsp">쿠키삭제</a>
<!-- p208 표 9.1 Cookie 클래스가 제공하는 메서드 
1. getName() : 쿠ㅜ키이름 얻어오는 메서드
2. getValue() : 쿠키값 얻어오는 메서드 
3. setValue() : 쿠키값을 설정하는 메서드 
4. getDomain(String value)   : 도메인 얻어오는 메서드 
   setDomain(String pattern) : 쿠키가 전송될 서버의 도메인 지정
5. getPath() : 쿠키 전송 경로 얻어오는 메서드
   setPath(String url) : 쿠키 전송 경로 지정
6. setMaxAge(int expiry) : 쿠키 유효시간(초단위) 지정,  *** 음수를 입력할 경우 웹므라우저를 닫을 때 쿠키 삭제
   getMaxAge() : 쿠키의 유효시간

-->
</body>
</html>
