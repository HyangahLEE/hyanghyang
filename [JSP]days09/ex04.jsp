<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page session="true" contentType="text/html; charset=UTF-8"
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
<a href="ex05.jsp">ex05.jsp</a><br>
<a href="ex06.jsp">ex06.jsp</a><br>

<%

session.setAttribute("empno", "7566");
session.setAttribute("ename", "SMITH"); 

/* setAttr 했을 때 페이지가 넘어가면 request유지 안된다.
request.setAttribute("empno", "7566");
request.setAttribute("ename", "SMITH"); */
%>
<a href="ex05.jsp">ex05.jsp</a>
<hr>
> 세션 ID: <%= session.getId() %><br>
> 세션 생성 시간 : <%= session.getCreationTime() %><br>
<%
Date time = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
time.setTime(session.getCreationTime());
%>
> 세션 생성 시간 : <%= sdf.format(time) %><br>
> 최근 접근 시간 : <%= session.getLastAccessedTime() %><br>

<%
time.setTime(session.getLastAccessedTime());
%>
> 최근 접근 시간 : <%= sdf.format(time)%>

<!-- p233 세션 -->
<!--
1. 상태관리
2. 쿠키와 차이점 : 웹브라우저가 아니라 서버에 값을 저장하는 점.
3. 세션은 웹컨테이너의 정보를 저장한다. 
4. 웹 컨테이너는 기본적으로 한 웹 브라우저마다 한 세션을 생성한다.****
5. page 지시자 session="true"

[p 232 그림 10-1]
jsp 기본적으로 제공하는 객체
session.setAttribute("이름","값");

[p 233 그림 10-2]
수강 후 사물함 받기전 (최초 요청전)
사물함 받고 키받음 (최초 요청시 세션 생성됨)
수료후 사물함 반남(세션종료)

6. session 객체의 메서드
 [브라우저] -> 첫요청 -> getId() ==JSESSIONID 세션 고유 id
 ex) 12:00 세션 타임아웃 30분 (12:30전에 한번이라도 클린안하면 세션 끊어짐)
 	 12:25 에 클릭하면 그때부터 새로 30분
 getCreationTime() 세션 생성된 시간  - 1970.01.01 ~ 밀리세컨드.
 getLastAccessedTime() 세션에 마지막에 접근한 시간. - 1970.01.01 ~ 밀리세컨드.
 
 7. 세션 종류
 [웹 브라우저] -> 첫 요청 -> 사물함 in 서버 
			<- 사물함필요 x
session.invalidate() : 세션 객체 삭제 + 저장된 데이터 삭제

p237 쿠키 vs 세션

8. 세션 유효 시간 p239
session.getLastAccessedTime()
마지막 세션 접근 시간 이후 -> 30분 -> 세션종료
	ㄱ. 세션 유효시간 설정...
		1) web.xml - <session-config>
		2) session.setMaxInactiveInternal(초)
	 -->
</body>
</html>
