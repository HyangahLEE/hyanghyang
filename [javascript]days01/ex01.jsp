 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function btn_click2(){
	var output = document.getElementById('demo');
	var msg = document.getElementById('txtMsg').value;
	/* window.alert(msg.value); */
	/* console.log(msg.value); */
	output.innerHTML= msg;
}	
function light_on(){
	var lightImg= document.getElementById('light');
	lightImg.src="../images/pic_bulbon.gif";
}
function light_off(){
	
	var lightImg= document.getElementById('light');
	lightImg.src="../images/pic_bulboff.gif";
}

 
</script>
</head>
<img id="light" onmouseenter="light_on()" onmouseleave="light_off()" src="../images/pic_bulboff.gif" alt="" /><body>

<hr>
<p id="demo"></p>
<button type="button" onclick="document.getElementById('demo').innerHTML='Hello world'"><span>클릭 1</span></button> <br>

메시지 : <input type="text" id="txtMsg" value="hello world"/>
<br>
<input type="button" value="클릭2" onclick="btn_click2();"/><br>
</body>
</html>