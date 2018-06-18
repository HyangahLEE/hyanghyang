package days16;

public class Ex08 {

	public static void main(String[] args) {
		// 2. p 324 클래스 간의 강제 형 변환 ? DownCasting
		//   ㄱ.  부모타입을 자식타입으로 변환하는 것.
		//   ㄴ.  형식  ( 변환하고자 하는 타입 ) cast연산자 
		//     자식클래스   변수 = (자식클래스타입)부모클래스타입; 
		
		// java.lang.ClassCastException: 
		// days16.Employee cannot be cast to days16.Regular
		//Regular emp =(Regular) new Employee();
		
		// 원래 Regular 객체를 UpCasting 한 후
		// 다시 Regular 객체로 DownCasting 할 수 있다. 
		Employee emp = new Regular(); // UpCasting
		Regular reg = (Regular) emp;      // DownCasting
		
		
		// 1. 클래스 간의 자동 형 변환 ? UpCasting
		// 자식클래스 객체 생성 후에 부모 클래스에 참조시키는 것. 
		// 예) Employee emp = new Regular();
		
		System.out.println("= END =");

	}

}
