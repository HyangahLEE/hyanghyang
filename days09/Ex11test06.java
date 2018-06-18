package days09;

import java.util.Scanner;

public class Ex11test06 {
	static String [] m = {"입력",
			"수정",
			"삭제",
			"종료",
			"출력",
			"검색"};
	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		
		dispM();
		selectMenus();
	
		}

	private static void selectMenus() {
		System.out.println("> 메뉴를 선책하시오 ? ");
		
		
	}

	private static void dispM() {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d.%s\t",i+1,m[i]);
		}
		
	}
}
