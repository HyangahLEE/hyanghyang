<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2018. 8. 23. 오후 4:05:34</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	/* 
	$("input[type='button']").click(function (){
		alert("click");
	});
	*/

	$(":button").click(function (){
		// 유효성 검사 ~
		$("form")
		   .attr("action","typhoon.do")
		   .attr("method","post")
		   .submit();
	});
	
});
</script>
</head>
<body> 
<a href="/days05/accordion.do">Accordion</a>
<hr>
<a href="http://localhost/typhoon.do">서블릿 호출</a><br>
<a href="ex02_tyhoon.jsp">서블릿 호출</a><br>
<a href="/ex02_tyhoon.jsp">서블릿 호출</a><br>
<br>
<form>
 empno : <input type="text" id="empno" name="empno" value="7566" />
 <br>
 ename : <input type="text" id="ename" name="ename" value="관리자" />
 <br>
 <input type="button" value="send" />
</form>

</body>
</html>



<!-- 
1. 동준 병원 지각 예정
2. 김의 휴가
3. 다예, 혜원, 수빈 휴가
4. 성민 휴가
5. 보모, 수진, 수지 5분 ~10분
6. 주영 지각 예정
7. 욱현 지각 예정
8. 용우 결석
9. 석화 
 -->


