<%@page import="java.util.Enumeration"%>
<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
//수정할 쿠키이름을 갖고 있는 배열..
//?ckb_cookie=a&ckb_cookie=d
String[] edit_cnames = request.getParameterValues("ckb_cookie");

%>
<%
if(request.getParameter("editbtn") != null){
	/*  System.out.println("수정버튼 눌러서요청됨");  */
	
	Enumeration<String> en = request.getParameterNames();
	while(en.hasMoreElements()){
		String cname = en.nextElement();
		if(!cname.equals("editbtn")){		
		String cval = URLEncoder.encode(request.getParameter(cname),"utf-8");
		
		Cookie cookie = new Cookie(cname, cval);
		response.addCookie(cookie);
		}
	}
	
	response.sendRedirect("ex07_getCookie.jsp");
	return;
	
	
}else{
	System.out.println("getCookie.jsp요청됨");
	
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<form>
<ol>
<%
	Cookie[] cookies =request.getCookies();//전체쿠키
	for(int i=0; i<edit_cnames.length; i++){
		String cname = edit_cnames[i];
		for(int j=0; j<cookies.length; j++){
			if(cookies[j].getName().equals(cname)){
				String cvalue = URLEncoder.encode(cookies[j].getValue(),"utf-8");
				%>
				<li>
				<%= cname %> = <input type="text" name="<%= cname %>" value="<%= cvalue %>" />
				</li>
				<%				
			}
		}
	}
%>
</ol>
<input type="submit" name="editbtn" value="쿠키 수정 저장"/>
</form>
</body>
</html>
