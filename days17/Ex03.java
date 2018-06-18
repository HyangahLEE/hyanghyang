package days17;

interface ITest{
	double PI = 3.1415;
	
	void dispa();
	void dispb();
	void dispc();
}

abstract class AAA
 implements ITest{
	//
	int age;
	String name;
	@Override
	public void dispa() {
		System.out.println("> dispa() 오버라이딩.");	
	} 
	
}

abstract class BBB
extends AAA{
	String addr;

	@Override
	public void dispb() { 
		System.out.println("> dispb 오버라이딩.");
	} 
	
}

class CCC
   extends BBB{

	@Override
	public void dispc() {
		 System.out.println("> dispc 오버라이딩.");
	} 
}

public class Ex03 {

	public static void main(String[] args) {
		// Cannot instantiate the type BBB
		// BBB obj = new BBB();
		
		 // CCC obj = new CCC();
		 
		// 추상클래스 BBB 업캐스팅
		// 인터페이스 ITest 업캐스팅 -> 매, 필  다형성...
		ITest obj = new CCC();
		
		 System.out.println("=END=");

	}

}
