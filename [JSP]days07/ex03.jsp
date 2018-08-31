<%@page import="java.util.Iterator"%>
<%@page import="days03.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
ArrayList<EmpDTO> list = (ArrayList<EmpDTO>)request.getAttribute("list");
int size = (int)request.getAttribute("size");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#emptable th : checkbox").change(function(){
		console.log($(this).prop("checked"));
		$("#emptable td : checkbox").prop("checked", $(this).prop("checked") );
	})
});
</script>
</head>
<body>
사원수 : <%= size %> 명<br>
<table border="1" id="emptable">
<tr>
	<th><input type="checkbox" /></th>
	<th>deptno</th>
	<th>empno</th>
	<th>ename</th>
	<th>job</th>
	<th>hiredate</th>
</tr>
<%
 if( size ==0){
	 %>
	 	 <tr>
	 	 	<td colspan="6" style="height: 150px; text-align: center;"> 사원이 존재하지 않습니다.</td>
	 	 </tr>
<% }else{%>
	 

<%
boolean isFirst = true;
Iterator<EmpDTO> ir =  list.iterator();
while(ir.hasNext()){
	EmpDTO dto = ir.next();
%>
	<tr>
		<td><input type="checkbox" /></td>
		<%if(isFirst){
		%>
		<td rowspan="<%= size %>"><%=dto.getDeptno() %></td>
		<%
		isFirst=false;
		}
		%>
		
		<td><%=dto.getEmpno() %></td>
		<td><%=dto.getEname() %></td>
		<td><%=dto.getJob() %></td>
		<td><%=dto.getHiredate() %></td>
	</tr>

<%
}
%>

<%	 
 }
%>

</table>
</body>
</html>
