<%@page import="days02.DeptDTO"%>
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
<%-- <c:set property="" scope="page/request/session/application" target="" value="변수의 값(텍스트)" var="EL에서 사용할 변수명"></c:set> --%>
 <c:set var="name" value="hyang"></c:set><%--
<c:set var="name" value="<%=request.getParameter(\"name\") %>"></c:set>
<hr>
<% 
DeptDTO dto = new DeptDTO();
request.setAttribute("d", dto);
%>
<c:set target="프로퍼티 설정할 대상 객체" property="setDeptno"></c:set>
<c:set target="<%=dto %>" property="deptno" value="10"></c:set>
<c:set target="${d }>" property="dname">10</c:set>

p298 표 12.3
<c:set var="EL사용불가" value="EL 사용가능" scope="el 사용불가"></c:set> --%>
<c:set var="age" value="20" scope="session"></c:set>
<a href="ex14.jsp"></a>
</body>
</html>
