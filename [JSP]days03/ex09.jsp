<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 이동</title>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#btnLink").click(function(){
		//location객체의 href속성
		location.href = "ex05.jsp?deptno=20";
	});
});
</script>
</head>
<body>
<!-- p90~92 response 기본 객체 -->
<!-- p 93 리다이렉트를 이용해서 페이지를 이동한다.  -->
<a href="ex01.jsp"></a><br>
<input type="button" id="btnLink" value="js 페이지 이동" />
<br>
<form action="ex09_proc.jsp" method="post">
부서 번호 선택 : 
<select name="deptno" id="deptno">
	<option value="10">Accounting</option>
	<option value="20">research</option>
	<option value="30">sales</option>
	<option value="40">operations</option>
</select>
<br>
<input type="submit" />
</form>
<hr>
<form action="ex10_login.jsp">
id : <input type="text" name="memberId" value="dlgiddk20" />
</form>
</body>
</html>