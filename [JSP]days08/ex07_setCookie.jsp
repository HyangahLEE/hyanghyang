<%@page import="com.util.Cookies"%>
<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String cname= request.getParameter("cname");

if(cname != null ){
	/* 
	String cval = URLEncoder.encode(request.getParameter("cval"),"utf-8");
	Cookie cookie =new Cookie(cname,cval); //쿠키 생성
	cookie.setPath("/days08");
	response.addCookie(cookie); //쿠키 저장
	 */
	Cookies cookies = new Cookies(request);
	Cookie cookie = cookies.createCookie(cname, request.getParameter("cval"),"/",-1);// 브라우저 닫으면 쿠키 삭제 / 0 쿠키 즉시삭제
	response.addCookie(cookie); //쿠키 저장
	
	response.sendRedirect("ex07.jsp");
	
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
<form>
1. 생성할 쿠키 이름 : <input type="text" name="cname" id="cname" autofocus="autofocus" /><br>
2. 생성할 쿠키 값 : <input type="text" name="cval" id="cval" /><br>
<input type="submit" value="쿠키생성" /><br>
</form>
</body>
</html>
