<%@page import="com.util.Cookies"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="ex02_cookieinfo.jsp" %>
<%
//[인증 & 권한]
//등급 (권한)
// 쿠키 이름 auth가 존재하면 : 로그인 인증 o
// 쿠키 이름 auth가 존재하지않으면 : 로그인 인증 x
/* String auth = null;
Cookies cookies = new Cookies(request);
if(cookies.exists("auth")){
	auth =cookies.getValue("auth");
} */
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
	/* $("a:first").click(function(){
		alert("로그아웃 완료!");
	}) */
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
<!-- p226 쿠키를 사용한 로그인 상태 유지[***] 

1. default.jsp
	ㄱ. 메인페이지
	ㄴ. 로그인 메뉴(ID/PW)
			"이향아"님 환영^^ [로그아웃(버튼)]
2. logon.jsp
	ㄱ. 입력받은 id/pw DB확인
	ㄴ. 로그인 성공 - 쿠키이름 auth 값 저장
	ㄷ. 로그인 실패 - default.jsp
3. logout.jsp 
	ㄱ. 로그아웃 처리 후 default.jsp로 이동
4. board.jsp - 게시판 페이지 
	ㄱ. 로그인 x - 게시글 보기만 가능
	ㄴ. 로그인 o (일반사용자) - 글쓰기
	ㄷ. 로그인 o (글쓴이) - 글쓰기, 수정, 삭제
 
 -->
 <h3>default page</h3>
 
 <% if(auth ==null){ //인증x %>	 
<div id="logon">
 <form action="ex02_logon.do"><!--Ex02Logon.java  -->
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
 [이향아]님 환영합니다<br>
 <a href="ex02_logout.do">로그아웃</a><!--Ex02Logout.java  -->
 <!-- <a href="ex02_logout.jsp">로그아웃</a> -->
</div>
 <% } %>
 
 
 
 
 <a href="ex02_board.jsp">게시판</a><br>
 <a href="ex02_notice.jsp">공지사항</a><br>
 
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
