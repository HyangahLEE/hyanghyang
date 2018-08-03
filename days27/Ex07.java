package days27;

class 노가다Worker extends Thread{
	@Override
	public void run() {
		//for (int i = 0; i < 100; i++) {
			System.out.println("> 삽질....");
			try {
				Thread.sleep(100);  // 0.1초간 notRunnable 상태가됨.   (다른 스레드한테 cpu한테 넘기기 위해서) !! 슬립사용..
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
//}

public class Ex07 {

	public static void main(String[] args) {
		// 스레드의 상태와 제어
		노가다Worker  hyang = new 노가다Worker();
		//getStater() 메소드 : [NEW] 상태.
		System.out.println( "1."+hyang.getState() );
		hyang.start(); // 러너블 상태 ..실행직전까지..
		System.out.println( "2."+hyang.getState() );
		
		try {
			Thread.sleep(100); // 메인스레드  Start -- >  cpu가 not러너블상태로..쉬러감( *초간)..일안함.  ->  //hyang이 런상태가됨. 
			System.out.println( "3."+hyang.getState() );   // TIMED_WAITING
		} catch (InterruptedException e) { // 강제로 
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
			System.out.println( "4."+hyang.getState() );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
