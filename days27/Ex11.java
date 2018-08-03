package days27;

class SumThread extends Thread{
	private long sum;  //5050
	public long getSum() { return this.sum ; }
	public void setSum(long sum) { this.sum = sum; }
	
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}

public class Ex11 {

	public static void main(String[] args) {
		// p 606 다른 스레드의 [*종료*]를 기다림( join() )
		SumThread sumThread = new SumThread();
		sumThread.start();  // run() 1~100까지합 = 5050
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  // main 스레드가 sumThread 종료할때까지 일시정지( 합 다구하고 출력하기위해)
		
		//main 스레드가 아래와 같이 합출력....
		System.out.println("1~100 합 : " + sumThread.getSum());

	}

}
