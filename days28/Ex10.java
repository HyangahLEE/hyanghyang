package days28;

class WorkThread extends Thread{
	//  생성자.
	public WorkThread(ThreadGroup tg, String tname) {
		super(tg, tname); // 스레드그룹, 스레드명
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+" interrupted.");
				break;
			}
		}
		System.out.println(this.getName() +" 종료됨.");
	}
}

public class Ex10 {

	public static void main(String[] args) {
		// p 624 스레드 그룹 생성, 정보 출력
		//    스레드 그룹 안의 모든 스레드 interrupt() 메소드 호출-> 일괄종료.
		
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		
		WorkThread ta = new WorkThread(myGroup, "ta");
		WorkThread tb = new WorkThread(myGroup, "tb");
		
		ta.start();
		tb.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		
		// main 스레드그룹
		ThreadGroup mainGroup =
				Thread.currentThread().getThreadGroup();
		
		mainGroup.list();
		
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		
		myGroup.interrupt(); // 모든 스레드가 interrupt() 메소드 처리...
	}

}
