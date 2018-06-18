package days12;

public class Ex07 {
	public static void main(String[] args) {
		// [피보나치 수열](Fibonacci Sequence)
		// 1+1+2+3+5+8+13+21+....
		// ㄱ. 항의 갯수가 20 개 까지의 합
		// ㄴ. 항 <=100          까지의 합
		
		// [ 피보나치 수열 설명 ]
		// 1) 첫 번째 항과 두 번째 항은 1로 초기화 하고 시작
		// 2) 첫 번째 항과 두 번째 항을 더해서 다음 세 번째 항을 만든다.
		//     두 번째 항과 세 번째 항을 더해서 다음 네 번째 항을 만든다.
		//     세 번째 항과 네 번째 항을 더해서 다음 다섯번째 항을 만든다
		//    이렇게 반복처리한다. 
		
		int first = 1, second = 1 , third = 0 , sum = 1+1;
		int numberOfItems = 2;   // 항 갯수 
		System.out.print("1+1+");
		
		while(numberOfItems < 20) {
			 third = first +second;
			// if( third > 100) break;
			System.out.printf("%d+",third);
			sum += third;
			
			first = second;
			second = third;
			
			numberOfItems++;
		}
		
		// sum  = 7
		// f   s   t
		//     f   s   t
		//         f    s
		// 1+1+2+3+
		/*
		while((third = first +second) <=100) {
			// third = first +second;
			// if( third > 100) break;
			System.out.printf("%d+",third);
			sum += third;
			
			first = second;
			second = third;
			
		}
		*/
		
		System.out.printf("\b=%d\n", sum);
		
		

	}

}