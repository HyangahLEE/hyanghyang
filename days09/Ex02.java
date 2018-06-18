package days09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String name = "SeMiN";
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 반장이름 입력하세요?");
		String data = scanner.next(); // 성민
		
		
		// == 문자열을 같다 비교할 때는 == String.equals()
		//if ( name == data ) System.out.println("같다");
		
		
		//대소문자 구별하지 않고 문자열 비교 : String.equalsIgnoreCase()
		if ( name.equalsIgnoreCase(data))System.out.println("같다");
		else System.out.println("다르다");
		
	}
}
