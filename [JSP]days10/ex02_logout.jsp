<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

response.setContentType("text/html; charset=UTF-8");

session.invalidate();



%>
<script>
alert("로그아웃 완료")
location.href="ex01.jsp"
</script>
