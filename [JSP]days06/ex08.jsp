<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

page 영역에 저장된 name 값 : <%=pageContext.getAttribute("name") %>
<br>
request 영역에 저장된 value 값 : <%=request.getAttribute("value") %>
<br>
session 영역에 저장된 orderid 값 : <%=session.getAttribute("orderid") %>
<br>
application 영역에 저장된 version 값 : <%=application.getAttribute("version") %> 

</body>
</html>