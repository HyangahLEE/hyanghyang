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
<h3>update.jsp</h3>
<form action="update_ok.do" method="post" enctype="multipart/form-data">
<table border="1" style="width: 500px;" align="center">
<tr>
	<td>subject</td>
	<td><input type="text" name="subject" value="${dto.subject }"/></td>
</tr>
<tr>
	<td>attached file</td>
	<td>
	<input type="file" name="attachedFile"/>
	<input type="hidden" name="fileSystemName" value="${ dto.fileSystemName}"/></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" />
	<input type="hidden" name="num" value="${dto.num }" /></td>
</tr>
</table>

</form>
</body>
</html>
