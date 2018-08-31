<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
name : ${param.name} <br>
age : ${param.age} <br>
address : ${param.address}<br>
tel : ${param.tel}<br>

<input type="button" value="done" />
<form action="ex01.jsp">
<input type="submit" value="back" />
</form>
</body>
</html>