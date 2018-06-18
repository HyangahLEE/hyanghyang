package days17;

import java.awt.event.WindowEvent;

class Parent{
	public String name;
	public Parent(String name) {
		this.name = name;
	}
	// 추가
	//public Parent() { }
}

class Child extends Parent{
	private int studentNo;
	// Implicit super constructor Parent() is undefined. 
	// Must explicitly invoke another constructor

	public Child(String name, int studentNo) {
		super(name);
		//this.name = name;
		this.studentNo = studentNo;
	}



}
/*
interface WindowListener{
	// 추상메서드
	void windowActivated(WindowEvent e) ;
	void windowClosed(WindowEvent e) ;
	void windowClosing(WindowEvent e);
	void windowDeactivated(WindowEvent e) ;
	void windowDeiconified(WindowEvent e) ;
	void windowIconified(WindowEvent e) ;
	void windowOpened(WindowEvent e)  ;
}

class WindowAdapter implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowClosing(WindowEvent e) { }

	@Override
	public void windowDeactivated(WindowEvent e) { 	}

	@Override
	public void windowDeiconified(WindowEvent e) { }

	@Override
	public void windowIconified(WindowEvent e) { }

	@Override
	public void windowOpened(WindowEvent e) { }
	
}
*/
public class Ex01 {

	public static void main(String[] args) {

		//Child c = new Child("홍길동",20);

		// p 288
		new MyForm02();
		// 1. 상속 개념
		// 2. 클래스 상속  extends 부모클래스, 부모클래스 ...
		// 3. 자바는 다중 상속 X
		// 4. 부모 생성자 호출 ( 상속 관계 )
		//     생성자가 호출되는 순서 기억
		//     Parent -> Child
		//     Child child = new Child();
		//     부모 객체 먼저 생성  후 자식 객체 생성
		//     부모 생성자 호출          자식 생성자 호출
		//     ** 부모  기본생성자 코딩 + 오버로딩
		// 5. super  키워드 :  부모의 멤버   super.메서드() 또는 super.필드
		//                          super()   super(1,2)
		// 6. p 295 메소드 재정의 ( 오버라이딩 Overriding )
		//    ㄱ. 자바는  부모클래스의 모든 일반 메서드를 
		//         자식클래스에서 오버라이딩 할 수 있다.
		//    ㄴ. @Override 어노테이션
		//    ㄷ. 접근지정자는 같거나 더 넓어야 된다. 
		//         protected     ->  pretected , public
		//    ㄹ. 리턴자료형, 함수명, 매개변수.. throws excetion 동일하게..

		// 7. p 298 부모 메서드 호출 ( super )
		// 8. p 300 final  키워드 : 클래스 앞, 메서드 앞, 필드 앞
		//    ㄱ. 상속할 수 없는 final 클래스
		//    ㄴ. 오버라이딩할 수 없는 final 메소드

		// 9. p 305 클래스 간의  타입 변환 + 다형성
		//     Parent p =  new Child();  // UpCasting 자동 형변환
		//     p instanceOf Child     true/false  // 타입 확인
		//     Child c = (Child) p;         //   DownCasting 강제 형 변환
		//                                             cast 연산자    (타입)

		// 10. p 311 필드의 다형성
		// class NewModelCar{
		//    [ has-a ], is-a 관계
		//    // Engine engine = new H_Engine();
		//    getter, setter   DI
		//    constructor      DI
		//}

		// 자동차를 조립하는 곳에서  결합성 / DI
		// Engine engine = new H_Engine();
		// Engine engine = new S_Engine();

		// 11. p 318 하나의 배열로 객체 관리 X

		// 12. p 321 매개변수의 다형성
		//  typeDisp()

		// ( 기억 )  Child child = (Child)new Parent();

	}

}





