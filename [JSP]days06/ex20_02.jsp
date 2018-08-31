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

> name = <%=request.getParameter("name") %><br>
> age = <%=request.getAttribute("age") %><br>
> addr = <%= request.getParameter("addr") %><br>
> tel = <%= request.getParameter("tel") %><br>

</body>
</html>