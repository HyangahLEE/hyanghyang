package days05;

public class Ex11ex09 {       //ex09설명

	public static void main(String[] args) {
		// [출력]
		// 2 3 4
		// 5 6 7
		// 8 9
		
		// k=1  s=2 
		// k=2  s=6 
		// s = 4*k-2
		for (int k = 1; k <=2; k++) {
			System.out.println(k);
			for (int i = 1; i <= 9; i++) { 
		    	for (int j = 4*k-2; j <= 4*k+1; j++) {  // 단
					System.out.printf("%d*%d=%d\t",  j,i, i*j);
				}
		    	System.out.println();
			}
			System.out.println();
		}
		/*
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 2; j <= 5; j++) {  // 단
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 6; j <= 9; j++) {  // 단
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		*/
		
		/*  구구단 세로 출력
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 2; j <= 9; j++) {  // 단
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		*/
		/*
		 *  2*1=2   3*1=3 4*1=4  9*1=9개행
		 *  i = 1                     
		 *  j = 2 3 4 5 6 7 8 9  단
		 *  
		 *  2*9=18개행
		 * */ 

	}

}