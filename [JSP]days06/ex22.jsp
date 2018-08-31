<%@page import="java.util.Date"%>
<%@page import="days06.MemberInfo"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

<%
   MemberInfo info = new MemberInfo();
info.setId("admin");
info.setName("관리자");
info.setPassword("1234");
info.setEmail("admin@naver.com");
info.setRegisterDate(new Date());

%>

아이디 : <%=info.getId() %><br>
이름 :  <%=info.getName() %><br>
비번 :  <%=info.getPassword() %><br>
이메일 :  <%=info.getEmail() %><br>
등록일 :  <%=info.getRegisterDate() %><br>


</body>
</html>


<!-- p 190
 1. 자바빈(JavaBeans)? JSP 기반 웹 어플리케이션에서 정보를 표현할 떄 사용하는 것 중 하나가 자바빈이다.
 2. 예) 회원 정보, 게시판 게시글 정보 -> 읽기/쓰기 저장할 객체
 3. DeptDTO / DeptVO 
 4. jsp : useBean 액션 태그...
 5. 자바빈은 속성(데이터), 변경 이벤트 , 객체 직렬화를 위한 표준이다.
 6. 자바빈 규약을 따르는 클래스  => 자바빈.
   public class BeanClass implements java.io.Serializable{
   //필드
   private String ename;
   private int empno;
   :
   //
   // 기본 생성자 선언
   public BeanClass(){
   
   }
   // getter, setter 선언 -->