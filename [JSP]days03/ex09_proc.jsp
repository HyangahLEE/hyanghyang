<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String deptno = request.getParameter("deptno");
	//***[리다이렉트] 서버에서 페이지 이동.   /* p95 */
	//vs 포워딩(클라로 안가고 서버가 읽어서(request객체유지) 바로 브라우저에 응답)
	response.sendRedirect("ex05.jsp?deptno="+ URLEncoder.encode(deptno,"utf-8"));
	//한글일 경우에는 post로 받을때 깨지기 때문에 인코딩 해준다 
	//리다이렉트 - 서버에 왔던게 클라한테 다시 응답(ex090로 가래!)을 한다. 브라우저(ex09는)는 다시ex05를 요청


%>
<%-- deptno = <%=deptno %> --%>