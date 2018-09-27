<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String id = request.getParameter("h_id");
if(id==null){
	response.sendRedirect("ex01.jsp");
	return;
}
String name =request.getParameter("name");
%>
<%
String url = request.getHeader("referer");//어느 url을 거쳐서 왔는지 확인***
%>
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
> url : <%= url %><br>
> EL url : ${header.referer }<br>
> EL url : ${header.REFERER }<br>

> id: ${param.h_id }  <br>
> name : ${param.name } <br>
</body>
</html>
