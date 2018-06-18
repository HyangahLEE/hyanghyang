package days27;

class Calculator{

	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//공유자원 써서 동기화 
	public void setMemory(int memory) {
		synchronized (this) {

			this.memory= memory;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+": "+ this.memory);
		}
		}
	
	/*	//동기화 메소드 사용(임계영역 만들기)
	 * public synchronized void setMemory(int memory) {

		this.memory= memory;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
	}*/
}


class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(50);
	}


}




public class MainThreadExample {

	public static void main(String[] args) {
		//1개의 계산기로 공유하도록 각각의 스레드에 ㄱㄱ 
		Calculator c =new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(c);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(c);
		user2.start();

	}

}
