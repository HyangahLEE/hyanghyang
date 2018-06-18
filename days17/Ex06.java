package days17;

public class Ex06 {

	public static void main(String[] args) {
		// p 358 추상 메소드 사용.
		// p 360  디폴트 메소드 사용. 
		// p 362  인터페이스 내의 멤버로 선언된  정적 메소드 사용
		// 클래스명.static필드, 클래스명.static메소드
		
		// 인터페이스명.static메소드();
		RemoteControl.changeBattery();
		
		// p 364 자동 형 변환
		RemoteControl rc = new Audio(); // 인터페이스 업캐스팅
		Audio a = (Audio)rc;  // 인터페이스 다운캐스팅
		//                                ()cast연산자 강제형변환

	}

}
