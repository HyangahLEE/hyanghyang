package days25;

import java.io.InputStream;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// p 1017 Scanner 클래스
		//                           [System.in]
		// 표준입력스트림  ->    바이트스트림
		/*
		InputStream is = System.in;
		Scanner scanner = new Scanner(is);
		scanner.next();
		*/
		
		 String input = "1 fish 2 fish red fish blue fish";		 
		     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");	     
		     System.out.println(s.nextInt());  // 1	     
		     System.out.println(s.nextInt());  // 2
		     System.out.println(s.next());  // red
		     System.out.println(s.next());  // blue
	     s.close();

	}

}



