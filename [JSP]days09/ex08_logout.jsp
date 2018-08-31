<%@page import="com.util.Cookies"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
response.addCookie(Cookies.createCookie("auth","","/",0));

//response.sendRedirect("ex02_default.jsp");

%>
<script>
alert("로그아웃 완료");
location.href("ex02_default.jsp");
/* var ss = confirm("정말 로그아웃 하시겠습니까?");
if(ss){
location.href("ex02_default.jsp");
}else{
location.href("ex02_logout.jsp");
} */
</script>