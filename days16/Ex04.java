package days16;

import days13.Point;

public class Ex04 {

	public static void main(String[] args) {
		// 오버라이딩.
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		//p1.dispPoint();
 		System.out.println( p1.toString() );
 		System.out.println( p1 ); // 객체명==객체명.toString()
		p2.dispPoint();
		
		//if( p1 == p2 ) System.out.println(" 같다");
		//else               System.out.println("다르다"); //
		
		// p1.x p2.x  p1.y  p2.y 같다
		
		
		
		// p 305 타입 변환과 다형성
		

	}

}
