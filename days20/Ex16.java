package days20;

import java.util.Calendar;
import java.util.spi.CalendarNameProvider;

public class Ex16 {

	public static void main(String[] args) {
		// ■ 1. main ()메소드의 매개변수 년도, 월 입력받고...
		int year = Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		
		// ■ 2. Calendar 객체 생성
		Calendar calendar = Calendar.getInstance();
		calendar.set( year, month-1, 1 );
		// ■ 3. year, month, 1 -> 요일 얻어오기
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
		// ■ 4. 출력할 달력의 시작일 설정 코딩..................
		calendar.add(Calendar.DATE, -dayOfWeek);
		//System.out.println(Ex15.dispCalendar(calendar));
		
		// ■ 5. 달력 출력 코딩.
		System.out.printf("\t\t\t\t%d.%d \n", year, month);
		System.out.println("--------------------------------------------");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <=7 ; j++) {
				if( month == calendar.get(Calendar.MONTH)+1)
				   System.out.printf("%d\t", calendar.get(Calendar.DATE) );
				else if(month == calendar.get(Calendar.MONTH)+1+1) // 이전 달
					System.out.printf("(%d)\t", calendar.get(Calendar.DATE) );
				else   // 다음 달
					System.out.printf("(%d)\t", calendar.get(Calendar.DATE) );
				calendar.add(Calendar.DATE, 1);
			}
			System.out.println();
		}
		System.out.println();
		
		
			

		

	}

}
