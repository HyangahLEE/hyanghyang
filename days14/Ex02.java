package days14;

public class Ex02 {

	public static void main(String[] args) {
		// p 197
		// 클래스의 멤버 = 필드 + 메서드 + 생성자( Constructor )
		// [ 생성자 ] (암기)
		// 1. 객체 생성될 때                       [자동]으로 호출되는 함수
		//     new 연산자에 의해 호출되는 특벼한 중괄호{} 블럭이다. 
		//     new Point()
		// 2. 생성자명 == 클래스명
		// 3. 리턴자료형을 사용하지 않는다. 
		// 4. 매개변수가 없는 생성자를 Default Constructor 라고 한다.
		// 5. 중복함수(오버로딩 Overloading) == 하나 이상 가질 수 있다.
		// 6. 왜 ?  객체 생성할 때 자동으로 호출되는 생성자가 필요 ? 역할? 
		//     생성되는 객체의 필드를 초기화 역할...
		// 7. 생성자 상속되지 않는다.
		
		Point p1 = new Point(); // () 디폴트 생성자 호출
		p1.dispPoint();
		
		// The constructor Point(int) is undefined
		Point p2 = new Point(100);
		p2.dispPoint();
		
		// The constructor Point(int, int) is undefined
		Point p3 = new Point(100,200);
		p3.dispPoint();
		
		/*
		new Point();
		new Point();
		new Point();
        */
	}

}





