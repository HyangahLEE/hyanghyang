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
<h3>ex10_default.jsp(메인페이지)</h3>
<c:if test="${empty sessionScope.member }">
<a href="<%=request.getContextPath() %>/days14/member/ex10_logon.jsp">로그인</a><br>
</c:if>
<c:if test="${not empty sessionScope.member }">
<!-- 로그인됐으니까 로그아웃으로 떠야함 -->
<a href="<%=request.getContextPath() %>/days14/member/ex10_logout.jsp">로그아웃</a><br>
</c:if>

<a href="<%=request.getContextPath() %>/days14/board/ex10_list.jsp">게시판</a><br>
<a href="<%=request.getContextPath() %>/days14/hyang/ex10_hyang.jsp">관리자</a><br>
<br>
<c:if test="${param.error eq '1004' }">
	<span id="xxx" style="color: red;font-weight: bold">관리자로 로그인 하세요.</span>
</c:if>
<a href="<%=request.getContextPath() %>/days14/notice/ex10_notice.jsp">공지사항</a><br>
<script type="text/javascript">
$("#xxx").fadeOut(3000);
</script>
</body>
</html>
