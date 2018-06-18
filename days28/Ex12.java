package days28;

class SharedBuffer{
	private int[] buffer;

	public SharedBuffer() {
		this.buffer = new int[10];
	}

	public SharedBuffer(int size) {
		this.buffer = new int[size];
	}

	public void getBuffer() {

	}

	public void setBuffer(int[] buffer) {
		this.buffer = buffer;
	}


}


class Customer extends Thread{

	@Override
	public void run() {
		while (true) {

		}
	}




}

class Producer extends Thread{

	@Override
	public void run() {
		while (true) {

		}
	}




}

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
