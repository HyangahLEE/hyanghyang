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
<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog" style="width: 350px">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">게시물 삭제</h4>
				</div>
				<div class="modal-body">
					<!-- Delete.jsp 복사 붙이기.  -->
					<div style="text-align: center">
						<form id="form1" action="delete.do" method="post">
							<table width="300px" border="1" align="center">
								<tr>
									<td>비밀 번호 입력하세요?</td>
								</tr>
								<tr>
									<td><input type="password" name="pass"> 
									<input type="hidden" name="num" value="${ param.num }"></td>
								</tr>
								<tr>
									<td><input type="submit" id="btnDelete" value="글삭제">
										<a href="list.do?page=${param.currentPage }">글목록</a></td>
								</tr>
							</table>
						</form>
					</div>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
