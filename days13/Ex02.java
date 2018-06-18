package days13;

import java.util.Calendar;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		/*
		Date now = new Date();
		System.out.println(now.getYear() + 1900);
		
		// Cannot instantiate the type Calendar
		// 인스턴스화 할 수 없는 클래스
		// Calendar  cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(1));
		System.out.println(cal.get(Calendar.YEAR));
		*/
		
		
		/*
		int age=20;
		//The local variable age may not have been initialized
		System.out.println(age);
		*/
		
		//int [] m = null;
		/*
		int [] m = new int[5];
		m[0] = 100;
		System.out.println(m[0]);
		*/
		
		// java.lang.NullPointerException 객체사용 가장 많이 보는 에러.		
		// Car 자료형으로 myCar 객체 선언
		
		// Car myCar = null;
		// 객체 생성하는 코딩 : new 클래스명();
		Car myCar = new Car();
		// 멤버(필드, 메서드)를 사용하기위해서는 .(도트)연산자.
		// 객체명.필드명 또는 객체명.메서드명()
		
		// The local variable myCar may not have been initialized
		myCar.name = "K9";
		System.out.println(myCar.name);

	}

}