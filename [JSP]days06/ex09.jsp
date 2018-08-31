<%@page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
   
});
</script>
<style>
</style>
</head>
<body>
<!-- p 136 리스트 5.14 코딩 -->

<%
   Enumeration<String> attrEnum = application.getAttributeNames();
   while(attrEnum.hasMoreElements()){
      String name = attrEnum.nextElement();
      Object value = application.getAttribute(name);
%>
   application 속성 : <b><%= name %></b> = <%= value %><br>
<%      
   }
%>
</body>
</html>