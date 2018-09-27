<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.multipart.FileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String saveDirectory = pageContext.getServletContext().getRealPath("/days17/upload");
System.out.println(saveDirectory);
//day17/upload 폴더 생성이 안되어 있으면 생성
File saveDir = new File(saveDirectory);
if(!saveDir.exists()) saveDir.mkdirs();

int maxPostSize=1024*1024*5; //5MB 단위BYTE
String encoding="UTF-8";
FileRenamePolicy policy = new DefaultFileRenamePolicy();

//객체 생성될 때 성성자의 파라미터 값으로 예외 발생하지 않으면, 자동 파일 업로드 성공 
MultipartRequest mrequest = new MultipartRequest(request,saveDirectory, maxPostSize, encoding, policy); //

String name = request.getParameter("name");
%>
> 이름 : <br>
<%
//String upload = request.getParameter("upload");

Enumeration en = mrequest.getFileNames();
while(en.hasMoreElements()){
	String fileName = (String)en.nextElement();
	
	File uploadFile = mrequest.getFile(fileName);
	long uploadFile_length = uploadFile.length();
	String originalFileName = mrequest.getOriginalFileName(fileName);
	String filesystemName = mrequest.getFilesystemName(fileName);
%>
> 첨부된 파일 명 :<%=uploadFile.getName() %> <br>
> originalFileName : <%= originalFileName%><br>
> filesystemName : <%= filesystemName%><br>
> 첨부된 파일 크기 : <%=uploadFile_length %>bytes <br>
<hr>
<%
}

%>




