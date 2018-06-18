package days12;

public class Ex06 {

	public static void main(String[] args) {
		// 1 ~ n 까지의 소수의 합. 갯수
		// 소수 [prime number, 素數]  
		// 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
		int sum = 0, n = 100;
		for (int i = 1; i <=n ; i++) {
			// 10
			// 소수 true , false
			if( isPrimeNumber(i) ) {
				System.out.printf("소수 : %d\n",i);	
				sum += i;
			}
			/*
			for (int j = 2; j < 10; j++) {
				if( i % j ==0 ) {
					System.out.printf("%d는 소수 아님\n", i);
					break;
				}
			}
			*/
		}
		System.out.println(sum);

	}

	private static boolean isPrimeNumber(int i) {
		if(i==1)return false;
				for (int j = 2; j <i; j++) 
			if(i % j==0) 	return false;
			return true;
	}

}