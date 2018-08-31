<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
int kor = request.getParameter("kor") ==null ? 0 : Integer.parseInt(request.getParameter("kor"));
int eng = request.getParameter("eng") ==null ? 0 : Integer.parseInt(request.getParameter("eng"));
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
<select class="form-control" name="deptno" id="deptno">
<option value="10" selected="selected">ACCOUNTING</option>
<option value="20" selected="selected">RESEARCH</option>
<option value="30" selected="selected">SALES</option>
<option value="40" selected="selected">OPERATIONS</option>
</select>

<hr>
<form action="">
국어 점수 : <input type="text" id="kor" name="kor" value="<%=kor %>" />
<br>
영어 점수 : <input type="text" id="eng" name="eng" value="<%=eng %>" />
<br>
<input type="submit" />
</form>
<div id="demo">
<%= kor+eng %>
</div>
<%
String deptno = request.getParameter("deptno");
%>
<script type="text/javascript">
$("#deptno > option[value='<%=deptno%>']").attr("selected","selected");
</script>
</body>
</html>