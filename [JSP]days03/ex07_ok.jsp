<%@page import="java.util.Map.Entry"%>
<%@ page import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
Map<String,String[]> map = request.getParameterMap(); //Map key-value 한쌍 entry
Set<Entry<String,String[]>> set =  map.entrySet();
Iterator<Entry<String, String[]>> ir = set.iterator();

while(ir.hasNext()){
	Entry<String,String[]> entry =ir.next();
	%>
	<%=entry.getKey()%> :
	<% 
	String[] values = entry.getValue();
	for (int i = 0; i < values.length ; i++) {
		%>	<%=values[i]	%>,   
	<br>
	<%
	}
	%>
<%	
}
%>

<%-- <%
 //1. request.getParameter();
 //2. request.getParameterValues();
 //3. request.getParameterNames();
 
 //name값을 얻어오는 함수
 Enumeration<String> er = request.getParameterNames();
 while(er.hasMoreElements()){
	 String p_name = er.nextElement();
	 %>
	 <li><%=p_name%></li>
	 <%}%>
 --%>

<%-- 
<%

//request.setCharacterEncoding("ISO-8859-1"); //POST방식으로 ex07 에서 값이 넘어올때 기본적으로 설정해 주지 않으면 이걸로 설정되어서 한글이 다 깨진다.
// GET 톰캣 8 : 기본값 UTF-8
// POST : ISO-8859-1
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String address = request.getParameter("address");

	//p76 표 3.4
	String [] pets = request.getParameterValues("pet");

	String gender = request.getParameter("gender");
%>

>이름 : <%= name %><br>
>주소 : <%= address %><br>
>좋아하는 동물 : 
<% if(pets == null){ %>
없음
<%  }else{  
for (int i = 0; i < pets.length ; i++) {
%>
	<%= pets[i] %>,
<%
	}

 } %>
<br>
성별 : 
<% if(gender.equals("f"))%> 여자
<% else %> 남자 
--%>