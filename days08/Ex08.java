package days08;

public class Ex08 {   //방법2

	public static void main(String[] args) {

		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5; j++) {
				//		if ( i<=j ) System.out.print("*");

				//		if ( i <=j  && i+j<=6 || i >=j  && i+j>=6 ) System.out.print("*");
				//		else System.out.print("_");

				if ( i <j  && i+j<6 || i >j  && i+j>6 ) System.out.print("_");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
}
