package days27;

// 공유객체
class Calculator{
	private int memory; // memory = 50

	public int getMemory() {
		return memory;
	}

	//공유자원 써서 동기화 
	public   void setMemory(int memory) {
		// User2  50
		// User1  100
		synchronized (this) {
			this.memory = memory;   // 100
			try {
				Thread.sleep(2000); // 2초 NotRunnable User2/User1
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName()
					+" : " + this.memory);
		}
		
	}
	/*//동기화 메소드 사용(임계영역 만들기)
	public synchronized void setMemory(int memory) {
		// User2  50
		// User1  100
		this.memory = memory;   // 100
		try {
			Thread.sleep(2000); // 2초 NotRunnable User2/User1
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		// User2 : 100
		// User1 : 100
		System.out.println(Thread.currentThread().getName()
				+" : " + this.memory);
	}
	*/  
}

// User1  스레드
class User1 extends Thread{
	// 계산기
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");  // 스레드 이름
		this.calculator = calculator;
	}

	@Override
	public void run() {
		this.calculator.setMemory(100);
	}

}

// User2
class User2 extends Thread{
	// 계산기
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2");  // 스레드이름
		this.calculator = calculator;
	}

	@Override
	public void run() {
		this.calculator.setMemory(50);
	}

}

public class MainTheadExample {
//1개의 계산기로 공유하도록 각각의 스레드에 ㄱㄱ 
	public static void main(String[] args) {
        //   공유자원
 
		//  1개의 계산기 
		Calculator calculator = new Calculator();
		// User2 : 50
		// User1 : 50
		User1 user1 = new User1();
		user1.setCalculator(calculator);		

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		
		user1.start();
		user2.start();
 
/*
		User2 : 50
		User1 : 100
		
		User1 user1 = new User1();
		user1.setCalculator(new Calculator());
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(new Calculator());
		user2.start();
*/ 
	}

}
