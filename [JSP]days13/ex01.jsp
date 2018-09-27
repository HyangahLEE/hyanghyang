<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

/* p516
모델 1 - 한 JSP파일에 스크립트릿으로 디비연결에서 하나의 페이지에 모두 하는것

모델 2 - 서블릿으로 나눠서 처리 
---------------------------------------
Model - 비즈니스의 로직을 처리한다. (실제 로직처리하는 클래스)
Controller(서블릿) -  모든 요청을 받고 응답해주는 하나의 서블릿(로직처리하는 클래스를 찾아 일을 시킨다.받은 결과물을 받아서 VIEW(JSP파일)에 포워딩) -중앙제어
View(jsp) - 보여줌 (출력)
☞  확장, 유지보수 용이
*/
String command = request.getRequestURI();
%>
<%-- command=<%=command %><br> <!-- /days13/ex01.jsp --> --%>
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
</head>
<body>
<!-- a태그는 properties파일에서 키값!! -->
<a href="${pageContext.request.contextPath }/days13/hello.do">/days13/hello.do</a><br>
<hr>
<a href="${pageContext.request.contextPath }/days13/mvc/view.do?cmd=hello">/days13/mvc/view.do?cmd=hello</a><br>

<a href="${pageContext.request.contextPath }/controllerUsingFile?cmd=hello">/controllerUsingFile?cmd=hello"</a><br>

<!-- p514 url 패턴 매칭 규칙 중요!!! -->
<h3>ex01.jsp</h3>
<a href="<%=request.getContextPath() %>/days13/mvc/view.do">view.do</a><br>
<a href="${pageContext.request.contextPath }/days13/mvc/view.do">view.do</a><br>

<a href="${pageContext.request.contextPath }/days13/mvc/view.do?type=greeting">view.do?type=greeting</a><br>
<a href="${pageContext.request.contextPath }/days13/mvc/view.do?type=date">view.do?type=date</a><br>
<a href="${pageContext.request.contextPath }/days13/mvc/view.do?type">view.do?type</a><br>

<!-- p528 커맨드 패턴 기반의 코드 
	웹 브라우저를 통해서 명령어를 전달하는 방법은 2가지
		1) 특정 이름의 파라미터에 명령어 정보를 전달하는 방법
			> http://localhost/board?type=1 글쓰기
			> http://localhost/board?type=2&seq=2 글보기
			> http://localhost/board?type=3 글수정
			> http://localhost/board?type=4&seq=100 글삭제
		2) 요청 URI 자체를 명령어로 사용하는 방법
			> http://localhost/board/write		글쓰기
			> http://localhost/board/delete/100  글삭제
			> http://localhost/board/view/20 	글보기
		
		
> 서블릿이 요청을 받는다 -> 어떤 요청인지 분석 -> 그 일을 수행하는 명령객체를 찾아서 일을 시킨다. -> 모델이 명령을 수행하고 돌려주는 값이 같아야한다 ( interface - handler )
-->
<!-- 
컨트롤러
days13.mvc.controller.ControllerUsingFile.java -->
</body>
</html>
