<%@page import="days02.DeptDTO"%>
<%@page import="java.util.*"%>
<%@ page import="java.sql.*, com.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String sql = " select deptno, dname from dept ";
Connection con = DBConn.getConnection();

ArrayList<DeptDTO> list =null;
try (Statement stmtdept = con.createStatement()) {
	ResultSet rsdept = stmtdept.executeQuery(sql);
	list = new ArrayList<>();
	while(rsdept.next()) {	
		
	int deptno = rsdept.getInt(1);
	String dname = rsdept.getString(2);
	DeptDTO dto = new DeptDTO(deptno,dname);  
	list.add(dto);
	System.out.printf("\n>[%d]\t [%s]\n",deptno,dname);	
	}
	
	rsdept.close();
	DBConn.close();
} catch (Exception e) {
	e.printStackTrace();
}	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<form action="<%= request.getContextPath() %>/days03/ex05.jsp">
<select name="deptno" id="deptno">
<%
Iterator<DeptDTO> ir =  list.iterator();
while(ir.hasNext()){
	DeptDTO dto = ir.next();
%>
<option value="<%= dto.getDeptno()%>"><%= dto.getDname() %></option> 
<%}%>
<!-- 
<option value="10">ACCOUNTING</option>
<option value=""></option>
<option value=""></option>
<option value=""></option> 
-->
</select>
<br>
<input type="submit" value="부서 사원 정보 확인" />
</form>
</body>
</html>