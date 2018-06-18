package days28;

class PrintThread extends Thread{
	@Override
	public void run() {

		

			while(true) {
				System.out.println("> PrintThread 실행 중.");
				if(Thread.interrupted()) {//boolean 
					//외부에서 인터럽드 메소드 호출?!
					break;
					//while만 빠져나오면 Thread 빠져나옴
					
				}
				//Thread.sleep(1);//일시정지
				
				
			}
		
		System.out.println("- 자원정리 -");
		System.out.println("- PrintThread 종료 -");
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// p615 interrupt() 메소드를 이용하는 안전하게 종료하는 방법
		//1. interrupt() ?
		// -> 스레드가 [1.일시정지 상태에 있을 때] InterruptedExceotion [2.예외를 발생]시키는 역할.
		//		이것을 이용하면 run() 메소드를 정상 종료 시킬 수 있다.


		Thread t1 = new PrintThread();
		t1.start();
		
		//main 스레드 일시정지 1초간 정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t1.interrupt();
		System.out.println("- main 종료 -");
	}

}
