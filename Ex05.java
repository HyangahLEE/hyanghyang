package days01;

public class Ex05 {

	public static void main(String[] args) {
		// p 30 변수와 타입
		// 데이터 타입( Data Type ) == 자료형
		// 1) 기본(원시)형( Primitive Type )  8개
		//     ㄱ. 숫자형
		//          A. 정수계열  byte(1), short(2), int(4), long(8)
		//                                  char 한문자
		//          B. 실수계열   float/double
		//     ㄴ. 논리형   boolean   true / false
		
		// 2) 참조형        ( Reference Type )
		//          배열, 클래스([S]tring), 인터페이스, 
		
		
		// 예) 한 사람의 나이를 저장할 변수 선언
		// 0~120   byte
		// age [1바이트 -128~127]  -128  ~  127  1바이트
		// 변수 선언 형식
		// 데이터타입 변수이름[=초기값];
		byte age = 25;
		//age = 25; // 할당(대입)연산자
		System.out.println( age );   
		// "4"+5   "45"
		System.out.println( "나이는 " + age +"살 입니다.");
		// %d 출력서식
		System.out.printf( "나이는 \"%d살\" 입니다.", age);
		// 나이는 "25살" 입니다.
		
		// -21억~21억 정수 표현 : int
		//[][][][][][][] [][][][][][][] [][][][][][][] [][][][][][][]  
		
		// long 
		// -900경~ 900경 정수 표현 : long

		
		// (문제)
		// 1. 클래스 선언 형식, 메서드 선언 형식, 변수 선언 형식
		// 2. 본인이름 출력 전체...( 메모장, 컴, 실 )
		// 3. 데이터 타입 개념, 종류 
		// 4. 변수 / 리터럴
		// 5. 변수(식별자) 선언 방법
		
	}

}
