<%@ page import="java.util.Iterator"%>
<%@ page import="days03.EmpDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	 $("#emptable th :checkbox").change(function(){
		console.log($(this).prop("checked"));
		$("#emptable td :checkbox").prop("checked", $(this).prop("checked") );
	}); 
	
	$("#btn_empdelete").click(function(){
		$("form")
		.attr("action","/days07/ex03_delete.jsp")
		.attr("method","get")
		.submit();
	});
});
</script>
</head>
<body>
사원수 : ${size} 명<br>

<form>
<table border="1" id="emptable">
<tr>
	<th><input type="checkbox" /></th>
	<th>deptno</th>
	<th>empno</th>
	<th>ename</th>
	<th>job</th>
	<th>hiredate</th>
</tr>
<!-- JSTL -->
<c:if test="${ empty list }">
	 	 <tr>
	 	 	<td colspan="6" style="height: 150px; text-align: center;"> 사원이 존재하지 않습니다.</td>
	 	 </tr>
</c:if>
 <c:if test="${ !empty list }"> 
 <!-- Iterator<EmpDTO> ir =  list.iterator();
while(ir.hasNext()){
	EmpDTO dto = ir.next(); -->
 <c:forEach items="${list }" var="dto" varStatus="status">
	<tr>
		<td><input type="checkbox" name="empno" value="${dto.empno}"/></td>
		<c:if test="${status.count ==1}">
		<td rowspan="${ list.size() }">${dto.deptno }</td>
		</c:if>		
		<td>${dto.empno }</td>
		<td>${dto.ename }</td>
		<td>${dto.job }</td>
		<td>${dto.hiredate }</td>
	</tr>
</c:forEach>
</c:if>
<tr>
	<td colspan="6">
		<input type="button" id="btn_empdelete" value="선택된 사원 삭제"/>
<!-- 삭제 버튼을 클릭하면 체크된 사원의empno 값을 ex03_delet.jsp 삭제할 사원 empno를 li로 출력 -->
	</td>
</tr>
</table>

</form>
</body>
</html>
