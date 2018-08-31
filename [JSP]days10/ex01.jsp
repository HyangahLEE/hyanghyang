<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#btn_memberAdd").click(function(){
		location.href="ex02_joinMember.jsp";
	});
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
<!-- 
p250 표현언어(EL)
P292 표준 태그 라이브러리(JSTL)
 P336 이클립스를 이용한 웹개발
 -->
 <!-- viewMemberList.do -> ex02_viewMemberList.jsp-->
 <c:if test="${!empty auth }">
 <a href="viewMemberList.do">회원목록</a>
 <a href="viewMemberList.do">방명록</a>
 </c:if>
 <a href="viewMemberList.do">게시판</a>
 <a href="viewMemberList.do">자료실</a>
 <a href="viewMemberList.do">도움말</a>
 
 
  
 <c:if test="${empty sessionScope.auth }">
<div id="logon">
 <form action="ex02_logon.do"><!--Ex02Logon.java  -->
	<!--  <form action="ex02_logon.jsp"> -->
 아이디 : <input type="text" name="memberid" value="dlgiddk20"/><br>
 비밀번호 : <input type="password" name="password" value="1234"/><br>
 <input type="submit" value="로그인" />
 <input type="button" id="btn_memberAdd" value="회원가입" />
 <br>
 
<c:if test="${!empty param.error }">
 <span style="color: red">로그인 실패</span>  
 </c:if>
  </form>
</div>
</c:if>
<c:if test="${!empty sessionScope.auth }">
<div id="logout">
 [${sessionScope.auth.name }]님 환영합니다<br>
 <a href="ex02_logout.do">로그아웃</a>
</div>
</c:if>


 <script type="text/javascript">
 $("#logon span").fadeOut(5000);
 </script>
</body>
</html>
