package days16;

abstract class Animal{  // 동물
	// 몸체가 구현이 안된 불완전한 메서드 : 추상메서드 
	public abstract void sound() ;
}

// 실체클래스 
class Dog extends Animal{

	@Override
	public void sound() {
		 System.out.println(" 멍멍~");
	}  
	
}

class Cat extends Animal{  // 고양이
	@Override
	public void sound() {
		System.out.println(" 야옹야옹~");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		  //Dog  dog1  = new Dog();
		  //Cat  cat1 = new Cat();
		  
		  //dog1.짖어라();
		  //cat1.짖어라();
		
		// 업캐스팅( 자동 형변환 )
		Animal   a  = new Dog();
		Animal   b  =  new Cat();
		
		a.sound();
		b.sound();
	}

}

