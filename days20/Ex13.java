package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		// p 539 Calendar 클래스 
		// Calendar now = new Calendar();  X 추상클래스
		Calendar now = Calendar.getInstance();
		// java.util.GregorianCalendar[time=1527573728375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=149,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=8,MILLISECOND=375,ZONE_OFFSET=32400000,DST_OFFSET=0]
		// System.out.println(now);
		// int year=  now.get(int field);
		int year=  now.get(Calendar.YEAR ); // now.get(1);
		int month = now.get( Calendar.MONTH )+1;
		// *** int date = now.get( Calendar.DATE );
		int date = now.get( Calendar.DAY_OF_MONTH );
		// 토(0) 일(1) 월(2) 화(3) ~
		int dow = now.get( Calendar.DAY_OF_WEEK);
		// 오전/오후
		int am_pm = now.get( Calendar.AM_PM );
		// 시
		int h = now.get(Calendar.HOUR);
		// 분
		int m = now.get(Calendar.MINUTE);
		// 초
		int s = now.get(Calendar.SECOND);
		// 밀리세컨트
		int ms = now.get(Calendar.MILLISECOND);
		
		// 2018년 05월 29일 (화) 오후 15:13:54.504
		System.out.printf(
				"%d년 %d월 %d일 (%c) %s %d:%d:%d.%d\n"
				,year, month, date
				, "토일월화수목금".charAt(dow) 
				, am_pm == Calendar.AM ? "오전" : "오후"
					, h, m, s, ms);
		
		// System.out.println(Calendar.YEAR);
		
		
		/*
		Date now = new Date();
		// 그리니치평균시. 런던교외의 그리니치 천문대의 자오선상에서의 
		// 평균 태양시를 기준으로 하여 전세계의 지방표준시를 나타냄.
		System.out.println( now.toGMTString());
		System.out.println( now.toLocaleString());
		System.out.println( now.toString());
		*/

	}

}
