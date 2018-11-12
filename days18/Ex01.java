package days18;

import days17.IEmployee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

interface Test{
	void dispa();  // 추상메소드
	void dispb();  // 추상메소드
}

abstract class ImplTest implements Test{

	// 실체메소드
	@Override
	public void dispa() {}

}

public class Ex01 {
	
	// 필드 다형성
	IEmployee emp; // 정, 영, 임  모두 	
	
	// IEmployee , Employee
	// Regular, SalesMan, Temp
	// 파라미터 다형성
	void 사원정보출력(IEmployee emp) {
		
	}

	public static void main(String[] args) {
		// 인터페이스 배열
		IEmployee [] emps = { 
				         new Regular(), 
				         new SalesMan(), 
				         new Temp() };
		
		
		  
		 // 1-2. 구현클래스, 인터페이스, 추상메소드, 실체메소드,  추상클래스
		 // 1-4. 인터페이스에 업캐스팅
		 Test obj = new ImplTest() { 
			@Override
			public void dispb() { 
			}
		};
		
		// 클래스 간의 형(타입) 변환
		// 1. 상속 관계
		// 2. 업캐스팅 - 자동 형변환
		//     다운캐스팅 - 강제 형변환     cast연산자
		IEmployee emp = new Regular(); // UpCasting 자동 형 변환
		  
	}

}





