<%@page import="org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setAttribute("name","hyang");
%>

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
<!-- JSTL 변수선언 -->
<%--  <c:set var="name" value="<%=request.getParameter(\"name\") %>"></c:set> --%> 
<c:set var="name" value="hyang"></c:set>
<c:set var="name" value="${param.name }"></c:set>
<%-- > name : ${requsetScope.name }<br> --%>
> name : ${ name }<br>

id = ${ id="hyang" }<br><!-- EL 값을 할당하는 코딩 + 출력도 한다!! -->
>id =${id }

<!-- P266 -->
\${expr }
</body>
</html>
