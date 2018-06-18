package days15;

class Person{
	
	String name = null;
	int age = 0;
	static double rate = 0.04; // 정적필드는 일반적으로 선언할 때 초기화. 
	
	// 계산을 한 후에 rate  초기화 작업 -> 객체 생성 할 때 호출되는 생성자 X
	// static 블록
	static {
		rate = 0.07; // 
		System.out.println("> static 초기화 블륵 호출됨. ");
	}
	
	{  //  초기화 블륵
		name = "AAA";
		age = 5;
		System.out.println("> 초기화 블륵 호출됨. ");
	}
 
	Person(){
		name = "홍길동";
		age = 10;
		System.out.println("> 디폴트 생성자 호출됨. ");
	}
	public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	 
	
}


/*
class Korean{
	// fields
	String nation = "대한민국"; // 명시적 초기화 
	String name = null;
	String ssn = null;
	//
	Korean(){
		name = "";
	}
	
	int sum(String n, int a) {
		return 1;
	}
	int sum( int a, String n) {
		return 1;
	}

	void sum(String n, int a) {
		return 1;
	}
	
	public Korean(String nation, String name, String ssn) { 
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
	
	public void dispKorean(String message) // 선언부== 메소드 시그너처 
	{  // 메소드 몸체
		
	}
	
	int gas = 10;
	public boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("가스 없다");
			return false;
		}
		//
		//
		
		//
		//
		System.out.println("가스 남다");
		return true;
		
	}
	
}
*/

public class Ex01 {
	  
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println( p.name );
		System.out.println("=END=");
		
		/*
		 * 1. 객체 지향 프로그래밍(OOP)
		 * 2. 객체(Object)==개체
		 *    필드(field)+메소드(method)
		 *    객체 모델링(Object Modeling)
		 * 3. OOP 특징
		 *    ㄱ. 캡슐화 : 접근제한자 ( Access Modifier )
		 *    ㄴ. 상속
		 *    ㄷ. 다형성   
		 * 4. 객체와 클래스 + 인스턴스   
		 * 5. 클래스 선언 
		 *   접 기 class  클래스명 
		 *                 extends Super클래스 implements 인터페이스...{
		 *   }
		 *   public 클래스명  ->   클래스명.java
		 * 
		 *   6. 객체 생성 /  클래스 변수
		 *   new Point();
		 *   Point p;  // 객체 선언
		 *   클래스자료형  p;
		 *   
		 *   
		 *   7. 클래스 변수 == 스태틱변수 == 정적 변수 == 공유 변수
		 *   8. 클래스의 멤버
		 *       생성자 , 필드 , 메서드    
		 *   
		 *       class Point{
		 *          // 필드
		 *          접 기 자료형 필드명[=초기값];
		 *          String name = null;
		 *          int [] m = null;  
		 *       }
		 *       
		 *  9. 필드 사용 ?
		 *     Point p = new Point(); 
		 *      객체명.필드
		 *      p.x
		 *      객체명.메서드
		 *      p.dispInfo()     
		 *  
		 *   10. 생성자
		 *   11. 필드 초기화  
		 *   12. this   
		 *   13. 매개 변수의 수를 모를 경우
		 *       sum    a+b , a+b+c     [][][][][][][][]
		 *       가변 인수  int ... args
		 *   14. 리턴(return) 문   
		 *       return 리턴값;
		 *       void      return ;  //  메서드 실행  종료 0-> 호출
		 *       
		 *   15. 인스턴스 멤버와 this    
		 *   
		 *   class Save{
		 *       // 필드
		 *       String name;     // 인스턴스 필드(변수)
		 *       double money;  //
		 *       static double rate;  // 클래스 변수 , 정적필드 
		 *       
		 *       // static 메소드     정적메서드
		 *       // 인스턴스 메서드 
		 *   }
		 *   
		 *   16. p 239  정적 초기화 블록
		 *   
		 * */ 
	}

}








