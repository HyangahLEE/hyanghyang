package days15;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args)
			throws IOException {
		Scanner  scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ? ");
		String name = scanner.nextLine();
		 
		System.out.println( name );
		// scanner.nextLine();
		 
		
		
		//char one = scanner.next().charAt(0);
		// 13 10
		
		/*
		System.out.print("> 한 문자입력 ? ");
		char one = (char) System.in.read();
		System.in.skip(System.in.available()  );// 13, 10
		*/

	}

}
