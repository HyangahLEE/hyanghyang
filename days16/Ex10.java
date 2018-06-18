package days16;

// 추상클래스 
abstract class Phone{
	// 필드
	public String owner;
	// 생성자
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	// 메서드
	public void turnOn() {
		System.out.println(" 폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println(" 폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone{
	// 생성자
	public SmartPhone(String owner) {
		super(owner); //  추상클래스의 생성자가 호출된다.
	}
	// 메서드
	public void internetSearch() {
		System.out.println(" 인터넷 검색을 합니다. ");
	}
}

public class Ex10 {

	public static void main(String[] args) {
		// p 329 추상 클래스
		// 1. 개념 ? 추상(abstract)은 실체 간에 공통되는 특성(수성)을 추출한 것.
		// 예) 학생 -> 실체 : 유치원, 초등학생, 중,고, 대학생, 대학원 등등
		// 2. 실체 클래스 ? 객체를 직접 생성할 수 있는 클래스
		//     추상 클래스 ? 공통적인 속성을 추출해서 선언한 클래스
		// 3. 추상클래스 선언 -> 상속 -> 실체 클래스 선언
		// 4. 추상클래스는 객체를 생성할 수 없는 클래스이다. 
		//                     new 연산자 객체 생성 X
		// 5. 추상클래스는 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용된다.
		
		// 6. 바로 실체 클래스를 선언-> 사용  p 330
		//    왜 ? 추상 클래스를 사용?
		
		// 7. 추상클래스 선언 
		// Cannot instantiate the type Phone
		// Phone phone = new Phone();

	}

}
