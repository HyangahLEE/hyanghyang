package days09;

import java.io.IOException;                                               //암기 .시험
import java.util.Scanner;

public class Ex06_03 {
	// 전역 변수
	static int [] m = new int[5];
	// [1][5][2][9][10][9][0][0]
	// 선택메뉴? 5  검색
	// > 찾을 정수 입력 ? 9
	// 3 위치에 있다.
	// 5 위치에 있다. 
	
	// 찾는 9는 없다.
	// > 계속하려면 엔터치세요....
	
	//> 메뉴 <
	//1. 입력	2. 수정	3. 삭제	4. 종료	5. 출력	6. 검색	
	//> 메뉴 선택하세요 ? 3
	//   ㄱ. 모두 삭제 ? 
	//   ㄴ. 원하는 위치 삭제?
	//   > 메뉴 선택하세요 ? ㄴ
	//       1) 원하는 위치 입력 ? 5
	// > 삭제 완료!!!
	// > 계속하려면 엔터치세요....
			
	static String [] menus  = { 
			"입력",
			"수정",
			"삭제",
			"종료",
			"출력",
			"검색"
		};
	static int s_menu;
	static int idx = 0;   // 
	static Scanner scanner = new Scanner(System.in);
	static char con = 'n';

	public static void main(String[] args) throws IOException {  
		
		while(true) {
			dispMenus();   // 메뉴 출력
			selectMenus(); // 메뉴 선택
			procMenus() ;  // 메뉴 처리
		}
		
	}

	private static void procMenus() throws IOException {
		switch (s_menu) {
		case 1:  // 입력
			inputData();
			break;
		case 2:  // 수정
			break;
		case 3:  // 삭제
			
			break;
		case 4:  // 종료
			program_exit();
			break;
		case 5:  // 출력
			outputData();
			break;
		case 6:  // 검색
			break;
		} 
	}

	private static void outputData() throws IOException {
		System.out.println("> Data 출력  <");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d] ", m[i]);
			if( i%10 == 9 ) System.out.println();
		}
		System.out.println();
		System.out.print("> 계속하려면 엔터치세요....");
		System.in.read(); System.in.skip(System.in.available());
	}

	private static void inputData( ) { 
		int inc = 3;
		
		do {
			if( m.length == idx ) {
				int [] temp = new int[m.length + inc];
				for (int i = 0; i < m.length; i++)  
					temp[i] = m[i]; 
				m = temp;
			}
			System.out.printf("> %d 요소값을 입력하세요 ? ", idx);
			int  n = scanner.nextInt();
			m[idx++] = n; 	
			System.out.print("> 계속 입력할거냐? "); 
			con = scanner.next().charAt(0); 
		} while (  Character.toUpperCase(con) == 'Y' );
	}

	private static void program_exit() {
		System.out.println("\n\n> 프로그램 종료 ...");
		System.exit(-1);
	}

	private static void selectMenus() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("\n> 메뉴 선택하세요 ? ");
		s_menu = scanner.nextInt(); 
	}

	private static void dispMenus( ) {
		System.out.println("> 메뉴 <");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		}
		
	}

}
