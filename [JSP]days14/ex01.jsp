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
<!-- p 308  [JSTL URL 처리 태그]
1. c:url
2. c:redirect 태그
-->
<c:redirect url="ex02.jsp">
	<c:param name="seq" value="100"></c:param>
	<c:param name="user" value="hyang"></c:param>
</c:redirect>
<hr>
<%-- <% response.sendRedirect("/day14/ex02/jsp"); %> --%>
<c:url value="ex02.jsp" var="test"></c:url>
<c:url value="ex02.jsp" var="testUrl">
	<c:param name="seq" value="100"></c:param>
	<c:param name="user" value="hyang"></c:param>
</c:url>

<ul>
	<li><a href="${ test }">ex02.jsp</a></li>
	<li><a href="${ testUrl }">ex02.jsp</a></li>
	<li><a href="ex02.jsp?seq=100&user=hyang">ex02.jsp</a></li>
</ul>
</body>
</html>
