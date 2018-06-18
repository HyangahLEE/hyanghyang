package days02;

public class Ex01 {

	public static void main(String[] args) {
		// p 32 변수/상수/리터럴
		// 1) 변수( variable ) ?  값을 저장하기 위한 기억공간의 이름
		//                              변하는 수
		// 2) 상수( constant ) ? 값을 저장하기 위한 기억공간의 이름 
		//                              변하지 않는 수
		
		// 3.14  PI 원주율 변수 선언
		// 숫자계열( 실수 )     float(4) , double(8)
		// 변수 선언 형식 :   자료형 변수명[=초기값];
		
		// 상수    final 키워드    
		final double pi = 3.141592;		
		System.out.println(pi);		
		// The final 지역변수(local variable) pi cannot be assigned. 
		// It must be blank and not using a compound assignment
		// pi = 400;		
		System.out.println(pi);
		/*
		stack
		[   3.141592   ]
		  pi		 
		
		pi = 400;  // = 대입연산자
		// 우측항의 값을 좌측기억공간에 할당하는 연산자.
		
		pi = 600;
		
		System.out.println( 5 *  5 * pi ); // 원면적
		System.out.println( 2 *  5 * pi ); // 원둘레
*/		
		
		// 리터럴 : 소스 코드 내에 직업 입력된 값
		//  상수
		/*
		3.14       실수 리터럴
		"이창익"   문자열 리터럴
		true       논리 리터럴
		'\n'  'A'   문자 리터럴
		*/
		
		
	}

}








