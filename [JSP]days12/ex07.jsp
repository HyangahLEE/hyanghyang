<%@page import="days12.Thermometer"%>
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
<!-- p266 EL에서 객체의 메서드 호출 -->
<% Thermometer t = new Thermometer();
request.setAttribute("t", t);
%>
${t.setCelsius("서울",27.3) }
서울 온도 : 섭씨 ${ t.getCelsius("서울") }도/ 화씨 ${ t.getFahernheit("서울")  }
<br>
정보  ${t.info }
</body>
</html>
