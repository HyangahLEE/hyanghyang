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
<script type="text/javascript" src="httpRequest.js"></script>
<script>
var timer;
function empTop5(){
	var url = "ex04_empTop5.jsp";
	var params = null;
	var method="Get";
	sendRequest(url,params,callback,method);
	
	timer = setTimeout(empTop5,4000);
}

function callback(){
	if(httpRequest.readyState == 4){ //데이터
		if(httpRequest.status == 200 ){ //성공
		httpRequest.responseText
		document.getElementById("demo").innerHTML = httpRequest.responseText;
		}else{
			alert("실패 : " + httpRequest.status);
		}
	}
}
</script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<h3>ex04_test.jsp</h3>
<input type="button" value="ajaxTop5" onclick="empTop5()" />
<hr />
<div id="demo"></div>
</body>
</html>
