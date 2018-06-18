package days17;

import java.util.ArrayList;
/*
class 클래스명 
    extends 부모클래스
    implements 인터페이스 A, B, C{
	@Override
	추상메소드 ,  A, B,C
}
*/

//p 357 인터페이스 사용. 
class MyClass{
	
	// 필드
	// 1. 인터페이스      객체 = new 구현클래스;
	RemoteControl rc = new Television();
	
	// 생성자
	// 2. 파라미터값으로 
	MyClass(RemoteControl rc){
		this.rc = rc;
	}
	
	// 메소드
	void methodA() {
		// 3. 지역변수
		RemoteControl rc  = new Audio();
		//
	}
	
	// 4. 메소드의 파라미터..
	void methodB(RemoteControl rc) {
		
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		// p 356 다중 인터페이스 구현 클래스 
		// ArrayList  list ;
		// p 357 인터페이스 사용. 
		
	}

}
