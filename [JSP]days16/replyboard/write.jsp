<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
  a{
     text-decoration: none;
     color:black;
   }
   table,  tr, td {
    border-radius: 3px;
   }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

<form action="write.do" method="post">
 <table width="600px" style="margin:50px auto" border="1">
   <tr>
     <td colspan="2" align="right">
       <a href="list.do">글목록</a>
     </td>
   </tr>
   <tr>
     <td width="70" align="center">작성자</td>
     <td width="330">
       <input type="text" name="writer" size="12" >
     </td>
   </tr>
   <tr>
     <td width="70" align="center">이메일</td>
     <td width="330">
       <input type="text" name="email" size="30" >
     </td>
   </tr>
   <tr>
     <td width="70" align="center">제목</td>
     <td width="330">
       <input type="text" name="subject" size="50" 
       value='<c:if test="${ not empty param.ref }">[답글]</c:if>' >
     </td>
   </tr>
   <tr>
     <td width="70" align="center">내용</td>
     <td width="330">
       <textarea rows="13" cols="50" name="content"></textarea>
     </td>
   </tr>
   <tr>
     <td width="70" align="center">비밀번호</td>
     <td width="330">
       <input type="password" name="pass" size="10" >
     </td>
   </tr>
   <tr>
     <td colspan="2" align="center">
       <input type="submit" value="글쓰기">
       <input type="reset" value="다시작성">
       <input type="button" value="글목록" 
       onclick="location.href='list.do'">
     </td>
   </tr>
 </table>
 	<!-- 답글 쓰기 : 부모글에 대한 정보 -->
    <input type="hidden" name="p_num"  value="${ param.num }">
    <input type="hidden" name="p_ref"  value="${ param.ref }">
    <input type="hidden" name="p_step"  value="${ param.step }">
    <input type="hidden" name="p_depth"  value="${ param.depth }">
</form>

</body>
</html>
