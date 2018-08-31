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
	$("#btn_memberdelete").click(function(){
		$(this).parents("tr").find("td:first").text().trim();
		 location.href="ex02_updatemember.jsp?memberid="+$(this).attr("alt"); 
	});
	
	$("#btn_memberdelete").click(function(){
		var result = confirm("정말 삭제 하시겠습니까?");
		console.log(result);
		if(result){
			location.href="ex02_deletemember.jsp?memberid="+$(this).attr("alt");
		}
	});
});
</script>
</head>
<body>
<h3>회원목록</h3>
<table border="1" style="100%">
	<tr>
		<th><input type="checkbox" /></th>
		<th>MemberID</th>
		<th>Password</th>
		<th>Name</th>
		<th>Email</th>
		<th></th>
	</tr>
	<c:forEach items="${list }" var="m">
	<tr>
		
		<td><input type="checkbox" name="ckb_mid" />${ m.memberid }</td>
		<td>${ m.password }</td>
		<td>${ m.name }</td>
		<td>${ m.email }</td>
		<td>
		<c:if test="${session.quth.memberid eq member.memberid }">
		<input type="button" id="btn_memberedit" value="edit" alt="${ m.memberid }"/>
		<input type="button" id="btn_memberdelete" value="delete" alt="${ m.memberid }"/>
		</c:if>
		</td>		
		
	</tr>
	</c:forEach>
</table>
</body>
</html>
