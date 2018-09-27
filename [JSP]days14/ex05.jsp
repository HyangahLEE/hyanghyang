<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% request.setCharacterEncoding("utf-8");%>
<%-- <fmt:requstEncoding value="UTF-8"/> --%>
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
<!-- p314 -->
<!-- [ p315 국제화 태그 ]
국제화 태그는 특정 지역에 따라 알맞은 메시지를 출력할 때 사용.
한글 브라우저에서 접수속 /단위: 원 /날짜,시간 : 한국시간
 -->
 <!-- P324 숫자 및 날짜 포맷팅 처리 태그 
 fmt:formatNumber 숫자 -> 형태의 문자열로 변환
 fmt:parseNumber 형태 문자열 -> 숫자
 
 -->
 <% String price = "12345";
 // 3자리 마다 콤마 출력 원 12,345
 	String v = "123,123,98";
 %>
 > price : <%=price %>
 <fmt:formatNumber value="<%=price %>" pattern="##,###.00" var="num"/>
 > price : ${num }
 <fmt:parseNumber value="<%=v %>" pattern="000,000.00" var="money"/>
 > money : ${money }
 
 <hr>
 통화 : <fmt:formatNumber value="<%=price %>" type="currency" currencySymbol="" groupingUsed="true"/>
</body>
</html>
