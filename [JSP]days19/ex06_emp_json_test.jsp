<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	 $("#jsontest").click(function(){
	/* jquery.ajax() */
	$.ajax({
		url:"ex06_emp_json.jsp"
		,dataType:"json"
		,type:"get"
		,cache:false /* 임시기억공간 */
		,success:function(data){
			$(data.emp).each(function(index,e){/* data- 객체 형태로 받아온다. */
				var info =  e.empno + " / " + e.ename ;
				$("#demo").append( "<div>"+ info +"</div>" );
				}); 			
			}, error: function(){
				alert("에러");
			}		
	  	});
	 });
});
</script>
</head>
<body>
<% Date now = new Date(); %>
<h3><%= now.toLocaleString() %></h3>
<input type="button" id="jsontest" value="jquery+ajax+json" />
<div id="demo"></div>
</body>
</html>
