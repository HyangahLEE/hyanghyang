package days03;

public class Ex01 {

	public static void main(String[] args) {
		// p 50
		// [ 타입(형) 변환 ]
		// 1. 자동 형변환 2가지 경우
		
		double pi = 3.14F;
		
		//float f = 3.14; // double
		
		
		int i = 100;     // [][][][]  4byte
		long l = 100; // [][][][] [][][][] 8byte
		//00000000  00000000  00000000  00000000 00000000 00000000 00000000 00001010
		
		// 강제 형변환
		// 1. cast 연산자    : cast 강제 형변환 
		// (자료형)
		int j = (int)10L;
		
		long result =  i + l;  // int + long = long
		// ㄱ. 작은자료형  연산(+) 큰자료형  ==> 큰자료형
		// ㄴ. 작은자료형의 값을 큰 자료형의 기억공간 할당(대입) 
		
		// 2. 강제 형변환
		
		// avg = (double)278 / 3  =>  .00
		// double avg =  92.00000
		//          short/int -> int
		
		// String -> int, byte, short, long , float, double
		// int -> String , byte, double
		
		// 함수 3가지 : 1) 기능 2) 매개변수 3) 리턴값 리턴자료형
		//                                                       void
		//String data = br.readLine() ; // "98"
		// 기본형 8개 -> Wrapper Class
		/*
		Integer.parseInt(data);
		Long.parseLong(data);
		Byte.parseByte(data);
		Double.parseDouble(data);
		*/
		// "98"+"98"+"98" = "989898"
	}

}
