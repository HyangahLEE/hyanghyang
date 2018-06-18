package days01;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("이창익");
		System.out.println("홍길동");
		System.out.println("서영학");
		System.out.println();  // 개행, 줄바꿈
		// Ctrl+ Shift + L
		// Alt + Shift + A
		// [ println()와 print() 차이점 : 개행 여부 ] 
		System.out.print("이향아" + '\n');  // 개행문자
		// \ 붙은 문자 : 이스케이프(escape) 문자 == 제어문자
		
		System.out.print("홍길동\n");
		System.out.print("서" +"영학");

		// [암기]  '' 한문자   "" 문자열
		//		a 식별자
		//     "a" 문자열 == 문자의 나열
		//     'a'  한문자
	}

}
