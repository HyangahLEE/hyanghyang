package days28;

//공유 객체
class WorkObject{
	
	//methodA 메소드
	public synchronized void methodA(int i) {
		System.out.println("> ThreadA의  methodA() 작업 실행. - " + i);
		this.notify();
		try {
			wait();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	//methodB 메소드
	public synchronized void methodB(int i){
		System.out.println("> ThreadB의  methodB() 작업 실행. - " + i);
		notify();
		try {
			wait();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
}

class ThreadA extends Thread{
	private WorkObject workObject;
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10 ; i++) {
			workObject.methodA(i);
		}
	}
}

class ThreadB extends Thread{
	private WorkObject workObject;
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10 ; i++) {
			workObject.methodB(i);
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// 공유객체 생성
		WorkObject workObject = new WorkObject();
		
		ThreadA t_a = new ThreadA(workObject);
		ThreadB t_b = new ThreadB(workObject);
		
		t_a.start();
		t_b.start();
		
		System.out.println("> main 스레드 종료.");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println( "t_a : " + t_a.getState() );
		System.out.println(  "t_b : " + t_b.getState() );
        
		}

}