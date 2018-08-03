package days02;

public class Ex07 {
	
	public static void main(String[] args) {
		//char 한 문자를 저장하는 Data Type
		// 1. 자바는 모든 문자를 유니코드(Unicode) 처리한다.
		// 2. 세계 각국의 문자들을 코드값으로 매핑한 국제 표준 규약
		// 3. 2byte
		// ASCII 코드 0 = 48  / A = 65 / a = 97   1byte로 한글자 표현(영어)
		// 한글의 표현 15bit (초성 중성 종성 각 5bit) = 2byte
		
	char one =  'A';    // 10진수 정수   65
	//2진수 변경 : 0100 0001
	// char [][][][][][][][] [][][][][][][][]
		// A => 10진수 정수 65와 매칭되는 코드이기 때문에 2진수 0000 0000 0100 0001로 변환
		
		
		
            one = '\u0041';	
			System.out.printf(">one = '%c\'\n", one);
			
	
	}

}
