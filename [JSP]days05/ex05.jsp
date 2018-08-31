<%@page import="java.util.Iterator"%>
<%@page import="days03.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	ArrayList<EmpDTO> list = (ArrayList<EmpDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
   
});
</script>
<style>
</style>
</head>
<body>

	<select name="empno" id="empno">
	<option>사원 선택하세요</option>
	<%
	Iterator<EmpDTO> ir = list.iterator();
		while( ir.hasNext()){
			EmpDTO dto = ir.next();
	%>
		<option value="<%=dto.getEmpno() %>"><%=dto.getEname() %></option>
	<%		
		}
	%>
	</select>
</body>
</html>



<!-- 
1. localhost/days05/ex05_modal.do
2. EmpModal.java
	doGet()  ArrayList<EmpDTO> list
	포워딩
3. ex05.jsp 
-->