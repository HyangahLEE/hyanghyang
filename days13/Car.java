package days13;//접근지정자
// 하나의 자바파일안에 여러개의 클래스를 선언할 수 있다. 
// 파일이름과 동일한 이름의 클래스 선언에만 public가능
//하나의 파일에 여러개 클래스 선언했다 하더라고 클래스 선언한 개수만큼 클래스 파일만들어짐

public class Car {//기타제어자
	//속성(특징) = 멤버변수
	//구성요소(멤버) ==필드(field)
	// 기능(동장) 멤버함수
	
	String name;
	int speed;
	int wheelCount;
	
	void go() {
		
		System.out.println("gogo");
	}
	
	void stop() {
		System.out.println("");
		
	}
	
}


class Tire{
	
	
}