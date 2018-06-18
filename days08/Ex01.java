package days08;

import java.time.LocalDateTime;

public class Ex01 {

	public static void main(String[] args) {
		String rrn = "891011-1700001";
		// 생년월일, 나이, 검증, 성별, 출신지역~
		// [나이 계산]
		// 1  1900년  남자
		int year = Integer.parseInt( rrn.substring(0,2) ); // 89
		String gender = rrn.substring(7,8);  // "1"
		switch (gender) {
		  case "1": year += 1900; break;
		  default: year += 2000; break;
		}
		
		// 올해 몇 년 ? 2018
		int thisYear ;
		
		/* 1. java.util.Date 클래스  (년도)
		Date now = new Date(); // 날짜, 시간 get/set 기능이 구현된 물건(클래스)
		thisYear = now.getYear() + 1900;
		*/
		
		/* Calendar 클래스 ( 년도 )
		Calendar  calendar = Calendar.getInstance();
		thisYear = calendar.get( Calendar.YEAR  );
		*/
		
		// JDK 8.0 ~
		/* LocalDate : 날짜 다루는 기능(함수) 구현된 클래스
		LocalDate  now = LocalDate.now();
		thisYear = now.getYear();  // 2018
		*/
		
		// java.time.LocalTime  시간 다루는 기능을 구현한 클래스
		
		// LocalDate + LocalTime => LocalDateTime 클래스
		LocalDateTime now = LocalDateTime.now();
		thisYear = now.getYear();
		
		System.out.println( thisYear - year + 1  );
	}

}
