<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.multipart.FileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String saveDirectory = pageContext.getServletContext().getRealPath("/days17/upload");//물리적 데이터 경로 얻기
System.out.println(saveDirectory);
//day17/upload 폴더 생성이 안되어 있으면 생성
File saveDir = new File(saveDirectory);
if(!saveDir.exists()) saveDir.mkdirs();

int maxPostSize=1024*1024*5; //5MB 단위BYTE
String encoding="UTF-8";
FileRenamePolicy policy = new DefaultFileRenamePolicy();//중복 파일일 경우 뒤에 1,2 붙인다.

//객체 생성될 때 성성자의 파라미터 값으로 예외 발생하지 않으면, 자동 파일 업로드 성공 
MultipartRequest mrequest = new MultipartRequest(request,saveDirectory, maxPostSize, encoding, policy); //

String name = request.getParameter("name");
//String upload = request.getParameter("upload");
File uploadFile = mrequest.getFile("upload");
long uploadFile_length = uploadFile.length();
String originalFileName = mrequest.getOriginalFileName("upload");
String filesystemName = mrequest.getFilesystemName("upload");
%>

> 이름 : <br>
> 첨부된 파일 명 :<%=uploadFile.getName() %> <br>
> 첨부된 파일 크기 : <%=uploadFile_length %>bytes <br>
<%/* 
1. http://www.servlets.com/cos/
2. cos-26Dec2008.zip
3. lib> cos.jar 
4. post , multipart/form-data 설정
5. ex01_01.jsp name=nullx
	cos.jar 안의 MultipartRequest 객체를 생성해서 사용...
6.MultipartRequest클래스
MultipartRequest mrequest = new MultipartRequest(ㄱ,ㄴ,ㄷ,ㄹ,ㅁ);
	ㄱ. request
	ㄴ. saveDirectory 	저장할 경로
	ㄷ. maxPostSize 		최대 파일 크기
	ㄹ. encoding 		파일 인코딩 방식
	ㅁ. policy 			파일 저장 정책
	
	*/
%>
