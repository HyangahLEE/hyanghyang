package days12;

public class Ex03 {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <=49; i++) {
		sum +=(double)i/(i+1);
		System.out.printf("%d/%d+",i,i+1);
		}
		System.out.printf("\b=%f\n",sum);
	}

}
