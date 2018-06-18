package days05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 문제) n 정수를 입력받아서 1~n 까지의 홀수의 합 출력
		//  1+3+5=9


		int n = 1;
		System.out.print("> n 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		n =  scanner.nextInt();

		int sum  = 0;
		for (int i = 1; i <= n ; i+=2) {

			sum += i; 
			System.out.printf( i ==n? "%d":"%d+", i);

			/*
			if( i%2==0 ) continue;
			sum += i; 
			System.out.printf( i ==n? "%d":"%d+", i);
			 */  
			/* 1
			if(  i % 2 != 0 ) {
			  sum += i;
			  // [실습시간에 해결]
			  System.out.printf( i ==n? "%d":"%d+", i);
			}
			 */
		}
		System.out.printf("=%d\n", sum);



		// 문제) n 정수를 입력받아서 1~n 까지의 합 출력
		/*
		int n = 1;
		System.out.print("> n 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		n =  scanner.nextInt();

		int sum  = 0;
		for (int i = 1; i <= n ; i++) {
			sum += i;
			System.out.printf( i ==n? "%d":"%d+", i);
		}
		System.out.printf("=%d\n", sum);
		 */
	}

}