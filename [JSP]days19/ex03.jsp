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
var member = { "name":"이향아" , "age":25 };
console.log(member.name + "/" + member.age );
</script>
</head>
<body>
<!-- 
Json 표기법

var arr = []; == new Array();
var obj = {}; == new Object();

2. Json 구조 
	{ Json 표기법 2가지 }
	ㄱ. { name : value } -> { 문자열 : 배열,객체,문자열.. }
	ㄴ. { 리스트 (array, vector, list, sequence) }

  ex)
  var myInfo = 	{ 
  	"id" : "dlgiddk20" ,"name" : "홍길동" , "age" : 25 
  	, "junsu" : [90,75,80] 
  	, "friends" : [{"name" : "홍길동" }, {"name" : "김이슬" }, {"name" : "최수진" } ] 
  	}
  	
  	myInfo.id > dlgiddk20
  	myInfo.jumsu[0] > 90
  	myInfo.friends[0].name > "홍길동" -->


<!-- 
1. Member 클래스 js 선언 + prototype.함수이름 추가
2. Object 타입으로 객체를 생성 + 멤버 확장
..
//별도로 Member 클래스를 선언(정의)하지 않고, 그 떄 한번만 사용할 객체가 필요하다면 아래와 같이 사용


var mem = new Object();
mem.id = "dlgiddk20";
mem.name = "이향아";
mem.securityNo = "1234";
mem.toString = function(){}
mem.getAge = function(){}

 -->
</body>
</html>
