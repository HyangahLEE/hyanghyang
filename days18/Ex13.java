package days18;

import days13.Point;

public class Ex13 {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(1,2);
		
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		Point p4 = p3;
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
	}

}
