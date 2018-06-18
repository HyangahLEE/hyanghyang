package days04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// switch 분기문
		/*
		switch (key) {
		case value:
			break;
		case value:
			break;
		case value:
			break;
			  :
		[default:
			break;]
		}
		*/
		// 정수 입력받아서 짝수/홀수 출력 ( switch문사용 )
		Scanner scanner = new Scanner(System.in);
		//The local variable n may not have been initialized
		int n ;
		System.out.print("> 정수 입력 : ");
		n = scanner.nextInt();
		switch (   n % 2  ) {  // 수식 , 변수
		case 0:
			System.out.println("짝수");
			break; 
		//case 1:
			default :
			System.out.println("홀수");
			break;
		
		}
		
		// 국어 입력받아서 수/우/미/양/가 출력 ( switch문사용 )

		
	}

}