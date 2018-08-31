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
<!-- p241 1.6 request.getSession()을 이용한 세션 생성 
	HttpSession session 객체를 생성하는 또다른 방법
-->
<% //**** 
//()true - 세션 객체가 존재하지않으면 새로 세션객체 생성해서 반환.
// if(hs !=null) 적용 xx
HttpSession hs = request.getSession(); 

//false- 세션 객체가 존재하지않으면 새로 null 반환.
HttpSession hsession = request.getSession(false); 



%>
</body>
</html>
