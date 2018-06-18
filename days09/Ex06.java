package days09;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {                 //메뉴,선택,처리,입력,
		// return ; 호출한 곳으로 반환값을 가지고 돌아간다.
		//   [0][0][0][0][0]   <-    m
		int [] m = new int[5];
		
		String [] menus  = { 
										"입력",
										"수정",
										"삭제",
										"종료"
									};
		
		dispMenus(menus);
		int s_menu = selectMenus();

		m = procMenus(s_menu, m) ;
	}

	private static int [] procMenus(int s_menu, int [] m) {
		 switch (s_menu) {
		case 1:  // 입력
			m = inputData(m);
			break;
		case 2:  // 수정
			break;
		case 3:  // 삭제
			break;
		case 4:  // 종료
			program_exit();
			break;
		/*default:
			break;*/
		}
		return m;
	}

	private static int [] inputData(int [] m) {
		
		return m;
	}

	private static void program_exit() {
		System.out.println("\n\n> 프로그램 종료 ...");
		System.exit(-1);
	}

	private static int selectMenus() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("\n> 메뉴 선택하세요 ? ");
		int s_menu = scanner.nextInt();
		return s_menu;
	}

	private static void dispMenus(String[] menus) {
		System.out.println("> 메뉴 <");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\n", i+1, menus[i]);
		}
		
	}

}
