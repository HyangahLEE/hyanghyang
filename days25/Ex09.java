package days25;

import java.io.Console;

public class Ex09 {

	public static void main(String[] args) {
		// p 1015 Console 클래스
		// 1. JDK 6.~
		// 2. 콘솔에서 입력받은 문자열을 쉽게 읽을 수 있는 클래스.
		// 3. String   readLine()
		//     char [] readPassword()
		
		Console console =  System.console();
		
		System.out.print("> 아이디 : ");
		String id = console.readLine();
		
		System.out.print("> 패스워드 : ");
		char [] charPass = console.readPassword();
		String password = new String(charPass);
		
		System.out.printf("> %s - %s \n", id, password);
		

	}

}
