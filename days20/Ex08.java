package days20;

public class Ex08 {

	public static void main(String[] args) {
		// p 527 Wrapper(포장) 클래스 
		// 각 기본형(8개)를 사용하기 쉽도록 가공해 놓은 클래스 : 래퍼클래스
		/*
		int max = Integer.MAX_VALUE;
		int  kor = Integer.parseInt("90");
		System.out.println(max);
		*/
		/*
		byte  -> Byte
		char  -> Character
		short -> Short
		int    -> Integer
		long  -> Long
		float  -> Float
		double   -> Double
		boolean -> Boolean
		*/

		// 자동 박싱(Auto Boxing)과 자동 언박싱(Auto UnBoxing) 개념.
		int i1 = 10;
		Integer i2 = i1;  // int -> 형변환 -> Integer    박싱
		
		// 객체 -> 기본형   오토 언박싱.
		int n = new Integer("10");
		
		System.out.println(n);
		//
		
		
		
	}

}





