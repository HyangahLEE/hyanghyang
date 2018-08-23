/**
 * escape() -> unescape() //영문,알파벳,숫자 ,일부 특수문자(@,*,-,_,+,.,/)를 제외한 문자만 인코딩
 * encodeURI() ->decodeURI() // 인터넷 주소에 사용되는 일부 특수문자(:,;,/,=,?,& 등)를 제외 문자만 인토딩
 * encodeURIComponent() -> decodeURIComponent() //알파벳 숫자를 제외하고 모두 인코딩,디코딩
 *
 */
function setCookie(name, value){
	//만료시점 : 오늘부터 +10일
	//일자 정보는 Date 개체에서 toGMTString() 메서드로 받는 양식에 반드시 cookie에 포함하여야 한다.
	
	var today = new Date();
	today.setDate(today.getDate()+ 10);
document.cookie= name+"="+escape(value)+";expires="+today.toGMTString()+";path=/"
}

function getCookie(name){
/* 	1.split(";");
	2.split("=") 0쿠키이름(name) 1쿠키값(1)
	3.반복 			name ==0쿠키이름(name);
	4. unescape(쿠키값) 반환
	5. 없다면 null 반환
	*/
	var cookies=document.cookie;
	var cookieArr= cookies.split("; ");
	for (var i = 0; i < cookieArr.length ; i++) {	
		var nvArr = cookieArr[i].split("=");
		if(nvArr[0]==name){
			return unescape(nvArr[1]);
		}
	}
	return null;
}

function delCookie(name){
	var today = new Date();
	today.setDate(today.getDate() - 1);
document.cookie= name+"=;expires="+today.toGMTString()+";path=/"
	
}

