<%@page import="com.util.Cookies"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="ex08_sessioninfo.jsp" %>
<%
String error= request.getParameter("error");
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
<style type="text/css">
div{
border: solid 1px gray;
width: 280px;
height: 100px;
padding: 20px;
}
</style>
</head>
<body>
 <h3>default page</h3>
 
 <% if(auth == null){ //인증x %>	 
<div id="logon">
 <form action="ex08_logon.do"><!--Ex02Logon.java  -->
	<!--  <form action="ex02_logon.jsp"> -->
 아이디 : <input type="text" name="id" value="dlgiddk20"/><br>
 비밀번호 : <input type="password" name="pwd" value="1234"/><br>
 <input type="submit" value="로그인" />
 <input type="button" value="회원가입" />
 <br>
 
 <% if(error !=null){ %>
 <span style="color: red">로그인 실패</span>
  <% }%> 
  	</form>
</div>
 <% }else{//인증o + 권한 ? %>
<div id="logout">
 [<%=auth %>]님 환영합니다<br>
 <a href="ex08_logout.do">로그아웃</a>
</div>
 <% } %>
 
 
 
 
 <a href="ex08_board.jsp">게시판</a><br>
 <a href="ex08_notice.jsp">공지사항</a><br>
 
 <!-- 인증을 받아야만 사용할 수 있는 메뉴 : 일정관리 , 자료실 -->
 <% if(auth!=null){ %>
 <a href="#">일정관리</a><br>
 <a href="#">자료실</a><br>
  <% } %>
 
 
 <a href="#">도움말</a><br>
 
 <script type="text/javascript">
 $("#logon span").fadeOut(5000);
 </script>
</body>
</html>
