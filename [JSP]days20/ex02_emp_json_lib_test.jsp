<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2018. 9. 13. 오전 11:24:11</title>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
</style>
<script>
   $(document).ready(function() {
      $("#jsontest").click(function() {
         $.ajax({
            url:"ex02_emp_json_lib.jsp",
            dataType:"json",
            type:"get",
            cache:false,
            success:function(data) {
               $(data.emp).each(function(index, e) {
                  //console.log(e.empno+"/"+e.ename);
                  var info = e.empno + "/" + e.ename + "/" + e.sal;
                  $("#demo").append("<div>" + info + "</div>");
               })
            },
            error : function( jqXHR, textStatus ) {
            	  alert( "Request failed: " + textStatus );
            }
         })
      })
   });
</script>
</head>
<body>


   <%
      Date now = new Date();
   %>
   <%=now.toLocaleString()%>


   <input type="button" id="jsontest" value="jquery+ajax+json" />

   <div id="demo"></div>



</body>
</html>