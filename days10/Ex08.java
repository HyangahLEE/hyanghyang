package days10;

import java.util.Arrays;   // 

public class Ex08 {

	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 };
 
		
		// java.util 패키지 안에.sort 함수 를 써써.m을넣는다.
		Arrays.sort(m);
		
		dispM(m);
	}
	
	private static void dispM(int[] m) {

		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d ", m[i]);
		}
		System.out.println();

	}

}