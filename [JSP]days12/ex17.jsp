<%@page import="java.util.ArrayList"%>
<%@page import="days03.EmpDTO"%>
<%@page import="com.util.DBConn"%>
<%@page import="java.sql.*"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	String sql_emp = "select * from emp ";

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs_emp = null;

	try {
		con = DBConn.getConnection();
		pstmt = con.prepareStatement(sql_emp);
		rs_emp= pstmt.executeQuery();
		EmpDTO dto = null;
		ArrayList<EmpDTO> list = new ArrayList<>();
		while (rs_emp.next()) {
			dto = new EmpDTO();
			dto.setComm(rs_emp.getDouble("comm"));
			dto.setDeptno(rs_emp.getInt("deptno"));
			dto.setEmpno(rs_emp.getInt("empno"));
			dto.setEname(rs_emp.getString("ename"));
			dto.setHiredate(rs_emp.getString("hiredate"));
			dto.setJob(rs_emp.getString("job"));
			dto.setMgr(rs_emp.getInt("mgr"));
			dto.setSal(rs_emp.getDouble("sal"));
			list.add(dto);
		}
		
		request.setAttribute("list", list);
		
	} catch (Exception e) {
		System.out.println("> TestEmpInfo.doGet() \n" + e.toString());
	} finally {
		if (rs_emp != null)
			try {
				rs_emp.close();
			} catch (Exception e) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (Exception e) {
			}
		if (con != null)
			try {
				DBConn.close();
			} catch (Exception e) {
			}
	}
%>
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
<c:choose>
	<c:when test="${empty list }">
	 사원 존재 x
	</c:when>
	<c:otherwise>
		<c:forEach items="${list }" var="dto">
		// 사원정보 출력	
		</c:forEach>
	</c:otherwise>
</c:choose>

<%-- 
<c:if test="${empty list }">
	사원 존재하지 않ㅅ습니다.
</c:if>
<c:if test="${!empty list }">
	<c:forEach items="${list }" var="dto">
	
	</c:forEach>
</c:if> --%>

<table border="1" width="500px">
	<tr>
		<th>deptno</th>
		<th>ename(empno)</th>
		<th>job</th>
		<th>hiredate</th>
		<th>mgr</th>
	</tr>
	<c:forEach items="${list }" var="dto">
	<c:choose>
		<c:when test="${dto.deptno eq 10 }"><tr style="background:red"></c:when>
		<c:when test="${dto.deptno eq 20 }"><tr style="background:yellow"></c:when>
		<c:when test="${dto.deptno eq 30 }"><tr style="background:blue"></c:when>
		<c:when test="${dto.deptno eq 40 }"><tr style="background:pink"></c:when>
	</c:choose>
	
		<td>${dto.deptno }</td>
		<td>${dto.ename }(${dto.empno })</td>
		<td>${dto.job }</td>
		<td>${dto.hiredate }</td>
		<td>${dto.mgr}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
