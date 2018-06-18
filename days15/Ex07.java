package days15;

class A{
	
	//final static double PI;
	
	A( ){
		// PI = 3.14; XX
	}
	
	static int hap(int i) {
		return 1;
	}
	static int hap(){ 
		return 1;
	}
	// 인스턴스 초기화 블럭
	{
		a = 10;
	}
	// 생성자
	/*A(){
		a = 20;
	}*/
	// static 초기화 블럭
	static {
	}
	
	// 필드
	int a; 
	static int b;
}

//        class 키워드
public class Ex07 {

	public static void main(String[] args) {

		A.hap(10);
		
		// A.class    static  class 필드

	}

}
