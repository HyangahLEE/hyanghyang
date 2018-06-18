package days20;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		/*
		// 
		int [] m = new int[100];
		// Arrays.fill(m, 95);
		for (int i = 0; i < m.length; i++) {
			m[i] = 95;
		}
        */		
		int [] m = {3,5,2,4,1};
		Arrays.sort(m); // 오름차순
		// dispM(m)		
		// [1, 2, 3, 4, 5] 
		System.out.println( Arrays.toString(m) );
	}

}
