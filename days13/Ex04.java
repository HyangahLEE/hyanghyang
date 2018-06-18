package days13;

public class Ex04 {

	public static void main(String[] args) {
		//Point p = new Point();
		//int [] m = new int[5];
		
		// 클래스 배열 선언
		Point [] points = new Point[5];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(); // XXX
			points[i].dispPoint();
		}
		/*
		points[0] = new Point();
		points[0].x = 100;
		
		points[1] = new Point();
		points[2] = new Point();
		points[3] = new Point();
		points[4] = new Point();
		*/
		// java.lang.NullPointerException
		//points[0].x = 100;
		
		 
		
		 
		/*
		Point p1 = new Point();
		p1.x = 1; p1.y=2;
		Point p2 = new Point();
		p2.x = 3; p2.y=4;
		//:
		Point p5 = new Point();
		p5.x = 9; p5.y=10;
		p1.dispPoint();
		p2.dispPoint();
		p5.dispPoint();
		*/
		

	}

}
