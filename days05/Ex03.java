package days05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//문제) n 정수를 입력받아서 1~n 까지의 홀수의 합 출력
		//1+3+5 =9

		int n = 1;
		System.out.print("> n 입력 ?");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= n;  i+=2) {
			if( i % 2 == 1)
				sum = sum + i;
			//실습시간에 해결.
			System.out.printf(i == n? "%d" : "%d+",i);	
		}
		System.out.printf("=%d\n", sum);

		/*sum +=  i ;
		   i++;*/

		//문제 ) n 정수를 입력 받아서 1~n 까지의 합 출력
		/*int n = 1;
		System.out.print("> n 입력?");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();


		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.printf(i == n? "%d" : "%d+",i);	
		}
		System.out.printf("=%d\n", sum);*/

	}
}
