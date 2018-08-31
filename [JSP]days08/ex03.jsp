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
<!-- p205 쿠키 
1. 쿠키(cookie) : [웹브라우저]가 [클라이언트pc에] 파일 형태로 보관하는 데이터 (자바스크립트)
2. 상태관리
***3. [웹 서버]는 쿠키를 이용해서 [웹브라우저]에게 정보를 전송할 수 있다. 
4. 웹서버에 요청이 일어 날 때 마다 쿠키도 웹서버로 전송한다 . 
5. p206 그림 9.1 쿠키 동작방식 이해
	 ex) 주소창입력 -> 요청         -> 웹서버
				<- 응답(+쿠키) <- 
		[] -> 요청(+쿠키)
		쿠키가 삭제 되기 전까지 웹서버에 요청할 때마다 쿠키전송
6. 쿠키의 구성
	1) 이름 2)값 3)유효기간 4)도메인 5)경로
7. 쿠키 생성
 Cookie 클래스
 Cookie  cookie = new Cookie("쿠키이름","쿠키값");
 response.addCookie(cookie);
-->
</body>
</html>
