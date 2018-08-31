<%@page import="java.sql.SQLException"%>
<%@page import="com.util.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="days10.Member"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String memberid = request.getParameter("memberid");


PreparedStatement pstmt = null;
String sql = " delete from member where memberid= ? ";
String url ="ex01.jsp";

try (Connection conn = ConnectionProvider.getConnection();){
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, memberid);
	int cnt = pstmt.executeUpdate();
	
	if(cnt==1){
		/* HttpSession session = request.getSession(); */
		session.invalidate();
	}
} catch (Exception e) {
	System.out.println("> ex02_deletemember : "+ e.toString());
	/* url += "?error=0001"; */ //삭제전 페이지
}finally {
	if(pstmt !=null)try {	pstmt.close();	} catch (SQLException e) {	e.printStackTrace();	}		
	response.sendRedirect(url);
}

%>
