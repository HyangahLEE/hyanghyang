package days08;

public class Ex04 {

	public static void main(String[] args) {
		// 1. 
		// ****
		// ****
		// ****
		// ****
		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		 */	

		for (int i = 1; i <=4 ; i++) {
			//공백찍는 for 
			for (int j = 1; j <= i-1; j++) {
				System.out.println(" ");
			}
			//별찍는 for

			System.out.println();
		}



		//1		3___* 1
		//2		2__** 2
		//3		1_*** 3
		//4		0**** 4


		for (int i = 1; i <= 4 ; i++) {
			// 공백찍는 for
			for (int j = 1; j <=4-i; j++) {
				System.out.print("_");
			}
			// 별찍는 for
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*

		1		0****4
		2		1_***3
		3		2__**2
		4		3___*1
		j=5-i

		 */
		/*
				for (int i = 1; i <= 4 ; i++) {
					// 공백찍는 for
					for (int j = 1; j <=i-1; j++) {
						System.out.print("_");
					}
					// 별찍는 for
					for (int j = 1; j <=5-i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
		 */


		/*
		for (int i = 1; i <= 4 ; i++) {
			System.out.println("****");
		}
		 */

		// System.out.println("****");
		/*
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		for (int j = 1; j <= 4 ; j++) {
			System.out.print("*");
		}
		System.out.println();
		 */

		// ****개행
		// ****개행
		//  
		// i=1   j=1,2,3,4
		// i=2   j=1,2,3
		// i=3   j=1,2
		// i=4   j=1 
		// j=5-i
		for (int i = 1; i <= 4 ; i++) {        // 행 갯수
			//for (int j = 1; j <= 5-i ; j++) {    // 열 갯수
			//for (int j = 4; j > i-1  ; j--) {    // 열 갯수
			System.out.print("*");
		}
		System.out.println();
	}

}

