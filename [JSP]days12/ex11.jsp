<%@page import="java.util.Hashtable"%>
<%@page import="java.util.HashMap"%>
<%@page import="days02.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
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
<!-- p274 EL 람다식 사용하기 -->
<%-- <%@ page isELIgnored="true"%> --%>
<%-- ${cookie.JSESSIONID.value } --%>

<!-- Attribute 저장된 맵(Map)이나 자바빈의 값을 표현 : EL -->
<% 
ArrayList<String> list = new ArrayList<>();
list.add("aaa");
list.add("bbb");
list.add("ccc");
list.add("ddd");
list.add("eee");
request.setAttribute("list", list);

%>
<c:forEach items="${list }" var="name">
<li>${name }</li>
</c:forEach>
<hr />
<% DeptDTO dto = new DeptDTO();
	dto.setDeptno(10);
	dto.setDname("영업부");
	dto.setLoc("서울");
	request.setAttribute("dto", dto);
%>
> deptno : ${dto.deptno }<br>
> dname : ${dto['dname'] }<br>
<hr>
<%
Hashtable<String, String> map = new Hashtable<>();
map.put("name","이향아");
map.put("id","dlgiddk30");
map.put("age","20");
request.setAttribute("map", map);
%>
> name: ${map.name } <br />
> id: ${map['id'] } <br />
> age: ${map.age } <br />
</body>
</html>
