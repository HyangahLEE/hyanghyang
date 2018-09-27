/**
 * ajax.js
 * 
 * com.util.Member 클래스선언
 * 
 * var com = {};
 * com.util = {};
 * 
 * com.util.Member = function(){
 * }
 */

 var ajax = {}; // {}  ==  new Object()
 ajax.xhr = {}; // ajax.xhr 패키지 지정
//  ajax.xhr패키지 안의   Request   클래스명 정의 부분
ajax.xhr.Request = function(url,params,callback, method){
					this.url = url;
					this.params = params;
					this.callback = callback;
					this.method = method;
					
					this.send();
					// Request 클래스 생성자, 생성과 동시에 send() 호출
}

ajax.xhr.Request.prototype= {
					getXMLHttpRequest:function(){
						if(window.ActiveXObject){
							 try {
								return new ActiveXObject("Msxml2.XMLHTTP");
							} catch (e) {
								try {
									return new ActivXObject("Microsoft.XMLHTTP");
								} catch (e) {
									return null;
								}
								
							}
						 }else if(window.XMLHttpRequest){
							 return new XMLHttpRequest();		 
						 }else {
							 return null;
						 } 
					},
					send:function(){
						this.req = this.getXMLHttpRequest();
						 var httpMethod= this.method?this.method:'GET';
						 if(httpMethod!='GET' && httpMethod!='POST')
							 httpMethod='GET';
						 var httpParams = (this.params==null||this.params=="")?null:this.params;
						 var httpUrl = this.url;
						 if(httpMethod=='GET' && httpParams!=null){
							 httpUrl= httpUrl +"?"+httpParams;
						 }
						 
						 this.req.open(httpMethod,httpUrl,true);
						 //httpRequest.setRequestHeader('Content-Type','application/x-www-form-unlencoded');
						 
						 var request = this; // XMLHttpReqeust객체의 readyState값이 바뀔때 이 객체의 함수 호출						 
						 this.req .onreadystatechange = function(){
							 request.onStateChange.call(request);
						 };
						 
						 
						 httpMethod = (httpMethod=='POST'?httpParams:null );						 
						 this.req.send(httpParams );
					},
					
					onStateChange:function (){
						this.callback(this.req);
					}
}










