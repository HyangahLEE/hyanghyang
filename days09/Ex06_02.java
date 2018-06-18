package days09;

import java.util.Scanner;           //시험.배열.

public class Ex06_02 {
	// 전역 변수
	static int [] m = new int[5];
	static String [] menus  = { 
			"입력",
			"수정",
			"삭제",
			"종료",
			"출력",
			"검색"
		};
	static int s_menu;

	public static void main(String[] args) {  
		dispMenus();    // 출력.
		selectMenus();  // 메뉴.
		procMenus() ;  // 처리.
	}

	private static void procMenus() {
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
			break;
		case 6:  // 검색
			break;
		} 
	}

	private static void inputData( ) {
		 
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
