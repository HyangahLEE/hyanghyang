<%@page import="com.util.ConnectionProvider"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>커넥션 풀</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<!-- p415 커넥션 풀(Connection Pool) 
https://tomcat.apache.org/tomcat-8.5-doc/jndi-datasource-examples-howto.html#Database_Connection_Pool_(DBCP_2)_Configurations
WEB-INF -> lib -> tomcat-dbcp.jar(C:\apache-tomcat-8.5.32)

톰캣(WAS)가 제공하는 커넥션 풀 사용
-->
<% 
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();

%>
<%=conn %>

<% Connection conn2 = ConnectionProvider.getConnection();%>
<%=conn2 %>
</body>
</html>
