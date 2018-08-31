<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page buffer="1kb" autoFlush="true" %>
<%@ page errorPage="/error/viewErrorMessage.jsp" %>
<!-- autoflush에 의해 전송된 데이터는 브라우저에 출력되고, 에러가 발생하면 그 때 erroepage로 이동된다.
 그 페이지가 오류가 있더라도, 버퍼를 채우고 보내고 작업이 에러가 나기 전까지 진행되면 그대로 반영된다. -->


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

<%
  for(int i=0; i<300; i++){	  
	  out.println(i);
  }

%>

<!-- 자바에서 0으로 나누면 예외 발생. -->

<%= 1/0 %>

</body>
</html>