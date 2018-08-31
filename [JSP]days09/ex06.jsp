<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
//1. 세션 유효기간설정 
 session.invalidate();
%>
<%
//2. 유효기간설정 
session.setMaxInactiveInterval(60*60);
/* 주의!!
session-timeout 값을 0 또는 음수로 설정하면 세션은 유효시간을 갖지않는다. 이 경우 session.invalidate()
메서트 호출 전까지 세션 객체가 서버에 유지된다. 즉 유효 시간이 없는 상태이므로 나중앤 매모지 부족현상이 나타날 수 있다.

세션 객체로 메모리 부족 현상을 방지하려면 반드시 세션타임아웃 설정을 하애한다.***

*/
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

</body>
</html>
