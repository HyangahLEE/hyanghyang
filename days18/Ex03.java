package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

public class Ex03 {
	
	public static void test(Employee  emp) {
		Temp obj = (Temp)emp;
		System.out.println("테스트");
	}

	public static void main(String[] args) {
		// 실행예외
		// 1. VM -> 예외 객체 -> 제공
		// 2. java.lang.ArrayIndexOutOfBoundsException 클래스
		/*
		int [] m = new int[3]; // 0,1,2
		m[3] = 100;
        */
		
		// p 426
		// NumberFormatExcetion
		/*
		String n = "100";
		int value1 = Integer.parseInt(n);
		
		String m = "10a";
		// java.lang.NumberFormatException:
		// Integer.parseInt() 메소드로 문자열을 숫자(int)로 변환하다가
		// 발생한 오류.
		int value2 = Integer.parseInt(m);
        */		
		
		// p 427 실행오류 :   ClassCastException
		/*
		Employee emp2 = new Temp();   // 업캐스팅(자동)
		
		// 컴파일 오류 : 
		// Type mismatch: cannot convert from Regular to Temp
		// Temp emp3 = (Temp)new Regular();
		
		// 클래스 간의 형 변환
		// 1. 상속 관계.....
		Employee emp  = new Regular(); // 업캐스팅(자동)
		// 실행오류 :  java.lang.ClassCastException
		Temp emp3 =  (Temp) emp;
		// Temp , Regular  상속관계 X
		
		test(new SalesMan());
		test(new Temp());
		*/
		
		// p 429 예외 처리 코드 ? 프로그램에서 예외가 발생할 때 
		//                              바로 종료하는 것을 막고 정상 실행되도록 하는 코드
		//   ㄱ.개발자의 경험으로 코딩...
		//   ㄴ. try ~ catch ~ finally 블록을 이용한다. 
		//   ㄷ. 생성자, 메소드 내부에서 작성된다.
	}

}
