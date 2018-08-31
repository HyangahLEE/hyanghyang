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

  서버 정보 : <%= application.getServerInfo() %><br>
  서블릿 규액 메이저 버전 :  <%= application.getMajorVersion() %><br>
  서블릿 규약 마이너 버전 :  <%= application.getMinorVersion() %><br>
  
  

</body>
</html>