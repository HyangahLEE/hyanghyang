<%@page import="days03.EmpDTO"%>
<%@page import="com.util.DBConn"%>
<%@ page import="java.util.*,java.sql.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String pdeptno = request.getParameter("deptno");
String sql = " select empno , ename, job, mgr, hiredate, sal, deptno from emp ";
 
if( pdeptno != null){
	sql+=" where deptno= "+pdeptno;
}

Connection con = DBConn.getConnection();
ArrayList<EmpDTO> list = null;
try(Statement stmt = con.createStatement()){
	ResultSet rs = stmt.executeQuery(sql);
	
	/* while(rs.next()){
	int empno = rs.getInt(1);
	String ename = rs.getString(2);
	String job = rs.getString(3);
	int mgr = rs.getInt(4);
	String hiredate = rs.getString(5);
	double sal = rs.getDouble(6);
	int deptno = rs.getInt(7);
	empDTO dto = new empDTO(empno, ename,job, mgr, hiredate, sal,  deptno);
		list.add(dto);
		System.out.printf("%d\t %s\t %s\t %d\t %s\t %.2f\t %d\t", empno, ename,job, mgr, hiredate, sal,  deptno);
	} */
	
	if(rs.next()){
		list = new ArrayList<>();
	do{
		int empno = rs.getInt(1);
		String ename = rs.getString(2);
		String job = rs.getString(3);
		int mgr = rs.getInt(4);
		String hiredate = rs.getString(5);
		double sal = rs.getDouble(6);
		int deptno = rs.getInt(7);
		EmpDTO dto = new EmpDTO(empno, ename,job, mgr, hiredate, sal,  deptno);
		list.add(dto);
	System.out.printf("%d\t %s\t %s\t %d\t %s\t %.2f\t %d\t", empno, ename,job, mgr, hiredate, sal,  deptno);
	}while(rs.next());
	}
	rs.close();
	DBConn.close();		
}catch(Exception e){
	e.printStackTrace();	
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<style>html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}
.button:hover {
  background-color: #555;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<h2>Responsive "Meet The Team" Section</h2>
<p>Resize the browser window to see the effect.</p>
<br>

<div class="row">

<%
	Iterator<EmpDTO> ir = list.iterator();
	while(ir.hasNext()){
	EmpDTO emp = ir.next();
%>
  <div class="column">

    <div class="card">
      <img src="http://www.stardailynews.co.kr/news/photo/201608/106779_130266_5323.jpg" alt="<%= emp.getEname() %>" style="width:100%">
      <div class="container">
        <h2><%= emp.getEname()%>(<%= emp.getEmpno() %>)</h2>
        <p class="title"> <%= emp.getDeptno() %> - <%= emp.getJob() %></p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p><%=emp.getHiredate() %></p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  <%}%>

 	
</div>

<hr>
<%-- <ol>
<% Iterator<empDTO> ir = list.iterator();
	while(ir.hasNext()){
	empDTO emp = ir.next();%><% 
%>
	<li><%= emp.getEmpno() %>/<%= emp.getEname() %>/<%= emp.getJob() %>/<%= emp.getMgr() %>/<%= emp.getSal() %>/<%= emp.getDeptno() %></li>
	



</ol> --%>

</body>
</html>