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
	
});
</script>
</head>
<body>
<!-- p426 웹 어플리케이션의 일반적인 구성 및 방명록 구현
1. 웹 어플리케이션의 전형적인 구성요소
p429 그림 15.5
	[DB서버]		[톰캣WAS+웹서버]<-요청 <-[브라우저]
					board.jsp-> 응답 ->
	서블릿 			board.do
	포워딩
	board.jsp				->응답
	
	DAO					Service클래스	 	<-게시글쓰기
						트랜잭션처리
	게시글등록()*			게시글등록서비스()
	포인트증가()+1
	------------------------------------------
	
p431 CRUD [Create - Read - Update - Delete]
p431 DAO 에서 Connection에 접근하는 방식
 		--Spring [DI] 의존성 주입, AOP 개념
	1. DAO 클래스의 메서드에서 직접 Connection 객체를 생성
	2. DAO 객체를 생성할 때 생성자로 Connection 객체를 전달받기 - 생성자를 통한 DI
	3. DAO 클래스의 메서드 파라미터로 Connection 객체를 전달받기 - Setter를 통한 DI
	
	>> DAO는 Connection객체가 있어야 일을 할 수 있다.(의존관계)
	>> 
 -->
</body>
</html>
