package days15;

import java.util.Calendar;

// 클래스
/*
class Calendar{
	public static final int YEAR = 1;
}
*/
class DayOfWeek{
	// [상수] 필드
	public static final int SUN = 0;
	public static final int MON = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
	public static final int THU = 4;
	public static final int FRI = 5;
	public static final int SAT = 6;
}

public  class Ex04 {
	
	// final static 필드 의미 ? p 246
	// 불변의 값 == 상수
	
	// 상수 필드
	//public [final] double PI = 3.1415;
	// Ex04 obj = new Ex04();
	// obj.PI
	
	//public [static] [final] double PI = 3.1415;
	// static ? 프로그램 시작~ 객체X 사용할 수 있다.
	//            클래스명.static멤버
	// Ex04.PI
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println( calendar.get(1) );
		System.out.println( calendar.get(Calendar.YEAR) );
		
		System.out.println( Calendar.YEAR == 1 );
		
		// 상수
		// 3.14  실수 리터럴
		// 'a'     문자 리터럴
		// 100   리터럴
		// final double PI = 3.14;  // 상수 
		
		// 만년달력 그리기
		// 1. 2018.5.1 무슨 요일 ?
		//    총날짜수 % 7 ==0 일요일
		// 2. 마지막 날짜 ?
		int dayOfWeek = 0;
		switch (dayOfWeek) {
		case DayOfWeek.SUN:  
			break;
		case DayOfWeek.MON:  
			break;
		case 2: // 화요일
			break;

		default:
			break;
		}
		

	}

}