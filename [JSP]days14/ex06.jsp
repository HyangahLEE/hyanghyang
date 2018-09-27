<%@page import="days12.FormatUtil"%>
<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<!-- groupingUsed 3자리 마다 콤마 -->
<fmt:formatNumber type="currency" currencySymbol="원" value="123456" groupingUsed="true" var="money"/>
<% Date now = new Date(); 
%>
<%-- <c:set value=<%=now %> var="now"/> --%>
<!-- 정적 메서드를 EL 호출하는 방법 2  -->
<%-- 1. now : ${FormatUtil.date(now,'yyyy-MM-dd') }<br> --%>
2. now : <fmt:formatDate value="${now }" type="date" dateStyle="default"/><br>
3. now : <fmt:formatDate value="${now }" type="time" dateStyle="default"/><br>
4. now : <fmt:formatDate value="${now }" type="both" dateStyle="default"/><br>
<hr />
<% String today ="2018-09-06" ;%>
<fmt:parseDate value="<%=today %> pattern ="yyyy-MM-dd" var="t"/>
</body>
</html>
