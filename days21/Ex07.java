package days21;

import java.time.LocalDate;
import java.time.Month;

public class Ex07 {

	public static void main(String[] args) {
		// p553 LocalDate , LocalTime, LocalDateTime
		// 날짜, 시간에 대한 정보 얻어오자.
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		//년
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());		//5
		System.out.println(now.getMonth()); 	//May
		
		
		System.out.println();
	
		
		

	}

}
