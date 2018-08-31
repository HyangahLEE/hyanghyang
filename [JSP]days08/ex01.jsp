<%@page import="days03.EmpDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="days02.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
ArrayList<DeptDTO> list_dept = (ArrayList<DeptDTO>)request.getAttribute("list_dept");
ArrayList<EmpDTO> list_emp = (ArrayList<EmpDTO>)request.getAttribute("list_emp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#deptno").change(function(){
		$("form:first-of-type").submit();
	});
	$("#empno").change(function(){
		$("form:nth-of-type(2)")
		.attr("action","/exempinfo.do")
		.submit();
	});
});
</script>
</head>
<body>
<!-- 1. http://localhost/deptemp.do 요청
	days08패키지 내에 TestDeptEmp.java 서블릿
	select * from dept
	ex01.jsp 포워딩
	select*2 id,name = deptno
	1) 스크립트 요소
	2) EL +JSTL
	option value = deptno text=dname
	부서에 해당되는 OPTION태그를 선택하면  http://localhost/deptemp.do
	<hr>
	select id, name = empno
	 내가 선택한 부서 사원 option 추가
	 http://localhost/empinfo.do
	 TestEmpInfo.java
	 empno=9877 ->EmpDTO ->포워딩
	 ex02.jsp
 -->
<h3>스트립트 요소</h3>
<form>
<select name="deptno" id="deptno">
<% Iterator<DeptDTO> ir_dept = list_dept.iterator();
 	while(ir_dept.hasNext()){
	DeptDTO dto_dept = ir_dept.next();
	%>
		<option value="<%=dto_dept.getDeptno()%>"><%=dto_dept.getDname()%></option>
	
<%
}
%>
</select>
</form>


<form>
<select name="empno" id="empno">
<% if(list_emp !=null){%>
	<% Iterator<EmpDTO> ir_emp= list_emp.iterator();
 	while(ir_emp.hasNext()){
	EmpDTO dto_emp = ir_emp.next();
	%>
	<option value="<%= dto_emp.getEmpno()%>"><%=dto_emp.getEname()%></option>
	<%
 	}
	%>
	
<% }else{ %>
	<option value="">No EXIST</option>
	
<%	} %>

</select>
</form>

<!-- ------------------------------------  -->
<h3>EL + JSTL</h3>
<form>
<select name="deptno_el" id="deptno_el">

 	<c:forEach items="${list_dept }" var="dept_dto" >
		<option value="${ dept_dto.deptno }">${ dept_dto.dname }</option>
	</c:forEach>

	
</select>  
</form>

<select name="empno_el" id="empno_el">
<c:if test="${ not empty list_emp }">
	<c:forEach items="${ list_emp }" var="emp_dto" >
		<option value="${ emp_dto.empno }">${ emp_dto.ename }</option>
	</c:forEach>
</c:if>
<c:if test="${ empty list_emp }">
	<option value="">No EXIST</option>
</c:if>
</select> 

</body>
</html>
