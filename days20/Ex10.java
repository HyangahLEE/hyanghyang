package days20;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		//  p 533 Math, Random 클래스
		// Math : 수학계산에 관련  정적 메서드.
		// Math.max(12, 23)
		// Math.min(2.14, 4.2);
		System.out.println( Math.PI );
		System.out.println( Math.E );
		
		// dobule Math.pow(2, 3)
		// Math.abs(a) 절대값
		
		// double ceil() 올림   소수점 첫번째 자리
		System.out.println( Math.ceil(3.14) );  // 4.0
		System.out.println( Math.ceil(3.74) );  // 4.0
		// double floor() 버림   소수점 첫번째 자리
		System.out.println( Math.floor(3.14) );  // 3.0
		System.out.println( Math.floor(3.74) );  // 3.0
		// int 반올림
		System.out.println( Math.round(3.14) );  // 3
		System.out.println( Math.round(3.74) );  // 4
		//		Math.sqrt(2)
		
		// double rint()  == int round()
		
		// 종자값 : Random rnd = new Random(long seed);
		

	}

}
