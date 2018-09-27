<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<!-- p333 -->
<c:set var="sum" value="0"></c:set>
 <c:set var="data" value=""></c:set>
 
	<c:forEach begin="1" end="${ param.n }" var="i" varStatus="status">
		<c:set var="data" value="${data}+${i }"/>
		<c:set var="sum" value="${ sum+i }"/>
	</c:forEach> 
<form action="">
n : <input type="text" name="n" value="${ param.n }"/>
 </form>
 <div id="demo">
 <c:set var="len" value="${fn:length(data) }"></c:set>
 <c:if test="${!empty param.n }">
		${fn:substring(data,1,len) } = ${ sum }
		</c:if>
  </div>
<%--  2.
<c:set var="sum" value="0"></c:set>
 <c:set var="data" value=""></c:set>
	<c:forEach begin="1" end="${ param.n }" var="i" varStatus="status">
	<c:if test="${status.first }">
		<c:set var="data" value="${i }"></c:set>
	</c:if>
	<c:if test="${!status.first }">
		<c:set var="data" value="${data}+${i }"/>
	</c:if>
		<c:set var="sum" value="${ sum+i }"/>
	</c:forEach> 

<form action="">
n : <input type="text" name="n" value="${ param.n }"/>
 </form>
 <div id="demo">
 	<b>
 		<c:if test="${!empty param.n }">
		${data } = ${ sum }
		</c:if>
	</b>
 </div> --%>

<%-- 1.

<form action="">
n : <input type="text" name="n" value="${ param.n }"/>
 </form>
 <div id="demo">
 	<b>
 		<c:if test="${!empty param.n }">
 		<c:set var="sum" value="0"></c:set>
		<c:forEach begin="1" end="${param.n }" var="i">
		<c:if test="${i == param.n }">${i}</c:if> 
		<c:if test="${i ne param.n }">${i}+</c:if> 
		<c:set var="sum" value="${sum+i }"></c:set>
		</c:forEach>
		= ${sum }
		</c:if>
	</b>
 </div> --%>
 
 
	<%-- <c:forEach items="${컬렉션 }" var="변수명"></c:forEach> --%>
	<%-- <c:forEach begin="1" end="10" step="1" var="i" >
	${i }<br>
	</c:forEach> --%>
</body>
</html>
