package days03;

public class Ex09 {

	public static void main(String[] args) {

		// 논리 연산자
		// 1. 일반논리연산자 : ! && ||
		// 2. 비트논리연산자 : ~ &  |     ^(XOR)
		// System.out.println( 10 ^ 5);
		// 0000 1010    // 10
		// 0000 0101    // 5
		// ^
		// 0000 1111    //15
		//   ( )  최우선연산자    ( 3 + 5 ) * 2
		//   ( data type ) cast 연산자 : 강제형변환

		// [] 대괄호   ( 인덱스(index) 연산자 )
		// 예)  String[] args 
		// 배열  (Array)? 정의 , 목적, 형식 등등
		// 5000 명 학생의  국어 점수   관리..
		// ㄱ. "동일한 자료형"을 메모리상에 "연속적"으로 놓이게 한 것을 배열이라고 한다.
		// ㄴ. 데이터를 일괄적으로 쉽게 처리
		// ㄷ. 자료형[] 배열명 = new 자료형[배열크기];    
		int kor ;
		kor = 100;
		System.out.printf("%d\n", kor);
		int []  kors = new int[5];
		// ㄹ. 참조타입        
		// 자바의 자료형   ㄱ. 기본형  ㄴ. 참조형 : 배열 , 클래스, 인터페이스
		// new 연산자에 의해 힙 영역 실제 기억공간 할당. 

		//ㅁ. 0번째 요소 , 1번째 요소 ~ 4번째 요소
		//   index(첨자값)  0  1  2 3 4
		//   배열명[첨자값]
		// ㅂ. 배열의 크기를 얻어오는 방법
		// 배열명.length
		// ㅅ. 가장 작은 index(아랫 첨자값) : 0             lowerBound             / (get)lowerBound
		//     가장 작은 index(윗 첨자값) : 배열.length - 1      UpperBound     / (get)UpperBound
		kors[0] = 90;
		kors[1] = 94;
		kors[2] = 92;
		kors[3] = 100;
		kors[4] = 78;


		System.out.printf("%d\n",kors[0] );
		System.out.printf("%d\n",kors[1] );
		System.out.printf("%d\n",kors[2] );
		System.out.printf("%d\n",kors[3] );
		System.out.printf("%d\n",kors[4] );
		// kors[5] = 92;
		
		kors = null;  // 가비지 메모리(쓰레기)     힙영역은 할당되어 있으나 스택에 참조할 주소가 없다. 
		
		// java.lang.ArrayIndexOutOfBoundsException
		//               배열첨자가 범위를 벗어났다.
		
		
		//  배열명.length    암기***
		System.out.println(kors.length);

		//ㅅ. 가장 작은 index(첨자값) : 0                    //   LowerBound
		//    가장 큰 index(첨자값) :  kors.length -1  //   UpperBound


	}
}
