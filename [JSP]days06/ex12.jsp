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

  p146 응답 상태 코드별로 에러 페이지 지정하자.
  1. web.xml
  2. error-page 태그 사용
  
  p149 정리 
  
  404 : 요청한 url 처리하기 위한 자원 존재x
  500 : 서버 내부 에러(jsp 예외)
  503 : 서버가 일시적으로 서비스 제공 못함.(서버 과부하)
  200 : 요청이 정상적으로 처리
  307 : 임시로 페이지를 리다이렉트함.
  401 : 권한 허용 x
  400 : 클라이언트의 요청이 잘못된 구분


</body>
</html>