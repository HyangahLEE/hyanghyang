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
		System.out.printf("%c\n",one);

		/*
		//System.in.read(); // 13
		//System.in.read(); // 10
		
		// System.in.skip(2);  
		System.in.skip( System.in.available() );
		
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
