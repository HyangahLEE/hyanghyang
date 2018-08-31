<%@ page import="days03.EmpDTO"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
EmpDTO emp_dto =  (EmpDTO)request.getAttribute("emp_dto");
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
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.title {
  color: grey;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
</style>
</head>
<body>


<h2 style="text-align:center">User Profile Card - 스크립트 요소 사용</h2>

<div class="card">
  <img src="https://www.w3schools.com/w3images/team2.jpg" alt="<%= emp_dto.getEname()%>" style="width:100%">
  <h1><%= emp_dto.getEname()%></h1>
  <p class="title"><%= emp_dto.getJob()%>, Example</p>
  <p>
  
    DEPTNO : <%= emp_dto.getDeptno()%><br>
	MGR : <%= emp_dto.getMgr()%><br>
	HIREDATE :<%= emp_dto.getHiredate()%><br>
	SAL : <%= emp_dto.getSal()%><br>
	COMM :  <%= emp_dto.getComm()%><br></p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
 </div>
 <p><button>Contact</button></p>
</div>

<hr>

<h2 style="text-align:center">User Profile Card - EL & JSTL 사용</h2>

<div class="card">
  <img src="https://www.w3schools.com/w3images/team2.jpg" alt="${emp_dto.ename }" style="width:100%">
  <h1>${emp_dto.ename } - ${emp_dto.empno }</h1>
  <p class="title">${emp_dto.job }, Example</p>
  <p>
	DEPTNO : ${emp_dto.deptno }<br>
	MGR : ${emp_dto.mgr }<br>
	HIREDATE :${emp_dto.hiredate }<br>
	SAL : ${emp_dto.sal }<br>
	COMM :  ${emp_dto.comm }<br>
  </p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
 </div>
 <p><button>Contact</button></p>
</div>
</body>
</html>
