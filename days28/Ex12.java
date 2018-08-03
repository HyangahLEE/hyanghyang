package days28;

import java.util.Random;    //암기..

class SharedBuffer{
	private boolean isNew = false; // 새로 채워졌는지 여부 ..
	private int [] buffer;
	public SharedBuffer() {
		this.buffer = new int[10];
	}
	public SharedBuffer(int size) {
		this.buffer = new int[size];
	}

	// 소비자 호출할 메소드
	public synchronized void getBuffer()  //개념.
			throws InterruptedException {
		// buffer 채워진 배열의 데이타를 출력...
		if( isNew ) {  //채워져있다면 소비.
			System.out.print("> 소비자 : ");
			for (int i = 0; i < buffer.length; i++) {
				System.out.printf("[%3d]", buffer[i]);
				Thread.sleep(300);
			}
			System.out.println();
			isNew = false;  //소비한데이터. 플래그변수
			this.notifyAll();  //알려주고
		} 

		this.wait(); //일시정지
	}
	// 생상자 호출할 메소드
	public synchronized void setBuffer() 
			throws InterruptedException {
		// buffer 랜덤한 정수로 채워넣는 메소드
		Random rnd = new Random();
		if( !isNew ) {  //소비를햇냐?
			for (int i = 0; i < buffer.length; i++) {
				this.buffer[i] = rnd.nextInt(100);
			}
			//
			System.out.print("> 생산자 : "); 
			for (int i = 0; i < buffer.length; i++) {
				System.out.printf("[%3d]", buffer[i]);
				Thread.sleep(100);
			}
			System.out.println();
			//
			this.isNew = true; //채워넣음
			this.notify(); //소비자에게 알려줌
		} 

		this.wait(); 
	}
} 

// 종료... Customer, Producer  안전하게 스레드 종료....
class Customer extends Thread{
	public Customer(ThreadGroup group, String name) {
		super(group, name);
	}
	@Override
	public void run() {
		try {
			while(true) { 
				Ex12.buffer.getBuffer();  
			}
		} catch (InterruptedException e) { 
			//e.printStackTrace();
		}
	}
}

class Producer extends Thread{
	public Producer(ThreadGroup group, String name) {
		super(group, name);
	}
	@Override
	public void run() {
		try {
			while(true) { 
				Ex12.buffer.setBuffer(); 
			}
		} catch (InterruptedException e) { 
			//e.printStackTrace();
		}
	}
}


public class Ex12 {

	// 공유 자원
	public static SharedBuffer buffer = new SharedBuffer();

	public static void main(String[] args) {
		// 공유자원 [][][][][][][][][][]
		// 생산자T  10 개               notify()   / wait()
		// 소비자T  10 사용(출력)    notify()  /  wait() 
		ThreadGroup pcGroup = new ThreadGroup("pcGroup");  //스레드그룹만들기

		System.out.println("> 생산자 = 소비자 시작  <");
		Customer c = new Customer(pcGroup, "customer");
		c.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		Producer p = new Producer(pcGroup, "producer");
		p.start();

		try {
			Thread.sleep(10000);  //10초후에 생성..생성/소비 
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		pcGroup.interrupt();  //그룹안전하게 종료..

		System.out.println("\n 스레드 그룹 종료....");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		System.out.println("> p : " +  p.getState() );  //상태확인
		System.out.println("> c : " +  c.getState() );

	}

}
