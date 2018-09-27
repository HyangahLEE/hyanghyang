<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileReader"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#path").change(function(){
		$("form").submit();
		
	});
});
</script>
</head>
<body>
<%
ArrayList<String> fileList = new ArrayList<>();
String dirPath = getServletContext().getRealPath("/days01");
File file = new File(dirPath);
File[] flist = file.listFiles();
for(int i=0; i<flist.length; i++){
	fileList.add(flist[i].getName());
}
request.setAttribute("fileList", fileList);
%>
<h3>소스 보기</h3>
<form>
<select name="path" id="path">
	<c:forEach items="${fileList}" var="fname">
		<option value="/days01/${fname}">${fname}</option>
	</c:forEach>
</select>
</form> 

<%
	FileReader reader = null;
	try{
		String path = request.getParameter("path");
		/* String realPath = getServletContext().getRealPath("/days01/"+path); */
		String realPath = getServletContext().getRealPath(path);
		System.out.println(realPath);
		reader = new FileReader(realPath); %>
		
	<pre>
		<c:out value="<%=reader%>" escapeXml="true" />
	</pre>
<%	}catch(Exception e){ %>
	Error :<%=e.toString() %>
<%}finally{
		if(reader != null)
			reader.close();
	} %>
</body>
</html>
