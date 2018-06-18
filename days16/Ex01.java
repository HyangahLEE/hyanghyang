package days16;

/**
 * @author   	kenik
 * @date      	2018. 5. 23.-오전 7:41:49
 * @subject 	 
 */
public class Ex01 {
	 
	public static void main(String[] args) {
		// p 288  상속( inheritance )
		// 1. 부모가 자식에게 물려주는 행위.
		// 2. 부모 : 부모클래스, 상위클래스, [Super]클래스
		//     자식 : 자식클래스, 하위클래스, [Sub   ]클래스, 파생클래스
		// 3. 상속은 이미 잘 개발된 클래스를 재사용해서
		//     새로운 클래스를 만들기 때문에 코드의 [중복을 줄여준다].
		//     클래스 수정 최소화 
		//     -> 생산성 향상 -> 
		// 4. private 멤버는 상속 대상에서 제외된다.
		// 5. 부모클래스와 자식클래스가 다른 패키지에 존재한다면
		//     default 접근 제한을 갖는 필드와 메서드도 상속 대상에서 제외된다.
		// 6. 다른 언어와는 달리 자바는 다중 상속을 허용하지 않는다.
		// 7. 부모 생성자 호출 *
		//    예)  days01.A
		//          days16.B extends A
		//   자바에서도 자식 객체(B)를 생성하면, 부모 객체(A)가 먼저
		//   생성되고 자식 객체가 그 다음에 생성된다. 
		// B() -> A() 기본생성자   명시적으로 선언
		//           A(int, int) 생성자 중복 선언
		// 8. p 295 메서드 재정의 ( Overriding ) 
		//                      오버라이딩/오버라이드
		// 9. 메소드를 오버라이딩할 때 규칙 (주의) p 296
		// 10. p 298 부모 메서드를 호출할 때  : super 키워드
		
	    
	}

}











