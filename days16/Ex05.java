package days16;

class Employee{ // 사원클래스
	private String name; // 사원명
	public Employee() {}
	public Employee(String name) {
		this.name = name;
	}
	public void aaa() {
		System.out.println("> Employee.aaa() 메소드 호출");
	}
}
class Regular extends Employee{ // 정규직 클래스
	public Regular() {}
	public Regular(String name, int age) {
		super(name);
		 //this.name = name;
		 this.age = age;
	}
	
	public void reg_disp() {
		System.out.println("> reg_disp 메소드 호출됨.");
	}

	// name
	int age; // 나이
	
	@Override
	public void aaa() {
		System.out.println("> Regular.aaa() 메소드 재정의 호출");
	}
}
class SalesMan extends Regular{ // 영업직 클래스
	// name
	// age
	String addr; // 주소
}


public class Ex05 {

	public static void main(String[] args) {
		// p 305 타입 변환과 다형성.
		// 1. 다형성 정의 ? 같은 타입이지만 실행결과가 다양한 객체를 
		//                      이용할 수 있는 성질.
		
		//Regular 사원1 = new Regular("이석화",27);
		//사원1.reg_disp();
		
		//  상속 관계  E  , R
		//  자식클래스의 객체를 생성해서 부모클래스에 참조 시키는 것
		//  업캐스팅( upcasting ) - 자동 타입 변환
		// ***  업캐스팅한 후에는 부모의 멤버만 접근 가능하다.
		Employee 사원1 = new Regular("이석화",27);
		사원1.aaa();
		
		//사원1.reg_disp(); X
		
		System.out.println("=END=");

	}

}
