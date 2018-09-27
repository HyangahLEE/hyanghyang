<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/dhtmlxSuite_v51_std/codebase/fonts/font_roboto/roboto.css"/>
<link rel="stylesheet" type="text/css" href="/dhtmlxSuite_v51_std/codebase/dhtmlx.css"/>
<script src="/dhtmlxSuite_v51_std/codebase/dhtmlx.js"></script>
<script src="/dhtmlxSuite_v51_std/samples/dhtmlxChart/common/testdata.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
.container{
position: relative;
width: 450px;
height: 350px;
border: dotted 1px #555;
padding: 10px;
margin-top: 10px;
}
.loader{
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background: rgba(255,255,255,0) url('ajax-loader.gif') no-repeat 50% 50%;
}
</style>
<script>
$(document).ready(function(){
 var res={
	loader:$("<div />",{ class:'loader'}),
	//loader:$("<div class='loader'></div>"),
	container:$('.container')
 };
 
	var myLineChart;//

	$('a.load').on('click',function(){
		 $.ajax({
			 url:"ex02_empTopTen_json.jsp",
			 dataType:"json",
			 type:"get",
			 cache:false,
			 beforeSend:function(xhr){
				// alert(res.container)
				res.container
				.empty()
				.append(res.loader);
				//.append($("<div class='loader'></div>"));
			 },
			 success:function(data){
				res.container.find(res.loader).remove();
				 //$('.container').text(data.emp[0].ename);
				 //차트그리기  ///C:/Users/SIST175/Downloads/dhtmlxSuite_v51_std/samples/dhtmlxChart/05_line_chart/01_init.html
				 
			myLineChart =  new dhtmlXChart({
				view:"line",
				container:"chartbox",  //그리고자하는 div의 id값
				value:"#sal#", //testdata의 뿌리고자하는값
				label:"#sal#",
				item:{
					borderColor: "#1293f8",
					color: "#ffffff"
				},
				line:{
					color:"#1293f8",
					width:3
				},
				xAxis:{
					template:"'#ename#"
				},
				offset:0,
				yAxis:{
					start:0,
					end:10000,
					step:1000,
					template:function(obj){
						return (obj%20?"":obj)
					}
				
				}
			});
			myLineChart.parse(data.emp,"json");

				 
			 }  //success
		 }); //  $.ajax({ 닫기
	 }); // $('a.load').on( 닫기
});

</script>
</head>
<body>
<a href="#" class="load">ex02_empTopTen_json_chartTest</a>
<div id="chartbox"
	 class="container"
 style="width:600px;height:250px;border:1px solid #c0c0c0;"></div>

</body>
</html>
