<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
 String name = request.getParameter("name");  
 int age = Integer.parseInt( request.getParameter("age") );

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
<% //1.jsp 내장객체 out 
out.append(">> 입력받은 name : "+ name +"<br>");
out.append(">> 입력받은 age  : "+ age +"<br>");
%>
<hr>
<!-- 2. 표현식 -->
	> 입력받은 name : <%=name %><br>
	> 입력받은 age  :  <%=age %><br>


<hr>
> 입력받은  name : ${param.name} <br>
> 입력받은  age  : ${param.age} <br>
</body>
</html>