package days16;

public class H_Engine extends Engine{

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
	} 

}
