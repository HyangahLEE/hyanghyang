package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex15 {

	public static void main(String[] args) {
		// p 542
 
		String [] tz = TimeZone.getAvailableIDs();
		for (String id : tz) {
			TimeZone timezone = TimeZone.getTimeZone(id);
			Calendar c = Calendar.getInstance(timezone); 
			System.out.printf("%s - %s\n"
					, id, dispCalendar(c) );
		} 
		
	}
	
	public static String dispCalendar(Calendar now) {
		int year=  now.get(Calendar.YEAR ); 
		int month = now.get( Calendar.MONTH )+1; 
		int date = now.get( Calendar.DAY_OF_MONTH ); 
		int dow = now.get( Calendar.DAY_OF_WEEK); 
		int am_pm = now.get( Calendar.AM_PM ); 
		int h = now.get(Calendar.HOUR); 
		int m = now.get(Calendar.MINUTE); 
		int s = now.get(Calendar.SECOND); 
		int ms = now.get(Calendar.MILLISECOND); 
		
		return String .format(
				"%d년 %d월 %d일 (%c) %s %d:%d:%d.%d"
				,year, month, date
				, "토일월화수목금".charAt(dow) 
				, am_pm == Calendar.AM ? "오전" : "오후"
					, h, m, s, ms);
	}

}
