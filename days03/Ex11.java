package days03;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 int x = 100;
		System.out.println(   x = 100   );  // true   ==
		// The operator ! is undefined for the argument type(s) int
		System.out.println(   x = !100   );   // false
		*/
		// p 83   NaN 과 Infinity 연산
		
		// java.lang.ArithmeticException: / by zero
		// System.out.println(    5 / 0     );		
		// Infinity // 실수를 0으로 나누면 Infinity(무한대)가 발생한다.
		// System.out.println(    5.0 / 0     );
		
		// 나머지 구하는 연산자
		//  java.lang.ArithmeticException: / by zero
		//  0으로 나눌려고 해서 산술적예외(에러) 발생
		//System.out.println(    5 % 0     ); 
		// NaN ( Not A Number )
		
		System.out.println(    5.0 % 0     );
		
		/*
		long  i = Integer.MAX_VALUE;
		//System.out.println(i);
		long j = 100;		
		long z = i + j;    // int + int -> int     산술 오버플로워 = 쓰레기 값; over flower
		// 결과 값이 아닌 리터럴 데이터 타입 자체를 변경해주어야 한다.
		
		System.out.println( z );
		*/
		
		
		// p64
		// 쉬프트 연산자 : >> / << / >>>
		// ㄱ. 비트 연산자
		
	/*	System.out.println(10 >> 2);  // 오른쪽 쉬프트 연산자
		// [0][0][0][0] [1][0][1][0]
		// [0][0][0][0] [0][0][1][0]  => 2
		// 부호비트에 따라 패딩값을 1이면 1로 0이면 0으로 채운다.
		
		System.out.println(10 << 2);  // 왼쪽 쉬프트 연산자
		// [0][0][0][0] [1][0][1][0]
		// [0][0][1][0] [1][0][0][0]  => 40
		// 패딩값을 무조건 0으로 채운다.
		
		System.out.println(10 >>> 2);  // 오른쪽 쉬프트 연산자
		// [0][0][0][0] [1][0][1][0]
		// [0][0][0][0] [0][0][1][0]  => 2
		// 패딩값을 무조건 0으로 채운다.
*/
		// [ 연산자 우선 순위 기억 ]
		// ~ >  & >  ^  > | > && > ||
		/*
	     	<------
		x = y = z = 0;
	     	10 + 5+4-7
	    */
		
		//int x = 10, y= 20;
		// int z = x++  + ++x + y++;
		// 증감연산자는 중복해서 쓰면 안된다. ( 차라리 증가값을 한번에 증가시키는 것이 낫다.)
	}

}

