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
<!-- p311 c:out 태그 : String, java.io.Reader
escapeXml=""
default=""
-->

<c:set value="${param.seq }" var="seq"></c:set>
<%-- <c:set value="100" var="seq"></c:set> --%>
seq : <c:out value="${seq }" escapeXml="" default="1"></c:out><br>
seq : ${seq }
</body>
</html>
