package days18;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 두 정수를 입력받아서 나눗셈 결과를 출력하는 코딩. 
		int a, b;
		double result=0;
		System.out.print(">  두 정수 입력 ? ");
		Scanner  scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		//예외처리 코드
		try {
			//예외가 발생할 코딩
			System.out.println("1");
			result =  a / b;
			System.out.println("2");
		} catch (Exception e) {
			// 예외가 발생할 때만 catch 실행
			System.out.println(e.getMessage());
			//get.message 오류메세지 가져오기
		}finally {
			System.out.println("항상 실행");
		}
		
		System.out.println(result);

	}

}



