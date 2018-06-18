package days13;

public class Ex03 {

	public static void main(String[] args) {
		
		// 지역변수
		// public final int age = 10; X
		
		// int x1,y1,x2,y2,... x5,y5;
		
		// (1,4) (2,8) (3,3) (4,6) (10,1)
		
		// int [] p = new int[10];
		
		// int [] x = new int[5]; // { 1,2,3,4,10 };
		// int [] y =  new int[5];{ 4,8,3,6,1};
		
		// x[0], y[0]
		/*
		int [][] ps = {
				              {1,4},   // 한 행이 한 좌표점(x,y)
				              {2,8}, 
				              {3,3}, 
				              {4,6}, 
				              {10,1}
		                 };
		*/
		// ps[0][0]   ps[0][1]
		
		// [ 멤버(필드,메서드) 앞에 접근지정자 의미 ] 시험
		// 1) public      : 패키지 내,외부 어디서든 참조 가능함.
		// 2) protected : 패키지 내부에서만 참조 가능함. + [상속]서브(Sub)클래스에서 참조 가능함
		// 3)     X         : 패키지 내부에서만 참조 가능함.
		// 4) private     : 클래스 내부에서만 참조 가능함.
		
		// 필드 선언 형식
		// [접근지정자]  [기타제어자] 자료형 필드명 [= 초기값];
		// 필드에 사용되는 기타제어자
		//      final / static  / tansient (직렬화) / volatile(스레드)
		
		// 메서드 선언 형식
		// [접근지정자] [기타제어자]  리턴자료형  메서드명( [매개변수...]){}
		// public        static          int          sum   ( int a, int b) {
		//   return a+b;
	    //}
		//                 abstract/final/synchronized(동기화처리)/..
		
		
		//   public   >   protected  >    package(default)  > private
		Point p1 = new Point();
		// 객체명.필드명 또는 객체명.메서드명()       . 도트연산자
		p1.x = 100;
		// p1.y   private 필드 참조 못한다.
	//	p1.def = 200;
	//p1.pro =300;
		
		// The method dispPoint() from the type Point is not visible 접근지정자
		p1.dispPoint();
		 
		
		

	}

}
