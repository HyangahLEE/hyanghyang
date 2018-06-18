package days14;

public class Ex07 {

	public static void main(String[] args) {
		// p 234
		// 객체 외부에서 인스턴스 멤버에 접근하기 위해 참보 변수를 사용하는 것과
		// 객체 내부에서도 인스턴스 멤버에 접근하기 위해 this 사용한다. 
		Point p1 = new Point(10,20);
		Point p2 = new Point(100,200);

		//
		// p2.offsetPoint(p1) ;
		// p2.dispPoint();
		
		// p2.offsetPoint(p1).dispPoint();
		 
		p2
		   .offsetPoint(p1)
		   .dispPoint();
		 

	}

}
