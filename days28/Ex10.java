package days28;

class WorkThread extends Thread{
	public  WorkThread (ThreadGroup threadGroup, String threadName) {
	super(threadGroup, threadName);

}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted");
			break;
			}
			
			
		}
		System.out.println(getName() + "종료 !!");
		
	}
	
	
	
	
}

public class Ex10 {

	public static void main(String[] args) {
		ThreadGroup tg =  new ThreadGroup("tg");
		
		WorkThread a= new WorkThread(tg, "a");
		WorkThread b = new WorkThread(tg, "b");
		
		a.start();
		b.start();
		System.out.println( "[ main 스레드 그룹의  list() 메소드 출력 내용 ]");
		ThreadGroup mg = Thread.currentThread().getThreadGroup();
		mg.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		mg.interrupt();
	}

}
