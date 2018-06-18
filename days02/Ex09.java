package days02;

import java.io.BufferedReader;
import java.io.IOException;



public class Ex09 {

	public static void main(String[] args) throws IOException {

		//p49 타입변환(형변환)
		// 1. 자동형변환
		// 2. 강제형변환
/*
		byte age = 20;
		String name = "이성민";

		System.out.printf(">name=%s, age=%d\n",name,age);
*/
		
		//표준 출력 함수 : system.out.println(), ~.printf(), .print()
		
		//1.필요한 변수 선언
		String name;
		byte age;
		//2. 표준 입력 장치 입력
		BufferedReader br =
				new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		name = ((BufferedReader) br).readLine();
		//3. 출력
		System.out.printf("> name=%s\n", name);
		
		
//		System 클래스 in / out 

		
		
	}
}
