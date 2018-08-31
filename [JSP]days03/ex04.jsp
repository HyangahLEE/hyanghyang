<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% //service(){ 지역변수 선언 }
	String pkor = request.getParameter("kor"); 
	System.out.println("pkor= "+pkor);
	/* 제스퍼 in 아파치 톰캣 -> jsp파일을 서블릿 형태(ex04_jsp.java)로 만든다.(랜더링) */
%>
<%!
int age =0; //필드
public void testDisp(){}// 메서드
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box{
font-size: 20pt;
font-weight: bold;
color: red;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		
		$("form").submit(function(event) {
			if (!$("#kor").val().trim()) {
				alert("필수 입력!"); 
				$("#demo").empty();
				event.preventDefault();
			}

			var kor = Number($("#kor").val());
			if (0 > kor || kor > 100) {
				alert("입력잘못(0~100)");
				event.preventDefault();
				$("#kor").select();
			}
		});
	});
</script>
</head>
<body>
	<form action="">
		국어 점수 : <input type="text" id="kor" name="kor" value="<%=pkor==null?"":pkor %>" />
	</form>
	<div id="demo"></div>
<%

if(pkor !=null){
	int kor = Integer.parseInt(pkor);
	switch(kor/10){
	case 10:case 9:
		//out.append("<span class='box'>수</span>");
%>
<span class='box'>수</span>
<%
		break; 
	case 8:
%>
<span class='box'>우</span>
<%
		//out.append("<span class='box'>우</span>");
		break;
	case 7:
%>
<span class='box'>미</span>
<%		//out.append("<span class='box'>미</span>");
		break;
	case 6:
%>
<span class='box'>양</span>
<%
		//out.append("<span class='box'>양</span>");
		break;
	default:
%>
<span class='box'>가</span>
<%
		//out.append("<span class='box'>가</span>");
		break;
	}
	
}
%>
<script type="text/javascript">
$("#kor").select();
</script>
</body>
</html>