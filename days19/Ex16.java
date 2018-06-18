package days19;

import java.util.StringTokenizer;

public class Ex16 {

	public static void main(String[] args) {
		// p 508  toLowerCase() / toUpperCase()
		// p 509  문자열 앞뒤 공백 잘라내기 : trim() 
		// kenik_
		String id ="  kenik  ";
		System.out.printf("[%s]\n", id.trim());
		
		// p 510 
		// 3 + ""
		// 3.14 + ""
		// true + ""
		
		// valueOf()     // 기본형 타입(8)의 값을 String 형 변환
		// String.valueOf(3.14)   "3.14"
		
		// p 511  StringTokenizer 클래스 (문자) == split(정규표현식)
		/*
		String data = "홍길동 /  이석화  , 김재곤/  이혜원  ";
		String [] names =  data.split(",|/");
		for (String name : names) {
			System.out.printf( "[%s]\n", name.trim() );
		}
		*/
		// 정규표현식 (a|b)
		
		String data = "홍길동,이석화,김재곤,이혜원"; // 토큰
		StringTokenizer st = new StringTokenizer(data, ",");
		
 		//  st.countTokens(); // 토큰 갯수
		//
		while ( st.hasMoreTokens() ) {  // true/false 토큰 있니?
			String name = st.nextToken();
			System.out.println(name);
		}
		
		

	}

}
