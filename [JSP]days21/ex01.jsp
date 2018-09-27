<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/dhtmlxSuite_v51_std/codebase/fonts/font_roboto/roboto.css"/>
<link rel="stylesheet" type="text/css" href="/dhtmlxSuite_v51_std/codebase/dhtmlx.css"/>
<script src="/dhtmlxSuite_v51_std/codebase/dhtmlx.js"></script>
<script src="/dhtmlxSuite_v51_std/samples/dhtmlxChart/common/testdata.js"></script>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
<script>
		var myBarChart1, myBarChart2;
		function doOnLoad() {
			myBarChart1 =  new dhtmlXChart({
				view:"bar",
				container:"chart1",
				value:"#sales#",
				width:30,
				color:"#7ed500",
				gradient:"rising",
				alpha:function(data){
					return data.sales/90;
				},
				tooltip:{
					template:"#sales#"
				},
				xAxis:{
					template:"'#year#"
				},
				yAxis:{
					start:0,
					end:100,
					step:10,
					template:function(obj){
						return (obj%20?"":obj)
					}
				},
				padding:{
					left: 30
				},
				border:0
			});
			myBarChart1.parse(dataset,"json");
			myBarChart2 =  new dhtmlXChart({
				view:"bar",
				container:"chart2",
				value:"#sales#",
				label:"#sales#",
				width:45,
				color:"#color#",
				tooltip:{
					template:"#sales#"
				},
				xAxis:{
					template:"'#year#"
				},
				yAxis:{
					start:0,
					end:100,
					step:10,
					template:function(obj){
						return (obj%20?"":obj)
					}
				},
				padding:{
					left: 30
				},
				radius:0
			});
			myBarChart2.parse(dataset_colors,"json");
		}
	</script>
</head>
<body onload="doOnLoad();">
	<h1>Styles</h1>
	<div id="chart1" style="width:600px;height:250px;border:1px solid #c0c0c0;"></div>
	<div id="chart2" style="width:600px;height:250px;border:1px solid #c0c0c0;"></div>
</body>
</html>
