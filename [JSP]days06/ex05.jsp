<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo"%>
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

<!-- 
..이클립스 툴 자동 설정 경로
C:\Class\JspClass\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\jspPro\ -->

<!-- 배포
C:\apache-tomcat-8.5.32\webapps\jspPro\ -->

 <%= application.getRealPath("/") %>

<br>
<%= application.getRealPath("/days05/ex01.jsp") %>

</body>
</html>