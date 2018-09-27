<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
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
<%-- 
c:if test="문자열" 	TRUE
	 test="<%= %>"  TRUE
	 test=${ }		TRUE
 --%>
<%-- ${empty param.n } --%>
 <!-- 흐름제어 :if문 -->

<c:set var="result" value="짝수"></c:set>
  <c:if test="${param.n mod 2 eq 1}">
	<c:set var="result" value="홀수"></c:set>
 </c:if>
 
 <form action="">
 정수 : <input type="text" name="n" value="${param.n }"/>
 </form>
 <div id="demo">
 
	<c:if test="${!empty param.n}">
	${ result }
 </c:if>
 </div>
</body>
</html>
