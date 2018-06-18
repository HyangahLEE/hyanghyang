package days28;

public class Ex09 {

	public static void main(String[] args) {
		//p622 스레드 그룹 생성
		// system. > main
		
		
		/*ThreadGroup tg =  new ThreadGroup("스레드 그룹명");
		ThreadGroup tg =  new ThreadGroup(부모 스레드그룹 ,"스레드 그룹명");*/
		
		//main  스레드 그룹
		//  sub 스레드 그룹
		ThreadGroup tg =  new ThreadGroup("sub");
	//	AutoSaveThread t = new AutoSaveThread();
		
		Thread t = new Thread(tg,"t1");

	}

}
