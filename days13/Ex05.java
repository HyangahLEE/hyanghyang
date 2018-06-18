package days13;

public class Ex05 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		//p1.dispPoint();  // > x=10, y=20
		//p1.movePoint(100, -100);
		//p1.dispPoint();
		
		Point p2 = new Point();
		p2.x = 1;
		p2.y = 2;
		
		Point p3=p1.movePoint(p2);
		
		p1.dispPoint();
	    p2.dispPoint();
     	p3.dispPoint(); // 1, 2

	}

}
 