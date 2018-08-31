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
<!-- p72 JSP 기본 내장 객체 : request -->

클라이언트IP= <%= request.getRemoteAddr() %><br>
요청정보길이= <%= request.getContentLength() %><br>
요청정보 인코딩= <%= request.getCharacterEncoding() %><br>
요청정보 컨텐츠타입= <%= request.getContentType() %><br>
요청정보 프로토콜= <%= request.getProtocol() %><br>
요청정보 전송방식= <%= request.getMethod() %><br>
요청 URI= <%= request.getRequestURI() %><br>
컨텍스트 경로= <%= request.getContextPath() %><br>
서버이름= <%= request.getServerName() %><br>
서버 포트= <%= request.getServerPort() %><br>
getRequestedSessionId= <%= request.getRequestURL() %><br>
getRealPath= <%= request.getRealPath("") %><br>
getRequestedSessionId= <%= request.getRequestedSessionId() %><br> <!-- 서버에 있는 기억공간  (처음엔 요청한 값 없음 )-->
getServletPath= <%= request.getServletPath() %><br>

</body>
</html>