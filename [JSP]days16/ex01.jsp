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
<a href="/days16/replyboard/list.do">list.do</a>
<!-- days16 폴더와 패키지 생성 + ex01.jsp
	> replyboard 폴더
1. 답변형 게시판
2. 글쓰기 : 새글 또는 답변

-------------------------------------------------------
[웹페이지 출력]
글번호 	제목			작성자		작성일		조회수		그룹컬럼(group)		그룹순서(step)		깊이컬럼(depth)
3		아아			강다예		20180911	0	+2		1
4		ㄴ[답글]ㅇ?   김수지		20180912	0
6		 ㄴ[답글]하..	홍길동		20180912	4	

2		우엑			이향아		20180910	4 	+1
5		ㄴ[답글]ㄴㄴ     홍정희		20180912	0

1		쉬고싶다		이향아		20180910	13

[클릭]->3 글번호 게시글 [보기] ->[답글(부모글번호3..pk)] 
>>
select * from replyboard
order by 글번호 desc
-------------------------------------------------------
[테이블]
1		우엑			이향아		20180910	13
2		쉬고싶다		이향아		20180910	4
3		아아			강다예		20180911	0
4		[답글]ㅇ?   김수지		20180912	0
5		[답글]ㄴㄴ     홍정희		20180912	0
 -->
</body>
</html>
