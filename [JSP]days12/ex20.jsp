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
<table border="1" style="width: 100%">
<tr>
	<c:forEach begin="2" end="9" var="dan">
	<th>${dan }단</th>
	</c:forEach>
	<tbody>
	<tr>
	<c:forEach begin="2" end="9" var="dan">
	 <td>
		<c:forEach begin="1" end="9" var="i">
		${dan }*${i}=${dan*i }<br>
		</c:forEach>
	
	 </td>
	</c:forEach>
	
	 </tr>
	</tbody>
</tr>
</table>
</body>
</html>
