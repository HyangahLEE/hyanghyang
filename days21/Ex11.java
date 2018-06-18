package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime now = LocalDateTime.now();
		
		
		String pattern="yyyy년 MM월 dd일 a hh시 mm분";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);		
		System.out.println(now.format(formatter));
	}

}
