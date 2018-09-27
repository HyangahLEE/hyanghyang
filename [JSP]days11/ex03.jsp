<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String name = (String) request.getParameter("name");
String code = (String) session.getAttribute("code");
String addr = (String) request.getAttribute("addr");

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
<%-- 
요청 URI = ${ pageContext.request.getRequestURI() }<br>
요청 URL =${ pageContext.request.getRequestURL() }<br>
 --%>
<hr>
요청 URI = <%= request.getRequestURI()%><br>
요청 URL = <%= request.getRequestURL()%><br>
<hr>
> name : ${  param.name} <br>
> code : ${sessionScope.code }<br>
> code : ${ code }<br>
> tel : ${applicationScope.tel}<br>
> tel : ${ tel}<br>
> addr : ${requestScope.addr }<br>
<%-- 
> name : <%=name %><br>
> code : <%=code %><br>
> addr : <%=addr %><br> --%>
</body>
</html>
