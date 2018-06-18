package days16;

public class Ex03 {
	// field
	// final double PI = 3.141592;
	final double PI;
	
	Ex03(){
		PI = 3.141592; 
	}
	
	// 메소드의 파라미터 선언 시 final 키워드
	// final int a = 100;
	public void disp(final int a) {
		// a  = 200;
	}

	public static void main(String[] args) {
		// p 300
		// 1. final  지역 변수 또는 필드         상수
		// final double PI = 3.141592;
		Ex03 obj = new Ex03();
		obj.disp(100);
		
		// 2. final  메서드
		
		// 3. final  클래스 

	}

}
