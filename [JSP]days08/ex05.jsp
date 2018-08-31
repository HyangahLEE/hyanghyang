<%@page import="java.net.URLEncoder"%>
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
<h3> 쿠키 목록 출력 </h3>
<%
	Cookie[] cookies= request.getCookies();
	if(cookies !=null && cookies.length >0){//쿠키가 존재한다면
		for(int i=0; i<cookies.length; i++){
			Cookie cookie= cookies[i];
%>
			<%=cookie.getName() %> = <%= URLEncoder.encode(cookie.getValue(),"utf-8") %><br>
<%
		}
	}else{
%>
쿠키가 존재하지 않습니다.
<%
		}
%>

<!--쿠키이름 JSESSIONID 존재 확인  -->
<h3> EL + JSTL 사용해서 쿠키 목록 출력</h3>
<!-- 
cookie: EL에서 사용하는 객체 
쿠키이름,쿠키값 한쌍 entry -->
<c:forEach items="${cookie }" var="entry">
${entry.key } = ${entry.value.getValue() }<br>
</c:forEach>
</body>
</html>
