package days12;

public class Ex04 {

	public static void main(String[] args) {
		// [수열]
		// 1+2+4+7+11+16+22+29+...92=
		//   1  2  3  4    5   6       증가치
		// ㄱ. 20 항의 갯수 까지의 합 ? 
		
		// ㄴ. 항의 값이 100보다 같거나 작을 때 까지의 합? ???
		int outputValue = 1;  // 출력치
		int increase = 0;       // 증가치  
		int sum = 0;		
		// 0
		// 1
		while( (outputValue += increase ) <= 100) {
			 sum += outputValue;  
			 System.out.printf("%d+", outputValue); // 1+2+4+
			 increase++;  // 3 
		}
		System.out.printf("\b=%d\n", sum);
		
		/*
		int outputValue = 1;  // 출력치
		int increase = 0;       // 증가치 
		int numberOfItems = 0;   // 항갯수
		int sum = 0;		
		// 0
		// 1+2+
		while(numberOfItems < 20) {
			 outputValue += increase; // 4
			 sum += outputValue;  
			 System.out.printf("%d+", outputValue); // 1+2+4+
			 increase++;  // 3
			 numberOfItems++; // 3
		}
		System.out.printf("\b=%d\n", sum);
        */
	}

}
