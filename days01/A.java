package days01;

public class A {    //상속클래스 확인.day16 ex01 4,5
	
	
	// 부모클래스의 인자가 있는 생성자를 명시적으로 선언.
	public A(int pub) {
		this.pub = pub;
		System.out.println(" > A  1 생성자 호출됨.");
	}
	//디폴트 생성자도 명시적으로 선언해 주어야 한다.
	public A() {
		System.out.println(" > A 디폴트 생성자 호출됨.");
	}
	//fields
	private int pri;
	protected int pro;
	int def;
	public int pub;
	
	

}
