package days08;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// "a"   -> 'a' + '\0'

		Scanner  scanner = new Scanner(System.in);
		System.out.println("> data 입력하세요 ? ");
		String data = scanner.next();  // String  "a" -> char 'a'
		System.out.println(data.charAt(0));



	}


}

