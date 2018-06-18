package days02;

public class Ex02 {
		
	// 필드 ( 멤버변수 )
	// String name ="이향아" ;   // 지역변수 X

	public static void main(String[] args) {
		
		// %d 출력서식은 정수 출력
		// { } 블록 :   범위(영역) 연산자
		{
		   int kor = 90;
		   System.out.printf("> kor = %d\n",kor);
		}		
		// kor cannot be resolved to a variable
		//System.out.printf("> kor = %d\n", kor);
		
		// p 35 변수의 사용 범위
		// 1. 변수는 중괄호 {} 블럭 내에서 선언되고 사용된다. 
		// 2. 로컬 변수( local variable ) == 지역 변수 ?             ***
		//     ㄱ.  메서드(함수) 블록 내에서 선언된 변수
		//     ㄴ.  메서드(함수) 실행이 끝나면 메모리에서 자동으로 없어진다. 
		
		/*
		주석처리 :                       Ctl + Shift + /
		// 문자열 자료형 : String
		String name = "";  // 빈 문자열로 초기화.
		//name = "이향아";
		// The [local variable] name may not have been initialized
		System.out.println(name);
		 */

	}  // main

} // class
