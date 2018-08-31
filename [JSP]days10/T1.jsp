<%@ page contentType="text/html; charset=UTF-8"
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
	$("#joinbtn").click(function(){
		location.href="T1_join.jsp";
		
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
 <h3>default page</h3>
 
 

 <c:if test="${empty sessionScope.auth  }">
<div id="logon">
 <form action="logon.do"><!--Ex02Logon.java  -->
	<!--  <form action="ex02_logon.jsp"> -->
 아이디 : <input type="text" name="memberid" value="dlgiddk20"/><br>
 비밀번호 : <input type="password" name="password" value="1234"/><br>
 <input type="submit" value="로그인" />
 <input type="button" id="joinbtn" value="회원가입" />
 <br>
 
  <c:if test="${!empty param.error }">
 <span style="color: red">로그인 실패</span>
</c:if>	 
  	</form>
</div>
</c:if>	 
 <c:if test="${!empty sessionScope.auth  }">
<div id="logout">
 [${sessionScope.auth.name}]님 환영합니다<br>
 <a href="logout.do">로그아웃</a>
</div>
</c:if>	 
 
 
 
 
 <a href="#">게시판</a><br>
 <a href="#">공지사항</a><br>
 
 <!-- 인증을 받아야만 사용할 수 있는 메뉴 : 일정관리 , 자료실 -->
 <c:if test="${!empty sessionScope.auth  }">
 <a href="#">일정관리</a><br>
 <a href="#">자료실</a><br>
</c:if>	 
 
 
 
 <a href="#">도움말</a><br>
 
 <script type="text/javascript">
 $("#logon span").fadeOut(5000);
 </script>
</body>
</html>
