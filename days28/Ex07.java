package days28;

class AutoSaveThread extends Thread{
	//자동 저장 스레드
	public void save() {
		
		System.out.println("> 작업 내용을 저장하는 코딩");
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	break; }
			
			save();
		}
		
	}
	
	
	
}



public class Ex07 {
	public static void main(String[] args) {
		
		//1. 데몬스레드 ?
		//- 주 스레드의 작업을 돕는 보조적인 역할 을 하는 스레드
		//- 주 스레드가 종료하면 자동종료
		//- 그 외에는 일반 스레드와 동일하다.
		
		//2. 데몬 스레드 : setDaemon(true)
		//- 주의 : start() 메소드 호출 전에 설정...
		
		AutoSaveThread t = new AutoSaveThread();
		t.setDaemon(true);
		t.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 스레드 종료!!");
	}
}
