package days03;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) 
			                   throws IOException {
		// 표준 출력 함수  : printf() println() print()
		// 표준 입력 함수  : br.readLine() , [ System.in.read() ]
		System.out.print("> 한 문자 입력 : ");
		char one ;
		//int  data = System.in.read();
		// String "98" -> Byte 98 형변환
		// int       65   -> char  형변환
		
		// () cast 연산자로 강제 형변환
		one = (char) System.in.read();
		//  java.util.IllegalFormatConversionException:
		//                                  d  x  s
		//  d != java.lang.Character
		// a 입력 후 enter = (13) + (10)  = \r \n 
		System.out.printf("%c\n",one);

		/*
		//System.in.read(); //13 버림 읽은 후 실행하지 않으면 버림
		//System.in.read(); //10 버림 읽은 후 실행하지 않으면 버림
		// System.in.skip(2); // 2바이트 색략
		System.in.skip( System.in.available() );
		// 바이트 단위로 입력값 생략         / 입력가능한 범위 전체
		
		// a enter(\r13 \n10)
		System.out.print("> 한 문자 입력 : ");	 
		one = (char) System.in.read(); 
		System.out.printf("%c\n",one);
		*/
		
		// 한 문자 입력받아서 출력 X 2번
		//  > 한 문자 입력 : a
		//  a
		//  > 한 문자 입력 : z
		//  z

	}

}
