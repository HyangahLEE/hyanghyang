<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<!-- 
[ p 498 서블릿 ]
1. 서블릿 ? jsp 표준이 나오기 전에 만들어진 표준. 
2. 서블릿 규약에 따라 자바 코드를 작성. (서블릿 규약을 따르는'클래스'  - 서블릿)
	자바 코드를 컴파일 해서 클래스 파일 생성. 
	클래스 파일(???.class)을 /WEB-INF/classes 폴더에 패키지에 알맞게 위치 -이클립스에서는 자동으로 됨
	web.xml( dd파일 )파일에 서블릿 클래스를 설정(등록) p514 web.xml 이 규칙에 해당아흔 ㄴ서블릿 객체를 찾아 반환
	톰캣 등의 웹 컨테이너(서블릿 객체)를 실행한다. -> 웹브라우저에서 확인
3. p 514 URL 패턴 매핑 규칙
	ㄱ. <servlet-mapping>태그는 
		<url-pattern> 태그를 사용해서 그 서블릿 이름이 어떤 패턴이 사용되었는지에 따라 객체를 매핑
	ㄴ. @WebServlet 어노테이션을 사용해서 urlpattern 설정해서 매핑
	ㄷ. 서블릿 규약에 따르면 URL 패턴을 설정하는 규칙 
		1) / 로 시작하고 /*로 끝나는 경로 매핑..  ex) /test/days01/*
		2) *.확장자 로 시작하는 경로 매핑..  ex) *.do
		3) 오직 / 만 포함하는 경우 어플리케이션의 기본 서블릿으로 매핑한다. ex) /
		---- 패턴
		4) 이 규칙 외, 나머지 다른 문자열은 정확한 매핑을 위해서 사용한다.
		---- 정확한 url
 -->
</body>
</html>