<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includevariable.jspf" %>
<%
String name = "이향아";
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
<!-- 변수 지원하는 JSTL 태그 -->
<c:set var="vname" value="<%=name %>"></c:set>
name : ${vname} <!-- EL 문법 -->
<hr>
contextPath = <%=contextpath %>
<!-- <img src="/jspPro/images/item01.jpg" alt="" /> ***절대경로 주세욥!contextroot기준!! 
<img src="request.getContextPath()/images/item01.jpg" alt="" /> -->
<!-- 
p 52 JSP 페이지의 구성요소 
1. 디렉티브(directive) == 지시자
	3가지 : page, taglib(p292), include
2. 스크립트 : 스크립트릿, 표현식, 선언부
3. 					표현언어(EL)
표현언어 
기본 객체
정적 데이터
표준 액션 태그 (asp : 접두사가 붙어있는 태그)
커스텀 태그 / JSTL - 사용자들이 필요한 태그를 만든것을 표준화 시켜 모든 사용자가 공용할 수 있도록 

***
JSTL을 사용하는 이유 (목적)
1. 스크립트릿 [코딩을 줄이]고 더욱 [간결]하고 더욱 [이해]하기 쉽기 때문에 스크립트 릿을 사용하지 않고 JSTL을 사용 (유지보수 용이)
2. JSTL 라이브러리 다운로드
	http://search.maven.org -> jstl 1.2.jar
-->
</body>
</html>