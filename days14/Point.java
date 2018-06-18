package days14;

//public final class Point
public class Point {
	// fields
	private int x = 0;
	private int y ;
	
	//private int kor;  // getter , setter
	
	
	// Alt + Shift + S
	public void setX(int i) {
		x = i;
	}

	public int getX() {
		return x;
	}
	
	/*
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if( kor >=0 && kor <=100)		this.kor = kor;
		else System.out.println("> 국어 점수 범위 벗어남(0~100)");
	}
    */
	
	
	
	// constructors 생성자 [함수]
	public Point() { // default constructor
		System.out.println("> Point default constructor 호출됨.");
		x = y =  10;  // 필드 10 초기화
	}
	public Point(int i) {
		x = y = i;
	}
	/*
	public Point(int i, int j) {
		x = i;
		y = j;
	}
	*/
	
	// Alt + Shift + S
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// methods
	public void dispPoint() {
		//System.out.println("> x,y좌표를 출력하는 메서드 ");
		
		System.out.printf("> x=%d, y=%d\n"
				, this.x, this.y);
	}
	
	//              p2.offsetPoint(p1)
	public final Point offsetPoint(Point p) {
		// this.x  ㄱ. 클래스 자기자신의 멤버를 가리킬때의 this.
		this.x += p.x; // p2.x += p1.x    p2.x = 110
		this.y += p.y; // p2.y += p1.y    p2.y = 220
		
		return this;  // ㄷ. 단독으로 사용될 때의 this ( 리턴값)
	}
	
}
