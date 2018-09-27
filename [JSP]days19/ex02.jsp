<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="member.js"></script> -->
<script type="text/javascript" src="member_json.js"></script>
<script type="text/javascript">
window.onload = function(){
	
	var mem = new Member("hyang","이향아","780211-1254684");
	var memInfo = mem.toString();
	console.log(memInfo);
	var age = mem.getAge();
	console.log(age);
	
	mem.setValue("이향숙","admin","940623-2157448");
	memInfo = mem.toString();
	console.log(memInfo);
}
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>

</body>
</html>
