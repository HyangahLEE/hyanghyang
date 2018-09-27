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
<form action="ex01_03.jsp" method="post" enctype="multipart/form-data">
이름 : <input type="text" name="name" value="홍길동" /><br>
파일: <input type="file" name="upload" /><br>
<input type="submit" />
<!--request객체로 파라미터 값을 얻어 올 수 없다.  -->
</form>
</body>
</html>
