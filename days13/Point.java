package days13;

// 좌표점을 관리하는 기능(메서드),속성(필드) 구현된 클래스
public class Point {
	// fields
	public int x = 0;       	// public 
	public int y;     	// private
	
	//int def;                	// default  package  X
	//protected int pro; // protected
	
	public Point() {}
	
	public Point(int i, int j) {
		this.x= i;
		this.y=j;
		
	}
	
	
	@Override
	public int hashCode() {
		return this.x;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
*/	
	
		// methods
	// p1.dispPoint();
		public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	// 좌표 이동하는 메서드
	public void movePoint(int a, int b) {
 		x += a; // x = x + a;
 		y += b; 
	}
	// 매개변수 자료형  Point
	// 리턴자료형         Point
	
	//             p1.movePoint(p2);
	//              Point p = p2
	public Point movePoint(Point p) {
 		x += p.x;   // p1.x = 11
 		y += p.y;   // p1.y = 22
 		return p;
	}
}
