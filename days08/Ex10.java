package days08;


import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 배열
		// 정의, 목적, 선언형식
		// 배열의 단점 ?  -> 컬렉션 사용
		// Heap(동적영역)              Stack(스택)
		// [ 100 ][20 ][ 122 ]                  [100번지]
		// 100번지
		// m[0]~m[2]                        m
		
		
		//                                       [100번지]
		//                                           m
		
		// 각 배열은 초기화하지 않아도 각 자료형의 기본값으로 초기화되어 있다.
	    int [] m = new int[3];  // null
		/*
		for (int n : m) {
			System.out.println(n);
		}
       */
	    
	    fillM(m);
	}

	private static void fillM(int[] m) {
		Scanner scanner = new Scanner(System.in);
		int idx = 0;
		 
		char con = 'n'; // String con = "y"  "Y"  //계속할거냐
		// 별찍는 것 ?    모래시계
		// 낼 시험.....
		do {
			System.out.printf("> %d 요소값을 입력하세요 ? ", idx);
			int  n = scanner.nextInt();
			m[idx++] = n;
			// idx++;  // 1		
			System.out.print("> 계속 입력할거냐? "); // "y" == 'y' +'\0'
			con = scanner.next().charAt(0);
			// con = (char)System.in.read()  System.in.skip(2) 주의
		} while (   con=='y' || con=='Y' );
		//  while  Character.toLowerCase(con) 소문자로변환 'y'
		//           ( Character.toUpperCase(con) 대문자변환  'Y'
		/*
		System.out.printf("> %d 요소값을 입력하세요 ? ", idx);
		int  n = scanner.nextInt();
		m[1] = n;
		idx++;  // 2
		// 계속 입력할거냐 ? y  or  Y
		
		System.out.printf("> %d 요소값을 입력하세요 ? ", idx);
		int  n = scanner.nextInt();
		m[2] = n;
		idx++;  // 2
		// 계속 입력할거냐 ? y  or  Y
		*/
	}

}

