package days19;

import days16.NewModelCar;

public class Ex07 {

	public static void main(String[] args) {
		// p 489 Class 클래스
		// 자바는 클래스와 인터페이스의 [메타 데이터]를  Class 라는
		// 이름의 클래스로 관리한다.
		// [메타 데이터] ? * 클래스이름, 생성자 정보, 필드 정보, 메소드 정보.
		// Class 객체 얻어오는 방법 : getClass(), forName()
		
		// [ 동적 객체 생성 ]
		// 1. 클래스명으로 부터 Class 객체 얻어오는 방법.
		// className 매개변수 : 패키지.패키지.클래스명
		// Class clz = Class.forName(className)
		// clz.newInstance();
		
		// 2. 객체로부터 Class 객체를 얻어올 때 : 객체명.getClass() 
		NewModelCar car  = new NewModelCar();
		Class clz = car.getClass();
		
		// days16.NewModelCar
		System.out.println( clz.getName() );
		
		// System.out.println( clz.getModifiers() );  // 1
		
		// days16
		System.out.println( clz.getPackage().getName() );
		
		// p 491 *** 리플렉션( reflection : 반사, 상 ) ***
		// Class 객체를 이용하면 생성자, 필드, 메서드 정보를 알아 낼 수 있다.
		// 이것을 "리플렉션" 한다. 
		
		
		
		

	}

}
