package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 주민등록번호 ( Resident Registration Number, RRN )
		// ㄱ ㄴ ㄷ ㄹ ㅁ ㅂ - ㅅ ㅇ ㅈ ㅊ ㅋ ㅌ ㅍ  13자리
		// 990121
		// 011203
		// 1. 생년월일  ㄱ ㄴ ㄷ ㄹ ㅁ ㅂ    1899/1999년 1월 21일  X
		//                                       1901년 12월 23일
		//                                       2001년 12월 23일
		
		// 2. 출신지역 ***  
		
		// 3. 성별     ㅅ     1800, 1900, 2000
		
		// 4. 나이      ***
		
		// 5. 검증
		
		String rrn; // 980101-1700001
		rrn = getRRN();
        String birth = getBirth(rrn);  
        System.out.println( birth );   // "1912년 34월 56일"
        
        boolean gender = getGender(rrn);  // 성별
        System.out.println(  gender ? "남자" : "여자");
	}

	private static boolean getGender(String rrn) {
		char gender =  rrn.charAt(7);  // '1'
		// gender % 2      '1' ==49 % 2
		return  (gender-48)%2 == 1 ? true:false;
		
		/*
		if( gender =='1' ||  gender =='3' ||  gender =='5' ||  gender =='7'  gender =='9'    )
		   return true;
		else return false;
		*/
		/*
		switch(gender) {
		  case 9: case 1: case 3: case 5:case 7:  
			            return true;  // 남자
		  default : return false; // 여자
		}
		*/
	}

	private static String getBirth(String rrn) {
		// String substring( beginIndex , endIndex )
		int year = Integer.parseInt(  rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int date = Integer.parseInt( rrn.substring(4, 6) );
		
		// ㅅ 성별 관련 숫자 읽어오기
		//char  rrn.charAt(7);           '1'
		//String rrn.substring(7, 8);   "1"
		switch (rrn.substring(7, 8)) {
		case "9":case "0": 	year += 1800 ;			break;
		case 	"1":case "2":case "5" :case "6": 	year += 1900 ;break;
		case "3":case "4":case "7":case "8":  year += 2000 ;	break;
		}
		
		// 내가 원하는 문자열 형식으로 만들어서 반환하고 싶다. 
		// System.out.printf("%d년 %d월 %d일", year, month, date);
		// [기억] String 클래스의 format() 
		return  String.format("%d년 %d월 %d일" 
				, year, month, date);
	}

	private static String getRRN() {
		String RRN; 
		Scanner scanner = new Scanner(System.in);
		
		// 0~100 유효성
		String pattern = "\\d{6}-[0-9]{7}";
		
		do {
			System.out.print("> 주민등록번호 입력하세요? ");
			RRN = scanner.next();   // 6-7 유효성 검사
		} while (  ! RRN.matches(pattern)    );
		
		
		return RRN;
	}

}




/*
while (false) {
	System.out.println("TEST");
}
 // 최소한 1번은 { 실행코딩} 수행여부 ? 
do {
	System.out.println("TEST");
} while ( false );
*/