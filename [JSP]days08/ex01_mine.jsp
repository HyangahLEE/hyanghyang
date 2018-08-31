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
		 $("form:first").submit();
		 
	 }); 
	  $("#empno").change(function(){
			 $("form:nth-of-type(2)").attr("action","/empinfo.do").submit();
			 
		 }); 

});
</script>
</head>
<body>

<h3>스크립트 요소</h3>
<form>
 <select name="deptno" id="deptno">
<%	
Iterator<DeptDTO> ir = list_dept.iterator();
	while(ir.hasNext()){
		DeptDTO deptdto = ir.next();
	/* System.out.println(deptdto.getDeptno()); */
%>
<option value="<%=deptdto.getDeptno()%>"><%=deptdto.getDname()%></option>
<%		
	}
%>
</select>  
</form>

<form>
<select name="empno" id="empno">
<%	if(list_emp!=null){	%>	<%
Iterator<EmpDTO> empir = list_emp.iterator();
	while(empir.hasNext()){
		EmpDTO empdto = empir.next();
%>			
		<option value="<%=empdto.getEmpno()%>"><%=empdto.getEname()%></option>	
	<%		
	}
%>
		<%}else{%>
			<option value="">사원이 없습니다.</option>
		<%}%>


</select>
</form>
<hr>

<h3>EL +JSTL</h3>
<form>
<select name="deptno_el" id="deptno_el">
	<c:forEach items="${list_dept }" var="deptdto" >
		<option value="${ deptdto.deptno }">${ deptdto.dname }</option>
	</c:forEach>
</select>  
</form>
<br>
<form >
<select name="empno_el" id="empno_el">
<c:if test="${empty list_emp }">
	<option value="">사원이 존재하지 않습니다.</option>
</c:if>
<c:if test="${not empty list_emp }">
<c:forEach items="${list_emp }" var="empdto" >
	
		<option value="${ empdto.empno }">${ empdto.ename }</option>
	</c:forEach>
	</c:if>
</select>  
</form>  
</body>
</html>
