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
<script type="text/javascript">

var httpRequest;

function getXMLHttpRequest(){
	// IE : new ActiveXObject("Microsoft.XMLHTTP");
	// 그외 : new XMLHttpRequest();
	if(window.ActiveXObject){
		try {
			return new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				return new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				return null;
			}
			
		}
		
	}else if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}else{
		return null;
	}
}

 function javascriptAjax_click(){
	 var name = document.getElementById("name").value;
		httpRequest = getXMLHttpRequest();	 //비동기식 객체 가져옴
		httpRequest.onreadystatechange = callback;		//콜백함수 
		var url ="ex03_ajax.jsp?name="+ encodeURIComponent(name);
		httpRequest.open("Get", url, true);		
		httpRequest.send(null);
	 
 }
 
 function callback(){
		if(httpRequest.readyState == 4){ //데이터
			if(httpRequest.status == 200 ){//성공
			alert(httpRequest.responseText);
			document.getElementById("demo").innerHTML = httpRequest.responseText;
			}else{
				alert("실패 : " + httpRequest.status);
			}
		}
		
	}
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	var name = document.getElementById("name").value;
});
</script>
</head>
<body>
<% 
Date now = new Date();
%>
현재 : <%= now.toLocaleString() %><br>
<hr>
<form id="form1" name="form1">
	name = <input type="text" id="name" name="name" value="이향아" /><br>
	<input type="button" value="javascript ajax" onclick="javascriptAjax_click();"/>
</form>
<hr />
<div id="demo"></div>
</body>
</html>
