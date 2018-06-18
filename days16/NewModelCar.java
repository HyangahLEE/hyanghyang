package days16;

public class NewModelCar {
	// field
	public String name;
	public int door;
	public String gearType;
	public String color;
	
	// public Engine engine = new Engine(); // 결합력이 강하다. (일체형)
	// 필드의 다형성
	public Engine engine = null;
	
	/*
	 * 1. 클래스 간의 관계
	 *    ㄱ. has-a 관계
	 *      NewModelCar{
	 *         Engine engine;
	 *      }
	 *    ㄴ. is - a 관계 ( 상속 )
	 *       Employee  사원클래스
	 *       Regular     정규직클래스
	 *       Salesman  영업직클래스
	 *       
	 *       Employee 사원1 = new Regular();  // UpCasting  자동형변환
	 *       정규직은 사원이다. ( O )
	 *       Employee 사원2 = new Salesman();
	 *       영업직은 사원이다. ( O )
	 *              is a  관계
	 * */
	
	// constructor
	public NewModelCar() {
		super(); 
		this.engine = new Engine();
	}
	public NewModelCar(String name, int door
			, String gearType, String color
			, Engine engine) {  // UpCasting 자동 타입(형) 변환
		super();
		this.name = name;
		this.door = door;
		this.gearType = gearType;
		this.color = color;
		this.engine = engine; //
	}
	
	// method
	public void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	public void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	public void stop() {
		this.engine.stop();
	}
}
