package days14;

// 여러 개의 Point객체를 관리하는 클래스 Points 선언 
public class Points {
	// filed(필드)
	// 클래스 배열 points 선언
	public Point [] points;
	
	// constructor
	public Points() {
		points = new Point[10];
	}
	public Points(int n) {
		points = new Point[n];
	}

}
