package days14;

class Member{
	// field
	String name;
	String addr;
	int age;
	int [] buffer ;  //  = new int[10];
	
	Member(){
		//this("AAA","서울",23);
		buffer = new int[100]; // 50개 필드 초기화 ...
		System.out.println("> Member 디폴트 생성자 호출됨.");
	}
	
	Member(String name, String ad, int ag){ 
		this(); // 매개변수 없는 디폴트 생성자를 호출하는 코딩.
		
		// The assignment to variable name has no effect
		this.name = name;
		addr = ad;
		age = ag;
		System.out.println("> Member 3 생성자 호출됨.");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// p 233 인스턴스 멤버와 this  ( 시험 )
		// 인스턴스 멤버 = 인스턴스 필드 + 인스턴스 메서드
		// > 인스턴스 필드   ?  객체가 생성된 후 (== 인스턴스 ) 사용할 수 있는 필드
		// > 인스턴스 메서드 ?                  "                                       메서드
		
		// [ this ] ( 시험 )
		// 1. 정의? 객체가 생성된 후 클래스 자기 자신의 주소값을 갖는  참조변수
		// 2. this의 용도 3가지
		//   ㄱ. 클래스 자기 자신의 멤버를 가리킬 때 this
		//   ㄴ. 생성자에서 또 다른 생성자를 호출할 때의  this
		//   ㄷ. 단독(홀로) 으로 사용될 때의 this : 매개변수값, 리턴값
		Member m1 = new Member("홍길동", "강남구" , 20);
		m1.buffer[0] = 20;
		System.out.println(m1.buffer[0]);
		/*
		System.out.printf("> %s - %s - %d\n"
				, m1.name
				, m1.addr
				, m1.age);
        */
	}

}
