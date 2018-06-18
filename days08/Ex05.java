package days08;

public class Ex05 {

	public static void main(String[] args) {
		// i=1  2  1
		// i=2  1  3
		// i=3  0  5
		//      2*n-1
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

	}

}
