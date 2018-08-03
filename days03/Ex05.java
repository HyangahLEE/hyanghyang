package days03;

public class Ex05 {

	public static void main(String[] args) {
		
	//p64 연산자
	//1. 연산(operations) : 데이터를 처리하여 결과를 산출하는것
		//2.연산자(operator) : 연산에 사용되는 표시나 기호
		//3.연산식(expressions) : 연산자와 피연산자를 이용하여 연산의 과정을 기술한것.
		
		// , 콤마연산자 : 나열
/*		// = 대입연산자 : 값을 할당
		// ; 세미콜론 : 실행문,명령문 종결 연산자
//		 :  +-*/ 
		
		double x = 10.0 , y = 20.0;
		
		System.out.println( x + y);
		System.out.println( x - y);
		System.out.println( x * y);
		
		y = 0;
		System.out.println( x / y);   // Infinity(무한대)  실수 / 0
		System.out.println(x / y); // 정수/정수 이기 때문에 정수가 출력된다.
		System.out.println(x % y); // %는 나머지를 구하는 연산자 이다.
		//리터럴(상수) true, false ,Infinity(실수나눌때)
		
	/*	
		int x = 10, y = 5;
		System.out.println( x + y );
		System.out.println( x - y );
		System.out.println( x * y );
		//주의 :  java.lang.ArithmeticException: / by zero 
		y =0;
		System.out.println( x / y );
		// % 연산자 : 나머지 구하는 연산자.
		// java.lang.ArithmeticException: / by zero
		// 5 /2 = 2 (정수),  5 % 2 =1
		System.out.println( x % y );
		
		
		*/
		
	}
}
