package days17;

interface IA{
	void methodA(); // 10
}

interface IB{
	void methodB(); // 15
}

// 인터페이스 상속  : extends 다중상속  인페,인페,...
interface IC extends  IA,IB{
	// void methodA(), void methodB();
	void methodC();
}

// 구현 클래스
class Impl_IC implements IC{

	@Override
	public void methodA() { }
	@Override
	public void methodB() { }
	@Override
	public void methodC() { }
	
}

public class Ex07 {

	public static void main(String[] args) {
		// p 377 인터페이스 상속
		
		// p 379 Example.java - main(){}
		/*
		Impl_IC obj = new Impl_IC();
		obj.methodA();
		obj.methodB();
		obj.methodC();
        */
		/*
		IC obj = new Impl_IC();
		obj.methodA();~ C()
		*/
		
		/*
		IA obj = new Impl_IC();
		obj.methodA();
		*/
		
		IB obj = new Impl_IC();
		obj.methodB();
	}

}
