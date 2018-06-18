package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//2
		String data= "1995-02-11";
		
		String pattern="yyyy/mm/dd";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);
		LocalDate c_date =LocalDate.parse(data,formatter);
		System.out.println(c_date );
		

		
		
		
		
		
		//1
		/*	String data= "1995-02-11";
			System.out.println(LocalDate.parse(data));*/
	}

}
