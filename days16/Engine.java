package days16;

// 엔진 클래스 
public class Engine {
	// field
	public int speed;
	// default constructor
	public Engine() {
		this.speed = 0;
	}
	// method
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.03;
	}
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.03;
	}
	public void stop() {
		this.speed = 0;
	}
}
