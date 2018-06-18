package days15;


public class Ex03 {
	// 인스턴스 필드 , 스태틱 필드
	int age =0;
	//static String msg ;
	
	// The blank final field msg may not have been initialized
	public final String msg = "홍길동";  // 상수 필드
	
	// final 상수 필드 
	public final double PI = 3.141592;
	
	public Ex03() {
		 // PI = 3.14;
	}

	public static void main(String[] args) {
		// 지역변수 상수
		//final double pi;
		// 초기화 한 번 만 
		//pi = 3.14;
		
		// pi = 3.141592; // 
		
		
		
		
		// p 245
		// final 필드 == 최종적인 필드
		Ex03 obj = new Ex03();
		
		// The final field Ex03.msg cannot be assigned
		//obj.msg = "김길동";
		
		/*
	    Ex03.msg ="홍길동";
	    Ex03.msg ="김길동";
	    */
		/*
		Ex03 obj = new Ex03();
		obj.msg = "홍길동";
		obj.msg = "김길동";
		*/
		

	}

}
