package days18;

import java.util.Scanner;

import days17.Employee;

public class Ex04 {

	public static void main(String[] args) {
		// 두 정수를 입력받아서 나눗셈 결과를 출력하는 코딩. 
		int a, b;
		double result = 0;
		System.out.print(">  두 정수 입력 ? ");
		Scanner  scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();
		// java.lang.ArithmeticException 실행오류
		// 예외 처리 코드

		try {
			// 오라클 서버
			// 이혜원 오라클 DB 서버 연결(open)

			// dao - insert, update, delete, select
			//         홍길동  <- 10
			// 예외 발생할 코딩...
			System.out.println("1");
			result =  a / b;
			//
			System.out.println("2");
			//
			Employee emp  = null;
			emp.getPay();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); //
		}catch(Exception e) {
			System.out.println(e.getMessage()); //
		}
		finally {
			// 추가 코딩....
			System.out.println("항상 실행");
			// DB 닫기( close )  파일 닫기( close )
		}


		/*
		System.out.println("1");
		if( b == 0 )
			System.out.println("> 0으로 나눌 수 없다.");
		else
			result = a / b;		
		System.out.println("2");
		 */

		System.out.println(result);

	}

}






