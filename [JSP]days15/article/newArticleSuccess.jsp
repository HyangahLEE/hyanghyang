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
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<h3>newArticleSuccess</h3>
게시글을 등록 했습니다.
<br>
<a href="/days15/article/list.do">게시글 목록</a>
<%-- 
${ctxPath = pageContext.request.contextPath }
<a href="${ ctxPath}/days15/article/list.do">게시글 목록</a> --%>
</body>
</html>
