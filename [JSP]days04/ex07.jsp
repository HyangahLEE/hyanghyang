<%@ page autoFlush="true" buffer="8kb"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

<%
out.println("안녕하ㅅ요");
%>
버퍼 크기 : <%= out.getBufferSize() %><br>
남은 크기 : <%= out.getRemaining() %><br>

<%
out.flush();//안찻는데도 출력시키고 버서비움
out.clearBuffer();//버퍼지우기
out.clear();
%>

<%
out.println("=END=");//버퍼 지우고 다시담아서 출력
%>
<%--
<%//autoFlush="false" 이면 500번 오류
for (int i = 0; i < 1000 ; i++) {

%>
1234
<%
}
%> 
--%>
</body>
</html>