package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex09 {

	public static void main(String[] args) {
		// p560 날짜와 시간 비교하기
		LocalDateTime startDataTime = LocalDateTime.of(2018,4,24,9,0,0);
		System.out.println("시작일 : "+ startDataTime);


		LocalDateTime endDataTime = LocalDateTime.of(2018,11,22,18,0,0);
		System.out.println("종료일 : "+ endDataTime);


		if(startDataTime.isBefore(endDataTime)) {
			System.out.println("진행중입니다");
		} else if(startDataTime.isEqual(endDataTime)) {
			System.out.println("종료합니다");
		}else if(startDataTime.isAfter(endDataTime)) {
			System.out.println("이미 종료 되었습입니다");
		}

		
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDataTime.until(endDataTime, ChronoUnit.YEARS);
		long remainMonth = startDataTime.until(endDataTime, ChronoUnit.YEARS);
		long remainDay= startDataTime.until(endDataTime, ChronoUnit.DAYS);
		long remainHour = startDataTime.until(endDataTime, ChronoUnit.HOURS);
		long remainMinutes = startDataTime.until(endDataTime, ChronoUnit.MINUTES);
		long remainSeconds = startDataTime.until(endDataTime, ChronoUnit.SECONDS);
		
		
		remainYear = ChronoUnit.YEARS.between(startDataTime, endDataTime);
		remainMonth  = ChronoUnit.MONTHS.between(startDataTime, endDataTime);
		remainDay= ChronoUnit.DAYS.between(startDataTime, endDataTime);
		remainHour = ChronoUnit.HOURS.between(startDataTime, endDataTime);
		remainMinutes= ChronoUnit.MINUTES.between(startDataTime, endDataTime);
		remainSeconds = ChronoUnit.SECONDS.between(startDataTime, endDataTime);
		
		
		System.out.println(remainYear);
		System.out.println(remainMonth);
		System.out.println(remainDay);
		System.out.println(remainHour);
		System.out.println(remainMinutes);
		System.out.println(remainSeconds);
		
		
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDataTime.toLocalDate(), endDataTime.toLocalDate());
		System.out.println("남은 기간"+period.getYears()+"년");
		System.out.println(period.getMonths()+"달");
		System.out.println(period.getDays()+"일");
		
		Duration duration  = Duration.between(startDataTime.toLocalTime(), endDataTime.toLocalTime());
		
		
		System.out.println("남은초 : "+ duration.getSeconds());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
