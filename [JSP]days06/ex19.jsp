<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  String grade = request.getParameter("grade");
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/days16.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<!-- p163 jsp param 액션태그 : 패이지에 파라미터 추가하기 -->

<%--  <jsp:include page="/layout/header.jsp">
 <jsp:param value="board" name="title"></jsp:param>
 <jsp:param value="test" name="test"></jsp:param>
</jsp:include>  --%>

<%@ include file ="../layout/header.jsp" %> 

content<br>
content<br>
content<br>
content<br>
content<br>
content<br>


</body>
</html>