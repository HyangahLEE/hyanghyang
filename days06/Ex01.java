package days06;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 한라인에 10개씩 출력....
	    int lineNumber = 1;
		for (int i = 0; i < 256; i++) {
			// if( i%10==0)	System.out.printf( "%d : ",  i/10+1 );
			if( i%10==0)	System.out.printf("%d : ",  lineNumber++);
			System.out.printf("[%c]", (char)i);
			if( i%10 == 9 ) System.out.println();
			if( i%100 == 99 ) {
				System.out.print("> 계속하려면 엔터치세요.");
				System.in.read();  
				System.in.skip( System.in.available() );// 13,10
			}
		}
		
		// 1 : 0   1 2 3 4 5 6 7 8  9  개행
		// 2 : 10 1 2 3 4 5 6 7 8 19 개행
		// 3 : 20 1 2 3 4 5 6 7 8 29 개행
		
		//  0 ~ 99
		// 100~ 199
		// 
		
		/*
		System.out.print("> kor  입력 : ");
		int kor = System.in.read();   // 9 0 enter
		// '9' ->  ascii -> 57 출력
		System.out.println( "kor=" + kor );
		*/
		
		// ASCII 출력
		/*
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d - %c\n", i , i);
		}
		*/
		// 48 - '0'
		// 65 - 'A'   90 - 'Z'
		// 97 - 'a'   122 - 'z'
		 
	}
	
}