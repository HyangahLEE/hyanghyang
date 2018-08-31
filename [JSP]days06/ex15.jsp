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

<<%-- jsp:include page="ex15_sub.jsp"></jsp:include> --%>

content 부분 출력...<br>
content 부분 출력...<br>
content 부분 출력...<br>
content 부분 출력...<br>

<jsp:include page="ex15_sub.jsp" flush = "true"></jsp:include> 
<!-- flush = "true" 전 거를 모두 플러시 시키고 포함한다. -->



<!-- 
  [chapter 7]
  p155 페이지 모듈화와 요청 흐름 제어
  1. 웹사이트 전체 공통적 모듈
     WebContent 폴더 layout 폴더 생성
                   css 폴더
  2. days06 폴더(게시판) 공통 모듈.
                  layout폴더.
                  css 폴더
  
  ex15_sub.jsp
 -->

</body>
</html>