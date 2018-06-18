package days12;

public class Ex02 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=-5
		//    홀-      sum += i
		//    짝+     sum -= i
		boolean sw = false;
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			//sum += i;
			if( sw ) {   // i%2==0
				sum -= i;
			    System.out.printf("%d+", i);
			   // sw = false;
			}
			else {
				sum += i;
				System.out.printf("%d-", i);
				//sw = true;
			}
			sw = !sw;
		}
		System.out.printf("\b=%d\n", sum);
		

	}

}





