package days08;  //시험

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 함수(메서드) 설명
		// 라인(선) 긋기 함수 : drawLine() 선언 -> 호출
		//                          drawLine(10) 
		//                          drawLine(10,'^')
		// 중복함수 (== 오버로딩( Overloading ))
		// int sum(int x, int y)
		// 함수 3가지 : 기능(일), 매개변수, 리턴값(리턴자료형) 
		// swapXY()   Call By Name, Call By Value, Call By Referenece
		
		// 재귀 함수[recursive function]
		// 정의 ? 자기 자신을 호출하는 함수.
		
		//disp();
		//System.out.println(sum(10));
		
		
		// 1~n 까지의 합을 구해서 반환하는 재귀함수 ( 암기 )
		// System.out.println(recursive_sum(10));
		
		
		// 1의 양의정수 n 까지의 계승    n!=1*2*3*....*n
		// 0!=1 약속
		//System.out.println(factorial(10));
		//System.out.println(recursive_factorial(10));
		
		
		int m , n;   // 두 정수를 입력받아서... m(밑)  n(지수)
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 밑, 지수 입력 ? ");
		m = scanner.nextInt();
		n = scanner.nextInt();
		// 누승 == 거듭제곱 == power == pow()
		// 2  3   8
		// 2 -3   0.125
		
		//System.out.println( pow(m,n) );
		System.out.println( recursive_pow(m,n) );
	}
	
	// 2^3 = 2*2*2
	// 2^-3=1/2^3
	// 1/2 * 2 * 2 
	
	private static double recursive_pow(int m, int n) {
		if( n < 0)  return 1/ ( recursive_pow(m, n * -1) );
		else if( n==1 )  return m;
		else         return m * recursive_pow(m, n-1);
	}

	private static double pow(int m, int n) {
		// 2(밑) 3(지수) = 2*2*2 
		double s = 1;
		/*
		for (int i = 1; i <= ( n >0 ? n : -n ) ; i++) {
			s *= m;
		}
		*/
		for (int i = 1; i <=  Math.abs(n)  ; i++)  
			s *= m;  
		return n>0?  s :  1/s;
		
		/*
		if( n > 0 ) {
			for (int i = 1; i <=n ; i++) {
				s *= m;
			}
			return s;
		}else {
			// 코딩 : 부호 변경하고 싶다면    * -1
			for (int i = 1; i <=-1 * n ; i++) {
				s *= m;
			}
			return 1/s;
		}
		*/
		
		
	}

	// 복사 수정 사용...
	private static int recursive_factorial(int n) {
		if( n == 1 ) return 1;
		else           return n * recursive_factorial(n-1);
	}

	private static int factorial(int n) {
		// 10!=1*2*3*4*...*9*10
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}

	// 10+recursive_sum(9)
	//      9+recursive_sum(8)
	//           8+recursive_sum(7)
	private static int recursive_sum(int n) {
		if( n == 1 ) return 1;
		else           return n+ recursive_sum(n-1);
	}

	// 1~n 까지의 합을 구해서 반환하는 함수
	public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}

	// 재귀함수
	private static void disp() {
		 System.out.println("> disp() 호출됨.");
		 disp(); // 자기 자신을 호출하는 함수 호출 코딩(부분)
	}

}

