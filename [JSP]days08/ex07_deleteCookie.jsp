<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String[] delete_cnames = request.getParameterValues("ckb_cookie");
Cookie[] cookies = request.getCookies();
	for(int i=0; i<delete_cnames.length; i++){
		for(int j=0; j<delete_cnames.length; j++){
			if(delete_cnames.equals(cookies[j].getName() )){
				Cookie cookie = new Cookie(delete_cnames[i],"");
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
	}
//response.sendRedirect("ex07_getCookie.jsp");
%>
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
<script type="text/javascript">
alert("쿠키삭제 완료");//경고창은 서버에서 띄울 수 없다!! //get쿠키 갔다가 뿌려짐
location.href("ex07_getCookie.jsp");
</script>
</body>
</html>
