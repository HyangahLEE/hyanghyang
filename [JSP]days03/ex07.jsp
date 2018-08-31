 b<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<a href="ex07_ok.jsp?name=누구냐&address=어디냐">링크</a>
<h3>request - 요청 파라미터 처리</h3>
<form action="ex07_ok.jsp" method="get">
이름 : <input type="text" name="name" value="이향아"/><br>
주소 : <input type="text" name="address" value="서울 강남"/><br>

<hr>
좋아하는 동물 : 
<input type="checkbox" name="pet" value="dog" checked="checked"/>개
<input type="checkbox" name="pet" value="pig"/>돼지
<input type="checkbox" name="pet" value="cat"/>고양이
<br>

성별 : 
<input type="radio" name="gender" value="f" checked="checked"/> 여
<input type="radio" name="gender" value="m"/> 남
<input type="submit" />
</form>
</body>
</html>