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
1. prototype을 사용한 자바스크립트 클래스 만들기 
	js : Date, String 등등 내장된 객체(클래스)
	 -> 사용자가 js클래스 정의할 수 있다. 
2. js 클래스 선언 형식
	클래스 이름 = function (파라미터){
		
	}
	ex) Member 클래스 선언...
	Member = function(id, name){
		this.id= id;
		this.name = name;
	}
	
	클래스이름.prototype.함수이름 = function(파라미터){
	}
	
	var m = new Member('hong','홍길동');

</body>
</html>
