package days02;

public class Ex07 {
	
	public static void main(String[] args) {
		//char 한 문자를 저장하는 Data Type
		// 1. 자바는 모든 문자를 유니코드(Unicode) 처리한다.
		// 2. 세계 각국의 문자들을 코드값으로 매핑한 국제 표준 규약
		// 3. 2byte
		
	char one =  'A';    // 10진수 정수   65
	//2진수 변경 : 0100 0001
	
            one = '\u0041';	
			System.out.printf(">one = '%c\'\n", one);
			
	
	}

}
