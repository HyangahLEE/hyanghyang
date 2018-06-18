package days06;

import java.io.BufferedReader;       //제어문이해됨. 순서 이해하고,코딩연습
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		int year, month;
		
		//Scanner scanner = new Scanner(System.in);
		//year = scanner.nextInt();
		//month = scanner.nextint(); 
		
		BufferedReader br = new BufferedReader(
                  new InputStreamReader(System.in));
		System.out.print("> 년, 월 입력 ? ");
		String data = br.readLine();  // "2018,5"  6
		String [] datas = data.split("\\s*,\\s*");
		
		//if(  data.length() != 2) {
		if(  datas.length != 2) {
			System.out.println(" 입력잘못!!!");
			return ; // 프로그램 종료
		}
		// (자료형) cast 연산자 , cast 강제형변환  :   *** 클래스간의 형변환
		// 숫자 계열 끼리 만 사용할 수 있다. 
		// (int)2.5
		// (double)3.14f
		// int i =(int)'a'
		// char one =(char)65;
		
		year = Integer.parseInt( datas[0] ) ;   // "2018" -> 2018;
		month = Integer.parseInt( datas[1] );   // "5"; 
		// 달력그리기
		drawCalendar(year, month );
		
		//for (int m  = 1; m  <= 12; m ++) {
		//	drawCalendar(year, m );
		//}
		
	} 

	private static void drawCalendar(int year, int month) {
System.out.printf("%d년 %d월 달력\n", year, month);
		
		// [ 달력그리기 ]      2010   5   1
		// 1. 년,월,1 일  무슨 요일 ? 수요일
		        // 총날짜수
           		// 총날짜수%7        0(일)     ~ 6(토)
		// 1년 365일
		// 그이전년도 까지의 총날짜수 :  2009(year-1) * 365 
		// 2010   1(31)  2(28)   3(31) 4(30)   +1
		int totalDays = getTotalDays(year, month, 1);
		int dayOfWeek = getDayOfWeek(year, month, 1);
		// 총날짜수 %7 
		// 2. 년,월이     마지막날짜? 28,29,30,31
		int lastDate = getLastDate(year, month); 
		//System.out.printf("%d - %d\n", dayOfWeek, lastDate);
		
		// 그리기
		String  weeks = "일월화수목금토";
		System.out.println("------------------------------------------");
		for (int i = 0; i < weeks.length(); i++) {
			System.out.printf("%c\t", weeks.charAt(i) ); 
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%d\t", i);
			if( (dayOfWeek + i) %7==0 ) System.out.println(); 
		}
		System.out.println("\n------------------------------------------");
		
	}

	// 1월  2월 3월  4월  5월  6월 7월  8월  9월 10월 11월 12월
	// 31   28  31  30  31  30  31   31  30  31   30   31
	// 31+28+31+30+31+30+31+31+30+31+30+31

	// 마지막 날짜 얻어오는 함수
	private static int getLastDate(int year, int month) {
		int lastDate ;
		switch (month) {
		case 4:case  6: case 9: case 11:
			lastDate = 30;
			break;
		case 2:
			lastDate = isLeapYear(year)? 29 :28;
			break;
		default:
			lastDate = 31;
			break;
		}
		return lastDate;
	}

	// 요일 얻어오는 함수 
	private static int getDayOfWeek(int year, int month, int date) { 
		int totalDays = getTotalDays(year, month, date);
		return totalDays %7;
	}

	// 총날짜수 얻어오는 함수
	private static int getTotalDays(int year, int month, int date) { 
		int totalDays = 0;
		for (int y = 1; y < year; y++) {  // 그 이전년도
			totalDays += isLeapYear(y)?366:365;
		}
		// 5월                               0    1  2   3
		int []  daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1; i++) {
			totalDays += daysPerMonth[i];
		}
		if( isLeapYear(year) && month >= 3 ) totalDays++;
		totalDays += date;
		
		// 1월    1
		/*
		switch (month) {
		case 1:
			totalDays += date;
			break;
		case 2:
			totalDays += 31 + date;
		case 3:
			totalDays += 31 + 28/29+ date;
			:
				:
		case 12:
			totalDays += 31+28+31+30+31+30+31+31+30+31+30+date;
			break;
		}
		*/
		return totalDays;
	}

	private static boolean isLeapYear(int year) {		 	
		if(  year % 4  == 0  &&  year % 100 != 0 || year %400 == 0 ) 
				return true;
		else              
			return false;
	}
}