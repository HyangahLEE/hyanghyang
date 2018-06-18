package days28;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Ex08 {

	public static void main(String[] args) {
		/* p620 스레드 그룹
		 * 1. 관련된 스레드를 묶어서 관리한 목적으로 이용된다.
		 * 2. JVM이 실행되면 system 스레드 그룹이 생성된다. <- system 스레드 그룹 포함
		 * 3. system 스레드 그룹의 자식 그룹으로 main 스레드 그룹이 있다.
		 * 4. 우리가 스레드를 생성하게 되면 스레드 그룹은 부모 스레드의 스레드 그룹에 포함 된다.
		 *
		 * 
		 * */
		
		ThreadGroup mainTG = Thread.currentThread().getThreadGroup();
		
		System.out.println(mainTG.getName());
		
		AutoSaveThread t = new AutoSaveThread();
		t.setDaemon(true);
		t.setName("AutoSaveThread");
		t.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		
		Set<Thread> set = map.keySet();
		
		
		Iterator<Thread> ir = set.iterator();
		while (ir.hasNext()) {
			Thread thread = ir.next();
			
			System.out.printf("%s - %s(%b)", 
					thread.getThreadGroup().getName(),thread.getName(), thread.isDaemon()? " 데몬": "일반");
			
		}
	}

}
