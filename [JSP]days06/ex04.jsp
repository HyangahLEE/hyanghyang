<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.InputStream"%>
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

<!-- p127 웹 어플리케이션 자원 구하기. -->

<%
  char [] buff = new char[128];
  int len = -1;
  //절대경로가 아닌 웹 어플리케이션 / 기준으로 경로 표시해서 사용한다.
  String filePath = application.getRealPath("/days06/ex01.jsp");
		  try(InputStreamReader fr = new InputStreamReader(new FileInputStream(filePath), "UTF-8")){
			while((len=fr.read(buff)) != -1){
				out.print(new String(buff, 0, len));
			}
		  }catch(Exception ex){
			  out.println("익셉션 발생 : " + ex.toString());
		  }
		  

%>


</body>
</html>