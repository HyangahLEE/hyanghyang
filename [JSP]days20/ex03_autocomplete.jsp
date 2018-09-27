<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://jqueryui.com/ui/resources/demos/style.css">
<!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
   $(function() {
      //var availableTags; //jQuery+ajax+json 가져온 값 설정
      
   $("#tags").keyup(function(){
      //alert("test");
      var params = $("#form1").serialize();
      //alert(params);
      $.ajax({
         url : "ex03_emp_json.jsp",
         dataType : "json", //xml, json, script, html
         type : "GET",
         data : params,
         success : function(data){
            //$(data.emp).each(function(index, e){
                  //console.log(data)
            //}); // each() 하나씩 출력
            $("#tags").autocomplete({
               source: data
            });
            
         }, error: function(){
            alert("에러 발생!");
         }
      }); 
   });
});

/*    $("#tags").autocomplete({
         source : availableTags
      });
   }); */
</script>
</head>
<body>
   <form id="form1">
      <div class="ui-widget">
         <label for="tags">Tags: </label> <input id="tags" name="searchWord">
      </div>
   </form>
</body>
</html>