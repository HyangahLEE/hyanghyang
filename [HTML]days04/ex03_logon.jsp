<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String id = request.getParameter("user_id");
	String pwd = request.getParameter("user_pwd");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- http://www.naver.com/webPro/html/days04/ex03_logon.jsp?user_id=dgdsa+d&user_pwd=123123123 -->
	
	요청할 url(웹주소):
	URL 인코딩 - ASCII 문자 집합
	 	한글 X %16진수 값으로 변환하여 전송한다. 
	 	그렇기 때문에 뒤에한글이 안나오고 %80 이런식으로 나온당.>_<
	 	공백도 +로 변환시켜서 나옴 또는 %20	

	http://
	https:// secure(보안) 되어져서 데이터가 날아가라 
	ftp:// file transper protocol 통신규약
	file
	
	www			도메인 접두사 prefix
	naver.com   도메인
	port		:80
	webPro/html/days04    경로(path)
	ex03_logon.jsp		웹페이지
	?
	매개변수 
</body>
</html>