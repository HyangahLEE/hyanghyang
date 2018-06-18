package days16;

import days01.A;

public class B extends A {
		
	public B() {
		// The constructor A() is undefined
		super(); // super 클래스   
		System.out.println("> B  디폴트 생성자 호출됨.");
	}
	
	public B(int pub) {
		// The constructor A() is undefined
		super(pub); // super 클래스   
		System.out.println("> B  1 생성자 호출됨.");
	}
	
	// methods
	public void dispInfo() {
		//pri;    X 
		//def;   X		
		this.pro = 10;    // O
		this.pub = 20;   // O
	}

}
