package days25;

import java.io.OutputStream;
import java.io.PrintStream;

import days13.Point;

public class Ex08 {

	// > 팀 프로젝트 할 때 : 파일 입출력.
	// 학번/이름/국/영/수/총/평/등 -> 파일 저장.
	public static void main(String[] args) {
		// p 1009 콘솔 입출력
        // 1. 콘솔( Console ) 정의 ?
		//    시스템을 사용하기 위해 키보드(입력), 화면(출력)하는 
		//    소프트웨어
		// 2. 유닉스, 리눅스 운영체제  : 터미널
		//     윈도우즈 운영체제계열    : 명령프롬프트( command , cmd )
		
		//                           바이트스트림 OutputStream
		// 값
		PrintStream out = System.out;
		out.println("String");
		//out.printf("%d  %f  %b", 10, 2.122, true );
		// 객체
		Point p1 = new Point(1,2);
		out.println(p1);
		
		
		

	}

}
