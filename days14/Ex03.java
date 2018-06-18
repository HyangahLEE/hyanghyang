package days14;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		//Points p = new Points();
		//Points p = new Points(10);
		
		// 
		// Point       p1 = new Point;
		//ArrayList list = new ArrayList(10); 
		
		
		//private int x, y;
		Point p1 = new Point(10,20);
		// The field Point.x [is not visible] 접근지정자..
		//p1.x = 10; 초기화 X
		//p1.y = 20; 초기화 X
		
		// p1.x 의 값을 임의의 값으로 변경
		// get~()  set~() 메서드 선언
		// private p1.x = 100;
		p1.setX(100);
	   System.out.println( p1.getX() );
		//p1.dispPoint();
		
		int data = 200;
	//	p1.setKor(data);
		
		//if( data >= 0 && data <= 100) 	p1.kor = data;
		

	}

}
