package days13;

public class Ex06 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;		
		p1.dispPoint();
		
		// 클래스 복사 ( Copy )    
		Point p2 = p1;
		p2.x = 100;
		
		p1.dispPoint();
		
		/*
		Point p2 = new Point();
		p2.x = 10;
		p2.y = 20;
		*/

	}

}
