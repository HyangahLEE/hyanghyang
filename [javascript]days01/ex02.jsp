<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){ /* j쿼리를 사용할 수 있도록 준비가 되어졌을 때. */
	/* id명이 btn이라는 jqeury객체를 클릭하면 익명함수 실행 */
	$("#btn").click(function(){
		// var msg = $("#txtmsg").text();
		//var msg = $("#txtmsg").html();
		 var msg = $("#txtmsg").val();
		 window.alert(msg); //undefined
	});
});
</script>
<script>
/* 자바스크립트가 html의 기본 스크립트 언어 이기 때문에 type속성 생략 가능  */
  function btn_exec(){
	var msg =  document.getElementById("txtmsg").value;
	window.alert( msg); 		
}

</script>
</head>
<body>

<!--  [자바 스크립트 (Javascript)]
1. 스크립트 언어
2. script language? 
	ㄱ. 컴파일을 하지않고 작성해서 바로 실행 시킬 수 있는 언어. 
	ㄴ. 컴파일 하지 않고 변수 타입을 선언하지 않는다는 특징이 있다. 
	ㄷ. 대표적 스트립어 언어로는 자바스크립트, Perl 등이 있다 .
3. HTML 문서의 정적이고 단조로운 한계를 극복하기 위해 넷스케이프(Netscape)사가 만든 livescript가 그 이름을 달리 한 것
4. 브라우저 자체에 내장된 해석기능을 이용한 클라이언트(client) 기반의 일종의 스크립트 언어이다.
5. 작고도 빠르기 때문에 웹문서를 동적으로 꾸밀 때 가장 널리 쓰인다.
6. Javascript 가 할 수 있는 일
	ㄱ. html content(내용) 변경
	ㄴ. html 속성			   변경 - 추가/수정/삭제
	ㄷ. html css 		   변경 -	추가/수정/삭제
	ㄹ. html element(요소) 변경 - 요소 추가/수정/삭제
7. javacript 코딩은 html 문서 안에 <sctipt>태그 안에 코딩...
8. <sctipt> 태그는 head,body 태그 안에 선언 할 수 있다 .
9. 				 ???.js 외부의 독립적인 파일로 생성 -> 참조 

-->

메시지 : <input type="text" id="txtmsg" name="txtmsg" autofocus="autofocus" /> <br>
<button type="button" onclick="btn_exec()" >js - 실행</button>
<button type="button" id="btn">jquery - 실행</button>

<script type="text/javascript">
/* 속도 향상 도움 > 브라우저가 html을 모두 처리한 후 에 스크립트 처리를 하기 때문에. */
</script>

</body>
</html>