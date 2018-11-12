package days18;

import days13.Point;

public class Ex12  {

	public static void main(String[] args) {
		// 1.  암시적(자동) extends Object
		// 2.  모든 클래스의 최상위 클래스 : Object
		// 3. Object 클래스의 멤버들을 자식 클래스가 상속받아져 있다.
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		// == 연산자
		// 1. 기본형 : 값 비교
		// 2. 참조형 : 주소값 비교
	 
		if( p1 == p2 ) System.out.println("같다");
		else               System.out.println("다르다");
 
		
		// equals()
		// 재정의하지 않은 Object 클래스의 equals() 기능	 
		if( p1.equals(p2) ) System.out.println("같다");
		else               System.out.println("다르다");
		
		// String. equals()  오버라이딩.... true/false
      
	}

}
