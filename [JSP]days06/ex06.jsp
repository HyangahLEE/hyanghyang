<%@page import="java.net.URL"%>
<%@page import="java.io.InputStreamReader"%>
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
 <!-- p131 -->
<%
  String resourcePath = "/days06/ex01.jsp";
char[] buff = new char[128];
int len = -1;
 URL url = application.getResource(resourcePath);
 try(InputStreamReader br = new InputStreamReader(url.openStream(), "UTF-8")){
	 while((len=br.read(buff)) != -1){
		 out.print(new String(buff, 0 , len));
	 }
 }catch(Exception ex){	 
	 out.println(">익셉션 발생 : " + ex.toString());			 
 }

%>


</body>
</html>