<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- ?id=관리자 -->
<!-- id 파라미터 값이 관리자면 ex03.jsp로 이동
아니라면 ex04.jsp  -->
<% 
request.setCharacterEncoding("UTF-8");
String pid= request.getParameter("id");
//System.out.println(pid);

String url =  pid.equals("관리자") ? "ex03.jsp" : "ex04.jsp";

//1. 서버에서 페이지 이동 : sendRedirect()
// ex02(서버)가 ex01로 응답해서   클라가 다시 서버한테 알려줘서 그 후에 3or 4로
// resp req 정보 유지 x
//response.sendRedirect(url+"?id="+URLEncoder.encode(pid,"utf-8"));

//2. 포워딩****: 
//Dispatcher
//배분할 객체 생성
//클라는 ex02를 요청(), 서버가 바로 ex03 or ex04를 응답
// resp req 정보 유지 o
RequestDispatcher dispatcher = request.getRequestDispatcher(url+"?id="+URLEncoder.encode(pid,"utf-8"));
dispatcher.forward(request, response);

%>