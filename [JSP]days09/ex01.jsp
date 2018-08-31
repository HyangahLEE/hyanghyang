<%@page import="java.net.URLEncoder"%>
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
<%
	Cookie[] cookies= request.getCookies();
	if(cookies !=null && cookies.length >0){//쿠키가 존재한다면
		for(int i=0; i<cookies.length; i++){
			Cookie cookie= cookies[i];
%>
			<input type="checkbox" name="ckb_cookie" value="<%= cookies[i].getName() %>"/>
			<%=cookie.getName() %> = <%= URLEncoder.encode(cookie.getValue(),"utf-8") %><br>
			
<%
		}
	}else{
%>
쿠키가 존재하지 않습니다.
<%
		}
%>
</body>
</html>
