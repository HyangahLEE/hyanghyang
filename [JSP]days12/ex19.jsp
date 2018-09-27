<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%%>
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
<!-- p303 EL 표현식에서 사용할 수 있는 문자열 메소드 -->
<c:set var="rrn" value="123456-7891345"/>
1. rrn : ${ rrn }<br>
2. rrn 문자열 길이 :${fn:length(rrn) }<br>
${ fn:endsWith(rrn,"345") }<br>
${fn : substring(rrn,2,4) }

</body>
</html>
