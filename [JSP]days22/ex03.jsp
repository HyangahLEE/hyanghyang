<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>지도</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<div id="map" style="width:100%;height:500px"></div>
<script>
var lat = 37.499327;
var lng = 127.033162;


function myMap() {
  var myCenter = new google.maps.LatLng(lat,lng);
  var mapCanvas = document.getElementById("map");
  var mapOptions = {center: myCenter, zoom: 15};
  var map = new google.maps.Map(mapCanvas, mapOptions);
  var marker = new google.maps.Marker({position:myCenter});
  marker.setMap(map);

  // Zoom to 9 when clicking on marker
  var info = "<a href='http://www.sist.co.kr'>Sist</a>";
  var infoWindow = new google.maps.InfoWindow({
	 content:info 
  });
  google.maps.event.addListener(marker,'click',function() {
   // map.setZoom(9);
   // map.setCenter(marker.getPosition());
   infoWindow.open(map,marker);
   window.setTimeout(function(){
	   
   }, );
   
  });
}
</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCVnZ-sNN2y9A0QRdzmreuw3H621vdDJI8&callback=myMap"></script>
</body>
</html>
