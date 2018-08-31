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

<!-- p132 JSP 기본 객체(9)와 영역 (scope_-->
<!-- 웹 어플리케이션의 영역
1. page(pageContext)    한 페이지   
2. request  하나의 요청
3. session  하나의 브라우저
4. application 하나의 어플리케이션

위의 4가지 영역에서 공통적으로 사용하는 메소드
getAttribute()
setAttribute()
removeAttribute()
getAttributes() -->

<%
  String name = request.getParameter("name");
  String value = request.getParameter("value");
  if(name != null  && value != null){
    //위의 4가지 영역에 값을 저장해서 읽어...	  
	pageContext.setAttribute("name", name);
    request.setAttribute("value", value);
    session.setAttribute("orderid", "p12341");
    application.setAttribute("version", "3.5.32");
    
   //response.sendRedirect("ex08.jsp");
    //RequestDispatcher dispatcher = request.getRequestDispatcher("ex08.jsp");
    //dispatcher.forward(request, response);   
   
  }

%>

<a href="ex08.jsp">ex08.jsp</a> 

</body>
</html>