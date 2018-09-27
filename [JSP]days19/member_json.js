/**
 * member.js
 * [Json표기법 클래스 선언 형식]
 */

Member = function(id,name,securityNo){
	
	this.id = id;
	this.name = name;
	this.securityNo = securityNo;
}

Member.prototype = {
		
		setValue : function(newId,newName,newSecurityNo){
			
			this.id = newId;
			this.name = newName;
			this.securityNo = newSecurityNo;
		},

		getAge : function (){
			var birthYear = parseInt(this.securityNo.substring(0,2));
			var code = this.securityNo.substring(7,8);
			if( code =='1' || code == '2' )	birthYear += 1900;
			else if( code =='3' || code == '4' ) birthYear += 2000;
			
			var today = new Date();
			
			return today.setFullYear() - birthYear
			
		},

		toString : function(){
			return this.name + "["+this.id+"]";
		}

}

