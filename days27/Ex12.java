package days27;

class PrintThread1 extends Thread{
	// 모든 스레드 종료 플래그 선언
	public static boolean all_stop = false;
	
	private boolean stop = false; // 해당 스레드 1만 종료 플래그
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		while(!stop && !all_stop) {
			System.out.println("실행 중~");
		}
		
		System.out.println("자원(파일,네트워크) 정리 코딩");
		System.out.println("실행 종료");
	}


	
	
}

public class Ex12 {

	public static void main(String[] args) {
		// p 613 스레드의 안전한 종료( stop 플래그, interrupt() )
		// *** stop() 강제 종료 **** X
		
		PrintThread1 t1 = new PrintThread1();
		PrintThread1 t2 = new PrintThread1();
		PrintThread1 t3 = new PrintThread1();
		PrintThread1 t4 = new PrintThread1();
		PrintThread1 t5 = new PrintThread1();
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		// t1.setStop(true);
		// 모든 스레드 t1~t5 종료
		PrintThread1.all_stop = true;
		
		System.out.println("> main 스레드 종료....");

	}

}
