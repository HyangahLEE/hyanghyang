<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/el-function.tld"%>
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
<!-- 
1. EL정적 (static) 메서트 호출하는 방법
	1) FormatUtil 클래스 선언
	정적메서드 2개 : number(), date()
	2) TLD
		ㄱ. WEB-INF/tlds 폴더 생성
		ㄴ. el-functions.tld 파일추가 (XML파일) :설정파일
	3) web.xml 
		ㄱ. TLD 파일 설정 추가
	4) EL 에서 함수 사용하기
		ㄱ. tablib 설정
		ㄴ. EL접두어를 사용해서 함수 호출
		 -->
<%
	request.setAttribute("price", 12345);
%>

오늘은 ${ elfunc:formatNumber(price,'#,##0') }입니다.
</body>
</html>
