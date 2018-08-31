<%@page import="java.util.Date"%>
<%@page import="days06.MemberInfo"%>
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
	
});
</script>
</head>
<body>

<%-- 
<% MemberInfo info = new MemberInfo(); %> 

info.setId("admin");
info.setName("관리자");
info.setPassword("1234");
info.setEmail("admin@naver.com");
info.setRegisterDate(new Date());--%>

<jsp:useBean id="info" class="days06.MemberInfo" scope="page"/>

<jsp:setProperty property="id" name="info" value="admin"/>
<jsp:setProperty property="name" name="info" value="관리자"/>
<jsp:setProperty property="password" name="info" value="1234"/>
<jsp:setProperty property="email" name="info" value="admin@naver.com"/>
<jsp:setProperty property="registerDate" name="info" value="<%= new Date() %>"/>


아이디 : <jsp:getProperty property="id" name="info"/><br>
이름 :  <jsp:getProperty property="name" name="info"/><br>
비번 :  <jsp:getProperty property="password" name="info"/><br>
이메일 :  <jsp:getProperty property="email" name="info"/><br>
등록일 :  <jsp:getProperty property="registerDate" name="info"/><br>

<!-- p190 Chapter08
[자바빈(JavaBeans)과 jsp:useBean 액션태그]
1. 자바빈
	ㄱ. 자바빈 규약을 따르는 클래스
	ㄴ. 자바빈 규약
		1) 클래스 직렬화
		2) 반드시 기본 생성자를 가진다. 
		3) 필드(프로퍼티) 는 getter, setter를 통해서 읽기/쓰기
	ㄷ. JSP 기반 웹 어플리케이션의 정보를 ㄹ표현하는 용도.
	ㄹ. JSP:useBean 

 -->
</body>
</html>
