package days16;

public class Ex07 {

	public static void main(String[] args) {
		// p 311                               [ 필드의 다형성 ]
		// p 321                               [ 매개변수의 다형성 ]
		// Engine 클래스
		//    H_Engine extends Engine 
		//    S_Engine extends Engine
		
		// NewModelCar 클래스 
		// 클래스명.필드명
		// System.out.println("test");
		
		Engine engine = new H_Engine();
		// 2018년
		NewModelCar car01 = new NewModelCar(
				"K9", 3, "자동", "빨강", engine); // 의존성 주입( DI )
		
		// 2019년
		NewModelCar car02 = new NewModelCar(
				"K9", 3, "자동", "빨강", new S_Engine()); // 의존성 주입( DI )
		
		

	}

}
