<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {});
</script>
</head>
<body>
	<!-- 
1. request( javax.servlet.http.HttpServletRequest ) - 클라이언트의 요청 정보를 저장
2. response( javax.servlet.http.HttpServletResponse ) - 응답정보를 저장한다. 
3. out ( javax.servlet.jsp.JspWriter ) - JSP 페이지가 생성하는 결과를 출력할 때 사용하는 출력 스트림
4. page ( java.lang.Object ) - JSP 페이지를 구현한 자바 클래스 인스턴스 
5. session 객체 ( javax.servlet.http.HttpSession ) - http 세션 정보를 저장한다. 
6. application( javax.servlet.ServletContext ) - 웹 어플리케이션 정보를 저장한다. 
7. pageContext ( javax.servlet.jsp.PageContext ) - JSP 페이지 정보를 저장한다. 
8. config ( javax.servlet.ServletConfig ) - jsp 페이지에 대한 설정 정보를 저장한다.
9. exception ( java.lang.Throwable ) - 예외객체 , 에러페이지에서만 사용한다. 
 -->
<%
 //jsp 페이지가 생성하는 모든 내용은 out 기본 객체를 통해서 전송
 //out.print(); //데이터 출력
 //out.println(); //데이터 출력 + 개행
 //out.append(c); 
 
%>
</body>
</html>