<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String name= request.getParameter("name");
String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<form action="ex03.jsp">
	adress : <input type="text" name="address"/><br>
	tel : <input type="text" name="tel"/>
		  <input type="submit" value="next" />
		  
		  <input type="hidden" name="name" value="<%=name %>" />
		  <input type="hidden" name="age" value="<%=age %>" />
</form>
<form action="ex01.jsp">
<input type="submit" value="back" />
</form>

</body>
</html>