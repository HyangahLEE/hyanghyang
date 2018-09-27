<%@ page import ="java.net.URLDecoder" %>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL 쿠키 목록 출력</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<h3>쿠키 목록 출력</h3>
 
<%-- 
> auth : ${ cookie.auth.value } - ${ cookie["auth"] }<br>
> id : ${ cookie.id } - ${ cookie["id"] }<br>
> name : ${ cookie.name } - ${ cookie["name"] }<br> 
이거슨 객체 --%>
<c:forEach items="${cookie }" var="ck">
 <li>${ck.key } -${URLDecoder.decode(ck.value.value) }</li>

</c:forEach>

> auth : ${ cookie.auth.value } - ${ cookie["auth"] }<br>
> id : ${ cookie.id.value } - ${ cookie["id"] }<br>
> name : ${ cookie.name.value } - ${ cookie["name"] }<br> 

</body>
</html>
