<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  String msg = request.getParameter("msg").toUpperCase();
  //상태코드 404, 500로 에러 페이지 지정
//p149 예외 타입별로 에러 페이지 지정하기.

// p151 에러 페이지의 우선 순위
//  page 지시자의 errorPage속성 > exception-type > error-code
  

%>


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

</body>
</html>