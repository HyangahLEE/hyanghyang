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
<!-- p545 [ 필터(Filter) ] 
	
	1. 그림 19.1 필터의 기본 구조
	
	[브라우저 ]-> 요청 -> 
					A 요청 필터(인증/권한)		서버자원(??.jsp/서블릿)
					include 지시자
					B 응답 필터(압축, 암호화)
			<- 응답 <-


-->
<form action="ex08_ok.jsp" method="post">
이름 : <input type="text" name="name" value="이향아"/><br>
이메일 : <input type="text" name="email" value="dlgiddk20@daum.net"/><br>
<input type="submit" />
</form>
</body>
</html>
