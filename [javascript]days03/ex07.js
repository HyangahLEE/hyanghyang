/**
 * 
 */

// 년, 월,1 일의 요일 0~6 반환하는 함수 
function getDayOfWeek(year,month){
	var d = new Date(year,month-1);
	return d.getDay();
}

//마지막 날짜 반환하는 함수 
function getLastDay(year,month){
	var d = new Date(year,month-1+1);
	d.setDate(d.getDate()-1);
	return d.getDate();
}