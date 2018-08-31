<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
});
</script>
</head>
<body> 
<table border="1" style="width:80%; margin: 20px auto" class="table table-bordered table-hover">
<tr>
	<!-- <th><input type="checkbox"></th> -->
	<th>deptno</th>
	<th>ename</th>
	 <th>empno</th>
	<th>mgr</th>
	<th>job</th>
	<th>hiredate</th>
	<th>sal</th>
	<th>comm</th> 
</tr>
<tbody>
	<c:forEach items="${ht}" var="entry" >
		<tr>
			<!-- <td><input type="checkbox" ></td>  -->
			<td rowspan="${entry.value.size() }">${	entry.key }		</td>
		<c:if test="${entry.value.size() == 0 }">
			<td colspan="7">존재하지 않습니다.</td>
		</c:if>
		<c:if test="${entry.value.size() != 0 }">
			<c:forEach items="${entry.value}" var="dto">
				<td>${	dto.ename }</td>
				<td><a href="#" data-toggle="tooltip" data-placement="bottom" title="${dto.ename }">${	dto.empno }</a></td>
				<%-- <td data-toggle="tooltip" data-placement="bottom" title="${dto.ename }">${	dto.empno }</td> --%>
				<td>${	dto.mgr }</td>
				<td>${	dto.job }</td>
				<td>${	dto.hiredate }</td>
				<td>${	dto.sal }</td>
				<td>${	dto.comm }</td> 
		</tr>
			</c:forEach>
		</c:if>	
	</c:forEach>
</tbody>
</table>

<hr>
<select name="" id="">
	<c:forEach items="${ ht }" var="entry">
		<%-- <option value="">${ entry.key }</option> --%>
		<optgroup label="${ entry.key }">
			<c:forEach items="${ entry.value }" var="dto"><!-- ArrayList<EmpDTO> -->
				<option value="">${ dto.ename}(${dto.empno })</option>
			</c:forEach>
		</optgroup>
	</c:forEach>
</select>
<!-- <a href="/days05/accordion.do">/days05/accordion.do</a> -->
</body>
</html>
