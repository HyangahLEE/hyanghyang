<%@ page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  Date now = new Date();
	String name = "hyangah";
	int age = 20;
	String today = getNow();

	//p65
	//[ JSP 스크립트 요소 ] ? JSP 프로그래밍의 로직을 수행할 때 필요한 요소 (java의 로직을 처리하는 부분)
	//1. 스크립트릿 ( Scriptlet ) 
	//		> jsp 페이지에서 자바 코드를 실행할 때 사용하는 코드 블록. 
	//		> 문법 : <%   자바코딩 .
	//			  		
	//2. 표현식 ( Experssion ) : (표현언와(EL)와는 다름) <%=
	//3. 선언부 ( Declaration ) : 스크립트릿, 표현식에서 사용할 메서드를 선언하는 요소 <%!
	//<%로시작하면 무조건 서버에서 실행하는 것
%>
<%!
  public String getNow(){
	return new Date().toLocaleString();
}
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
<!-- p 67 4.2 표현식 : 어떤 값을 출력 결과에 포함시키고자 할 떄 사용하는 스크립트 요소 중의 하나  -->
<!-- 요청은 웹서버, 컴파일하고 처리하는건 웹어플리케이션 서버 -->
<h3> Now : <%= now.toLocaleString() %>  </h3>
<h3> Name : <%= name  %>  </h3>
<h3> Age : <%= age  %>  </h3>
<hr>
<h3> Today : <%= today %>  </h3>
<h3> Today : <%= getNow() %>  </h3>
</body>
</html>