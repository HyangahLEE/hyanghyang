package days02;

import java.io.BufferedReader;
import java.io.IOException;
// 패키지를 불러오는것
// 자바는 표준 입출력 함수는 굳이 import할 필요 없다.
// 내부적으로 java.lang.*은 자동으로 참조되고 있다.
// Ctrl+Space는 자동으로 패키지를 import 시킨다.



public class Ex09 {

	public static void main(String[] args) throws IOException {

		//p49 타입변환(형변환)
		// 1. 자동형변환
		// 2. 강제형변환
/*
		byte age = 20;
		String name = "이향아";

		System.out.printf(">name=%s, age=%d\n",name,age);
*/
		
		//표준 출력 함수 : system.out.println(), ~.printf(), .print()
		
		//1.필요한 변수 선언
		String name;
		byte age;
		//2. 표준 입력 장치 입력
		BufferedReader br =
				new java.io.BufferedReader(new java.io.InputStreamReader(System.in));\
		// System.in 바이트스트림으로 읽음 / 바이트스트림을 문자열로 변환 InputStreamReader / 문자열을입력받기위한 클래스 : BufferedReader
		// 우측하단에 빨간마크는 코드 실행중
			
		name = ((BufferedReader) br).readLine();
		// 입력을 하지 않으면 블록킹(멈춤상태)이 된다.
		// 입력은 엔터로 구분한다.
		
		//3. 출력
		System.out.printf("> name=%s\n", name);
		// System 클래스는 표준 입출력 in / out    원래는 모든 클래스는 원래 패키지명까지 써야한다.
		
//		System 클래스 in / out 

		
		
	}
}
