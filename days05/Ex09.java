package days05;

public class Ex09 {                     //구구단 출력.

	public static void main(String[] args) {
		// k=1  s=2 
		// k=2  s=6 
		// s = 4*k-2
		
		
		for (int k = 1; k <=3; k++) {
			System.out.println(k);
			for (int i = 1; i <= 9; i++) { 
				for (int j = 3*k-1; j <= 3*k+1 ; j++) {              // 단으로 처리
				if( j==10 ) break;
				
					System.out.printf("%d*%d=%d\t",  j,i, i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		/*
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 2; j <= 5; j++) {  
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 6; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		 */

		/*  ±¸±¸´Ü ¼¼·Î Ãâ·Â
		for (int i = 1; i <= 9; i++) { 
	    	for (int j = 2; j <= 9; j++) { 
				System.out.printf("%d*%d=%d\t",  j,i, i*j);
			}
	    	System.out.println();
		}
		 */
		/*
		 *  2*1=2   3*1=3 4*1=4  9*1=9°³Çà
		 *  i = 1                     
		 *  j = 2 3 4 5 6 7 8 9  ´Ü
		 *  
		 *  2*9=18°³Çà
		 * */ 

	}

}