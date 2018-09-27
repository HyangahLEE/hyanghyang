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
<!-- 
서블릿의 라이프 사이클을 통괄하는 - 웹컨테이너
context-param = 톰캣이 스타트 될때 초기화(웹 어플리케이션 시작 될때 )
init-param = 서블릿이 스타트 될때 초기화


create table board_member(
  memberid varchar2(50) primary key
  ,name varchar2(50) not null
  ,password varchar2(10) not null
  ,regdate date default sysdate
)

create table board_article(
article_no number primary key,
writer_id varchar2(50) not null,
writer_name varchar2(50) not null,
title varchar2(255) not null, 
content clob ,
regdate date default sysdate not null, 
moddate date ,
read_cnt number
)
create sequence seq_board_article;
 -->
</body>
</html>
