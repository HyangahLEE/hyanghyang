package days20;

import java.util.Date;

public class Ex11 {

	public static void main(String[] args) {
		// p 538 Date, Calendar 클래스
		// 1. java.util 패키지 
		// 2. Date 클래스 ? 날짜를 표현하는 클래스
		//                       객체 간에 날짜 정보를 주고 받을 때 주로 사용.
		//     예)  [???DAO] insert(MemberDTO )   [??? Service]
		//                          Date 생년월일
		//     예) [[ 입사일자, 생일  이런 날짜를 저장할 자료형]]
		
		// 디폴트 생성자로 객체 생성하면 현재 컴퓨터의 날짜 ....
		Date now = new Date();
		
		//Date now = new Date(2000-1900, 5-1, 1);
		
		now.setYear(2000-1900);
		now.setMonth(5-1);
		now.setDate(1);
		
		System.out.println(now); // Tue May 29 14:05:12 KST 2018
		
		int year =  now.getYear() + 1900;
		int month = now.getMonth() + 1;
		int date  = now.getDate();
		// 일 (0)             토( 6 )
		String dayOfWeek = "일월화수목금토";
		int dow = now.getDay();
		int h = now.getHours();
		int m = now.getMinutes();
		int s = now.getSeconds();
		
		// long System.currentTimeMillis();
		// long now.getTime();  *** 1527571087821
		// System.out.println(now.getTime());
		
		// 낮 12:00:00 오후
		
		String data = String.format(
				"%d년 %d월 %d일 (%c)  %d:%d:%d\n"
				, year, month, date, dayOfWeek.charAt(dow)
				, h, m, s);
		System.out.println(data);
		
		
		
		
		
	}

}
