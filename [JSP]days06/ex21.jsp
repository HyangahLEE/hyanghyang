<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

<!-- ex21.jsp -->
<form action="<%= request.getContextPath() %>/days06/ex21_ok.jsp">
보고 싶은 페이지 선택하세요. <br>
  <select name="code" id="code">
    <option value="a">ex01 페이지</option>
    <option value="b">ex02 페이지</option>
    <option value="c">ex03 페이지</option>
  </select>
 <input type="submit" />
</form>

</body>
</html>