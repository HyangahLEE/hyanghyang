<%@ page trimDirectiveWhitespaces="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<!-- P 50 
1. JSP 코드 작성의 주요 목적은 웹 브라우저에 보요줄 HTML 문서 생성.
2. 파일 다운로드 구현
	- xml과 같은 다른 종류의 문서를 생성해서 응답.
3. JSP 코드 부분
	ㄱ. 설정 부분 (line1)
		*contentType - 생성할 페이지에대한 문서 정보
		1) JSP 페이지가 생성하는 문서의 타입(종류)  <page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8">
		2) jsp 페이지에서 사용할 커스텀 태그 
		3) jsp 페이지에서 사용할 자바 클래스 지정. <page import="java.util.Date">
	ㄴ. 응답 생성 부분 -->
<%-- jsp 주석처리
<%@ page %> page 지시자 ? jsp 페이지에 대한 설정정보..
<%@ page 속성="속성값" 속성="속성값" %> --%>

<!-- p52/ 53 -->
JSP 에서 제공하는 지시자
1. page 지시자  : jsp 페이지에 대한 설정정보를 지정. jsp가 생성하는 문서의 타입, 출력버퍼의 크기, 에러페이지 등 jsp에서 필요로 하는 정보를 생성.
2. taglib 지시자 : jsp 페이지에서 사용할 태그 라이브러리 지정
3. include 지시자 : jsp페이지의 특정 영역에 다른 문서를 포함시킨다.
</body>
</html>