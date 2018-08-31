<%@page import="com.util.Cookies"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String auth = null;
Cookies cookies = new Cookies(request);
if(cookies.exists("auth")){
	auth =cookies.getValue("auth");
}else{
	//로그인 한 후 공지사항 사용하세요
	//ex02_defalut.jsp
	
	out.println("<script>");
	out.println("alert('로그인 하셔야합니다.');");
	out.println("location.href=\"ex02_default.jsp\";");
	out.println("</script>");
	
	return;
	/* out.close(); */
	
}
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
<h3>공지사항</h3>
<ol>
	<li>Lorem ipsum dolor sit amet.</li>
	<li>Illum eligendi repudiandae labore nihil?</li>
	<li>Soluta optio quidem magni sunt?</li>
	<li>Corporis odio voluptate voluptates illum.</li>
	<li>Corporis libero voluptate maiores quae.</li>
	<li>Aliquid aperiam similique distinctio quis!</li>
	<li>Reiciendis odio eveniet similique labore.</li>
	<li>Accusantium laboriosam dolores consectetur excepturi.</li>
	<li>Illum cum facere voluptas eius.</li>
	<li>Expedita tempore excepturi quisquam veniam!</li>
</ol>
</body>
</html>
