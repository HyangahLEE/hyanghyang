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
<%-- <%
String[] empnos = request.getParameterValues("empno");
%>
<h3>삭제할 사원 번호 </h3>
<ol>
	<%
	for(int i=0; i<empnos.length; i++){
	%>
	<li><%=empnos[i] %></li>
	<%	
	}
	%>
</ol> --%>
<!-- ------------------------------------- -->
<h3>삭제할 사원번호 - EL/JSTL</h3>
<ol>
<!-- 
String[] empnos = request.getParameterValues("empno"); 
${paramValues.empno}
-->
<c:forEach items="${paramValues.empno}" var="empno">
	<li>${ empno }</li>
</c:forEach>
</ol>
</body>
</html>
