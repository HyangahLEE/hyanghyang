<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//?num=10
	String p_num = request.getParameter("num");
	int num = 10;
	int sum = 0;
	if (p_num != null) {
		num = Integer.parseInt(p_num);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#num").focus();
	});
</script>
</head>
<body>
	<!-- p65 스크립트릿 -->
	<!-- form태그의 action속성값을 주지 않으면 자기자신을 호출한다.+파라미터 값도 같이 (ex07.jsp?num=5) -->
	<form action="" method="get">
		정수 입력 : <input type="text" id="num" name="num" value="<%=num%>" />
		<!-- 상태유지 -->
	</form>
	<div id="demo">
		<%
			for (int i = 1; i <= num; i++) {
		%>
		<%=i%>+
		<%sum+=i;%>
		<%	}%>
			=
		<%=sum %>
	
		<%--
			 for (int i = 1; i <= num; i++) {
				out.append(i+(i==num?"":"+"));
				sum+=i;
			}
		out.append("="+sum); 
		--%>
	</div>
</body>
</html>