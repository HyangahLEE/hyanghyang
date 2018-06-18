package days07;                //시험.

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String rrn; // 9 8 0 1 0 1 - 1 7 0 0 0 0   [1]
		// 2 3 4 5 6 7   8 9 2 3 4 5
		rrn = getRRN();
		if( isRRNCheck(rrn) ) System.out.println("검증 성공");
		else                          System.out.println("검증 실패"); 

		/*
		‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. 
		// (단, 10은 0, 11은 1로 표기한다.)
		 */
	}

	private static boolean isRRNCheck(String rrn) {
		// 2×ㄱ
		// rrn.charAt(0)-48;		
		int total = 0;
		int [] values = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <=2 ; i++) {
			if(i==6) continue;
			total +=Integer.parseInt(rrn.substring(i, i+1) ) * values[i] ;
		}
		// 10   0, 11  1
		int  ㅍ = (11- total % 11) %10; 
	    return ( ㅍ == Integer.parseInt(rrn.substring(13))) ;

		/*
		        total +=Integer.parseInt(rrn.substring(0, 1) ) * 2 ;
				total +=Integer.parseInt(rrn.substring(1, 2) ) * 3 ;
				total +=Integer.parseInt(rrn.substring(2, 3) ) * 4 ;
				total +=Integer.parseInt(rrn.substring(3, 4) ) * 5 ;
				total +=Integer.parseInt(rrn.substring(4, 5) ) * 6 ;
		 */
		// 
	}

	private static String getRRN() {
		String RRN; 
		Scanner scanner = new Scanner(System.in); 
		String pattern = "\\d{6}-[0-9]{7}"; 
		do {
			System.out.print("> 주민등록번호 입력하세요? ");
			RRN = scanner.next();   
		} while (  ! RRN.matches(pattern)    ); 
		return RRN;
	}

}