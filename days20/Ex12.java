package days20;

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Ex12 {

	public static void main(String[] args) {
		// p 545  날짜를 원하는 출력형식으로 변환 클래스 ...
		//           SimpleDateFormat
		Date now = new Date();
		// 2000년 5월 1일 (월)  14:29:5 
		//String pattern = "yyyy년 MM월 dd일 (E) a hh:mm:ss.SSS";
		String pattern = "yyyy년 MM월 dd일 (E) a HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern );
		String data = sdf.format(now);
		System.out.println(data);
		
		
		
		
		

	}

}
