<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
   $("#empnoCheck").click(function(){
	  // alert("dd");
      var params = $("form").serialize();
      $.ajax({
         url : "ex04_idcheck.jsp",
         dataType : "json",
         type: "get",
         data: params,
         cache: false,
         success: function(data){
            if( data.count == 0) {
               //사용가능
               $("#notice")
               .css("color","black")
               .text("사용가능한 empno입니다.");
            }else{
               //사용 불가능
               $("#notice")
               .css("color","red")
               .text("이미 사용 중인 empno입니다.");
               
            }
         }
         
      });
   });
});
</script>
</head>
<body>
<!--    emp 테이블에 사원 추가 -->

<form action="">

   deptno : <input type="text" name="deptno" value="10"/>
<!--    7369 존재하는 사원번호 -->
   empno : <input type="text" name="empno" value="7369"/>
   
   <input type="button" id="empnoCheck" value="empno중복체크"/>
   <p id="notice"></p>
   <br />
   ename : <input type="text" name="ename" value=""/>
   
   <input type="submit" />
   
</form>
</body>
</html>