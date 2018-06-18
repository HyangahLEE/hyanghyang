package days01;

public class A {

	private int pri;
	protected int pro;
	int def;
	public int pub;
	
	public A() {
		System.out.println("> A 디폴트 생성자 호출됨");
	}

	public A(int pub) {
	this.pub= pub;
	
	}
}
