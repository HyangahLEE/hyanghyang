<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   request.setCharacterEncoding("utf-8");
%>
<%-- <%
   String grade = request.getParameter("grade");
%>

grade = <%=grade %> --%>


grade = ${param.grade }
<div class="header">
   <h1>My Website - <%=request.getParameter("title") %></h1>
   <p>Resize the browser window to see the effect.</p>
</div>

<div class="topnav">
   <a href="/days06/main.jsp">홈</a>
   <a href="/days06/ex16.jsp">게시판</a> <a href="/days06/ex17.jsp">도움말</a> <a href="#">일정관리</a> <a
      href="#" style="float: right">Link</a>
</div>