package days07;              //test 순차검색. 검증하는것 주민번호

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		String rrn;  // 주민등록번호 변수선언.
		rrn = getRRN();   //주민번호 가져오는 변수
		if (isRRNCheck(rrn)) System.out.println("검증 성공");
		                        else System.out.println("검증 실패");
	}  //만약에 rrn 넣어서 참이면 성공,아니면 실패 
	
	private static boolean isRRNCheck(String rrn) {
		int total = 0;    //total 값초기화
		int [] values = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <= 2 ; i++) {
			if( i == 6 ) continue;
			total +=Integer.parseInt(rrn.substring(i, i+1)) * values[i];
		}
		int ㅍ = (11-total % 11) % 10 ;
		return ( ㅍ == Integer.parseInt(rrn.substring(13)));
	}

	private static String getRRN() {
		String RRN;
		Scanner scanner = new Scanner(System.in);
		String pattern = "\\d{6}-\\d {7}";
		do {
			System.out.print(" > 주민등록번호 입력하세요? ");
			RRN =  scanner.next();
		} while ( ! RRN.matches(pattern));     //do~ while문: 한번 실행하고 안되면 빠져나온다.   ! 부정
		return RRN;
	}
}
