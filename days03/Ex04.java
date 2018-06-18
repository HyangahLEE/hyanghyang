package days03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Scanner (스캐너) 클래스
		// JDK 5.0
		String name;
		int kor, eng, mat;
		// java.util 유틸리티 패키지안에 있는 클래스
		Scanner scanner = new Scanner(System.in);	
		//                         scanner.useDelimiter(pattern)  정규표현식
		// 홍길동 90 89 99 
		System.out.print("> 이름 국어 수학 영어 입력 ? ");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		System.out.printf("> name=%s\n> kor=%d,eng=%d,mat=%d\n"
				, name, kor,eng,mat);

		
		
		
		

	}

}
