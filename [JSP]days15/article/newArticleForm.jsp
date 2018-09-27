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
<h3>newArticleForm</h3>
<form action="/days15/article/write.do" method="post"><!-- post 중요 -->
글쓴이 ID : <input type="text" name="writer_id"/><br>
글쓴이 이름 : <input type="text" name="writer_name"/><br>
제목 : <input type="text" name="title"/><br>
내용 : <input type="text"name="content" /><br>
<input type="submit" value="저장" />
<input type="reset" value="취소"/>
</form>
</body>
</html>
