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
<!-- p257 객체 탐색 -->

<!-- p261 empty 연산자 -->
${empty null }<br><!-- true -->
${empty "" }<br><!-- true -->
${empty 문자열길이0 }<br><!-- true -->
${empty 빈 map객체 }<br><!-- true -->
${empty 빈 컬렉션 객체 }<br><!-- true -->
</body>
</html>
