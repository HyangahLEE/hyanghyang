<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="days12.FormatUtil"%>
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


<c:set var="kor" value="${FormatUtil.korFloor(param.kor)}"></c:set>
<c:choose>
	<c:when test="${res eq 10 ||res eq 9 }">
		<c:set var="res" value="수"></c:set>
	</c:when>
	<c:when test="${res eq 8 }">
		<c:set var="res" value="우"></c:set>
	</c:when>
	<c:when test="${res eq 7}">
		<c:set var="res" value="미"></c:set>
	</c:when>
	<c:when test="${res eq 6 }">
		<c:set var="res" value="양"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="res" value="가"></c:set>
	</c:otherwise>
</c:choose>
<form action="">
kor : <input type="text" name="kor" value="100" />
</form>
<div>
${param.kor eq null? '' : res }
</div>
<%-- 
<c:set var="kor" value="87"></c:set>
<c:set var="grade" value="수"></c:set>
<c:set var="korFr" value="${FormatUtil.korFloor(90) }"></c:set>
<c:out value="${ FormatUtil.korFloor(98) }"></c:out>
<!-- java switch  -->
<c:choose>
	<c:when test="${result ==10 ||result==9 }">
		<c:set var="result" value="수"></c:set>
	</c:when>
	<c:when test="${result ==8 }">
		<c:set var="result" value="우"></c:set>
	</c:when>
	<c:when test="${result eq 7}">
		<c:set var="result" value="미"></c:set>
	</c:when>
	<c:when test="${result ==6 }">
		<c:set var="result" value="양"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="result" value="가"></c:set>
	</c:otherwise>
</c:choose>

<div>
 ${result }
</div> --%>
</body>
</html>
