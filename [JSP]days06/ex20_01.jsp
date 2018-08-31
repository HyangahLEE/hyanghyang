<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
   //?name=hong
   /* String pname = request.getParameter("name"); */
   //response.sendRedirect("ex20_02.jsp");

   /* RequestDispatcher dispatcher =  request.getRequestDispatcher("ex20_02.jsp");
   dispatcher.forward(request, response); */
   
   request.setAttribute("age", 20);
   
   String tel ="010-2712-1476";
   
%>
<%-- > pname : <%=pname %>;	 --%>

<jsp:forward page="ex20_02.jsp">
  <jsp:param value="seoul" name="addr"/>
  <jsp:param value="<%= tel %>" name="tel"/>
</jsp:forward>