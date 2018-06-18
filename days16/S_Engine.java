package days16;

public class S_Engine extends Engine{

	@Override
	public void lessFuel(int fuel) { 
		this.speed -= fuel * 0.01;
	}

}
