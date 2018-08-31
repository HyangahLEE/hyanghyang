<%@page import="java.util.Date"%>
<%@page import="days06.MemberInfo"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	/*
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	MemberInfo info = new MemberInfo();
	info.setId(id);
	info.setName(name);
	info.setPassword(password);
	info.setEmail(email);
	info.setRegisterDate(new Date()); */

%>


<%-- 
아이디 : <%=info.getId() %><br>
이름 :  <%=info.getName() %><br>
비번 :  <%=info.getPassword() %><br>
이메일 :  <%=info.getEmail() %><br>
등록일 :  <%=info.getRegisterDate() %><br> --%>



<jsp:useBean id="info" class="days06.MemberInfo" scope="request"/><!-- MemberInfo info = new MemberInfo(); -->

<!-- 조건 : MemberInfo의 필드 값과 		(ex02.jsp)input태그의 name속성과 이름을 꼭 맞춰줘야한다. -->
<jsp:setProperty property="*" name="info"/><!-- 모든속성에 입력 -->
<jsp:setProperty property="registerDate" name="info" value="<%= new Date() %>"/>

아이디 : <jsp:getProperty property="id" name="info"/>
<%--  info객체 포워딩	--%>
<jsp:forward page="ex02_result.jsp"></jsp:forward>  

