<%@page import="java.util.Enumeration"%>
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

 <!-- p121 application 기본 내장 객체 -->

<!-- [application 객체]
   1. 웹 어플리케이션 자체 == application 객체
      - 정의 : 
   2. 모든 JSP 페이지는 하나의 application이라는 기본 객체를 공유( 전역변수)
   3. 웹 어플리 케이션의 전반에 걸쳐서 사용되는 정보를 담고 있다.
   4. 예
          ㄱ. 초기 설정 정보를 읽어올 수 있다.
          ㄴ. 서버 정보를 읽어올 수 있다.
          ㄷ. 웹 어플리케이션이 제공하는 자원(파일)을 읽어올 수 있다.
   5. 웹 어플리케이션 초기화 파라미터 읽어오기.
       ㄱ. web.xml 파일 <context-param> 태그 사용
      ㄴ. application.getInitParameter()
      application.getInitParameterNmaes()

 -->

<%
  Enumeration<String> en = application.getInitParameterNames();
   while(en.hasMoreElements()){
	   String paramName = en.nextElement();
	   String paramValue = application.getInitParameter(paramName);
	%>
	   
	 <%= paramName %> - <%= paramValue %><br>  
	   
	  <%  
   }   

%>


 
 </body>
</html>