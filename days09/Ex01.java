package days09;

public class Ex01 {

	// 대 -> 소,   소->대  변환해서 반환하는 함수
	public static void main(String[] args) {
		char con ='a';		
		System.out.println( toUpperCase(con));		
		//System.out.println( Character.toUpperCase(con) );		
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("> 계속 할거냐 ? ");
		// con == 'y' || con == 'Y'		
		//                     char -> Wrapper Class ( [C]haracter )
		// 'y'  Character.toLowerCase(con) 소문자로 변환
		// 'Y'  Character.toUpperCase(con) 대문자로 변환
		
	}
	 
	public static char toUpperCase(char ch) {
		// 'a'  97   'z'  ?
		// 'A'  65   'Z' ?
		//    정수  32
		//if( ch >=97 && ch <= 120 ) {
		// regex      [a-z]     [0-9]  \d
		/*
		if( ch >='a' && ch <= 'z' ) {
			return  ch - 32;
		}else {
			return ch;
		}
		*/
		
		return (char) (( ch >='a' && ch <= 'z' )  ?  ch - 32 : ch);
	}
	 
}


/*

> UML 프로그램 :  RationalRose , Visio
> 프리웨어 :  StarUML
> StarUML 다운로드 : http://staruml.io/

*/
