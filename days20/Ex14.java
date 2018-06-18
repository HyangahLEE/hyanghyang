package days20;

import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// 년 now.set(Calendar.YEAR, ??)
		// 월 now.set(Calendar.MONTH, ??)
		// 일 now.set(Calendar.DAY_OF_MONTH, ??)
		int year = 2000 , month = 5;
		now.set(year, month-1, 1);
		// 2000년 5월 1일 무슨 요일 ? 월
		System.out.println( "토일월화수목금".charAt(
				  now.get(Calendar.DAY_OF_WEEK)) );
		// 마지막 날짜 ? 2000.6.1-1 ==> 2000.5.??
		// now.add(Calendar.MONTH, 1).add(Calendar.DAY_OF_MONTH,-1).get(Calendar.DAY_OF_MONTH);
		
		// 달력...( 4시 ... 이후 )
		

	}

}
