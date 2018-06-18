package days09;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//동적 배열 ex) 선택에의해 작동되는 것. 사다리게임
		int size ; 
		int [] m ; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 배열크기 얼마나? ");
		size =  scanner.nextInt();  // 블러킹 (멈춰잇다)Blocking
	    m = new int[size];
		
		System.out.println(m.length);
	}
}
