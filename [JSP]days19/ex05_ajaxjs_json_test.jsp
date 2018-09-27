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
<script src="ajax.js"></script>
<script>

	function json_test(){
		//alert('test');
		//객체 생성 + this.send(); Ajax 요청합니다. -> callback 에 결과물 받음
		new ajax.xhr.Request(
				"ex05_ajaxjs_json.jsp"
				,""
				,callback
				,"GET");
	}

	function callback(httpRequest){ //상태가 바뀔때마다 함수발생
		if( httpRequest.readyState == 4 && httpRequest.status == 200){
			//eval() json형태의 문자열 값을 실제 자바스크립트 객체로 변환해주는 역할
			var jsonObject = eval( "("+ httpRequest.responseText+ ")" );
			if( jsonObject.code == "success" ){
			  var id = jsonObject.data.member.id;
			  var name = jsonObject.data.member.name;
			  console.log("> name = " + name + ", id = "+ id);
			}else {
				alert("실패");
				
			}
		}
	}
</script>
</head>
<body>
<h3>ex05_ajaxjs_json_test</h3>
<input type="button" value="json test" onclick="json_test()" />
</body>
</html>
