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

<%-- downloadPath = <%= downloadPath %> --%>



<!-- jsp 기본 내장 객체 : pageContext 

    JSP 페이지  == pageContext
 1. 기본 내장 객체 얻어올 수 있다.
 2. 속성(attribute) 처리
 3. 페이지 흐름 제어(7장)
 4. 에러 데이터 구할 수 있다.
 
  - 표 5-3 pageContext.getXXX()
  HttpServletRequest request
  ServletRequest  pageContext.getRequest()
  ServletResponse pageContext.Response()
  HttpSession pageContext.getSession()
  ServletCOntext page.Context.getServletContext();
  pageContext.getOut()
  pageContext.
  pageContext.
  pageContext.

 -->
 
 <%
  HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();
 
 %>
 
 <%=request == httpRequest %>
 <br>
 
 <%
   out.println("out 객체로 출력");
 %>
 <br>
 <%
   pageContext.getOut().println(">out객체로 출력");
 %>
 
 <a href="ex100.jsp">ex100.jsp</a>
 

</body>

</html>