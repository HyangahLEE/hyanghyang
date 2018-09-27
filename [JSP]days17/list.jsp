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
<h3>FileList - list.jsp</h3>
<table style="width:600px" border="1" align="center">
  <tr>
    <td align="right" colspan="4">
       <a href="write.do">WRITE</a>
    </td>
  </tr>
  <tr>
    <td align="center" width="50">글번호</td>
    <td align="left" >제목</td>
    <td align="center" width="200">첨부파일</td>
    <td align="center" width="50">삭제</td>
  </tr>
  <c:forEach items="${ list }" var="dto">
	  <tr>
	    <td align="center" width="50">${ dto.num }</td>
	    <td align="left" >${ dto.subject }</td>
	    <td align="center" width="200">
   <a href="/days17/upload/${ dto.fileSystemName}">
   ${ dto.originalFileName}
   </a>
	      </td>
	    <td align="center" width="50">
	       <a href="delete.do?num=${ dto.num }&fileSystemName=${ dto.fileSystemName}">삭제</a>
	       <a href="update.do?num=${ dto.num }&fileSystemName=${ dto.fileSystemName}">수정</a>
	    </td>
	  </tr>
  </c:forEach>
</table>
</body>
</html>
