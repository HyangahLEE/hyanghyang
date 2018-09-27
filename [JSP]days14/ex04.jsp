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
a태그 설명
<br>
&lt;a href="ex01.jsp"&gt; ex01.jsp&lt;/a&gt;


<hr>
<!--  p313 c:catch 태그  -->
<%-- 
<c:catch var="ex">
	//로직처리코딩
	//로직처리코딩
	//로직처리코딩
	//로직처리코딩 *오류!!
	//로직처리코딩
</c:catch>
<c:if test="${not empty ex }">
	//예외처리
</c:if> --%>

<c:catch var="ex">
	name 파라미터의 값 = <%=request.getParameter("name") %><br>
	<% if(request.getParameter("name").equals("test")) {%>
	${param.name }은 test입니다.
	<% } %>
</c:catch>
<p>
<c:if test="${not empty ex }">
	익셉션 발생 : <br>
	${ex }
</c:if> 
</p>
</body>
</html>
