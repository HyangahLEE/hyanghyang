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


<%-- 
p250 표현 언어 (Expression Language)
1. 다른 형채의 스크립트 언어, 스크립트 요소 중의 하나 
	스크립트 요소? 3가지 
2. 표현언어 (EL) 사용하는 이유?
 	표현식 보다 간결, 편리 -> 유지보수 쉽다.
3. 표현언어는 JSTL 1.0 규약에 소개된 내용이다. 
	JSP 2.0 버전부터 표현언어가 JSP에 포함 되어졌다.
	EL 3.0 문법...
4. EL 제공하는 기능
	ㄱ. JSP 제공하는 4가지 영역의 속성 사용
	( page, request, session, application) 
	 p254 표 11.1
	 pageScope, requestScope, applicationScope, sessionScope 
	ㄴ. 수치연산, 관계연산 , 논리 연산자 제공
	${ eq }
	${ == }
	${  5/8 + 5 div 8}
	${ 5 % 8 +5 mod 8 }
 	p258 EL안에서 사용할 수 있는 수치 연산자
 	+ - * / %(mod)
 	- 음수부호
 	p260 비교(관계) 연산자
 	 ==(eq) !=(ne) <(lt) <(gt)
 	 				<=(le) >=(ge)
 	 				
 	p261 논리연산자
 	&&(and)
 	||(or)
 	!(not) 
 	
 	p262 삼항연산자 ${ ?  :}
 	
 	*** ㄷ. 자바 클래스 메서드 호출 가능
 	ㄹ. 쿠키, 기본 객체의 속성 등 jsp를 위한 표현 언어 기본 객체 제공.
 		p254 ${ cookie } : <쿠키이름,Cookie> 맵 저장된다.
 	ㅁ. 람다식을 이용한 함수 정의와 실행(EL 3.0)
 	ㅂ. 스트림 API를 통한 컬렉션 처리 (EL 3.0)
 	ㅅ. 정적(static) 메서드 실행 (EL 3.0)
 5. EL 선언 형식
 	${expr}
 6. EL 제공하는 타입(자료형) 5가지
 	ㄱ. boolean 타입 : true, false
 	ㄴ. 정수타입 == 자바 java.lang.Long 타입 0~9정수, -음수
 	ㄷ. 실수타입 == 자바 java.lang.Double .(소수점)
 		${21121321} ${3.14}
 	ㄹ. 문자열 타입 ${"이향아"} ${'이향아'}
 	ㅁ. null 타입
 	
 7. EL 기본 내장 객체.
 	ㄱ. ${param}
 	ㄴ. ${pageScope 4가지}
	ㄷ. ${cookie}
	ㄹ. ${header} /${headerValues}
	ㅁ. ${pageContext} 	
	ㅅ. ${ initParam}
 --%>
 
 <%
 session.setAttribute("code", "c0001");
 application.setAttribute("tel", "010-2125-6854");
 request.setAttribute("addr", "seoul");
 %>
 <a href="ex03.jsp?name=admin">ex03.jsp</a>
</body>
</html>
