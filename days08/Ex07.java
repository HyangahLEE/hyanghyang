package days08;

public class Ex07 {

	public static void main(String[] args) {
		/*
							__*
							_***
		                    *****
		 */
		for (int i = 1; i <=3 ; i++) {
			for (int j = 1; j <=5 ; j++) {
				//if( i+j >=4) System.out.print("*");	
				if(  i+j >=4 && j-i <=2) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}

		/*
		for (int i = 1; i <= 3; i++) {
			// 공백찍는 for
			for (int j = 1; j <= 3-i; j++) {
				System.out.print("_");
			}
			// 별찍는 for
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */
		/*		
		 *
				_*
				__*
				___*
				____*
		 */
		/* 
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5 ; j++) {
				if( i == j || i+j==6) System.out.print("*");
				else  System.out.print("_");
			}
			System.out.println();
		}
		 */
		/*
		for (int i = 1; i <=5 ; i++) {
			// 공백찍는 for
			for (int j = 1; j <= i-1; j++) {
				System.out.print("_");
			}
			System.out.print("*");

			System.out.println();
		}
		 */
		/* 
		____*
		___*
		__*
		_*
		 *
		for (int i = 1; i <=5 ; i++) {
			// 공백찍는 for
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("_");
			}
			System.out.print("*");

			System.out.println();
		}
		 */
	}

}
