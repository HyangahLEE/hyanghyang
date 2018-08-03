package days28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Ex11 {

	public static void main(String[] args) throws InterruptedException {
		// p 626 스레드 풀( Thread Pool )  -- 커넥션 풀( Connection Pool )
		// 1. 스레드 개수가 증가되고 병렬 작업 처리가 많아지면
		//    스레드 생성 및 스케줄링으로 인해 CPU 사용량 많아지고
		//    애플리케이션 [성능]이 저하된다. 
		// 2. 자바는 스레드풀을 생성하고 사용할 수 있도록
		//     java.util.concurrent 패키지의 ExecutorService 클래스
		
		// p 627
		// 스레드 풀 생성
		// 1. 초기 스레드 수		0											0
		// 2. 코어 스레드 수		0											2
		// 3. 최대 스레드 수		Integer.MAX_VALUE 21억			2
		
		// ㄱ. newCachedThreadPool() 메소드 
		// ㄴ. newFixedThreadPool(int 10)
		
		//                   스레드풀 생성()   [   ta,tb,tc   ~  t10      ]
		//   
				
		// p 630
		// 1. 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 10 ; i++) {
			//  작업 // 익명 객체 ..
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor tpe =
							(ThreadPoolExecutor) executorService;
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수 : " 
					+ poolSize+"] 작업 스레드 이름 : " + threadName);
					int value = Integer.parseInt("삼"); // 예외 발생
				}
			};
			
			// execute() / submit() 차이점
			// executorService.execute(runnable); // 스레드가 계속 생겨나므로 예외발생이 계속 나타난다..
			 executorService.submit(runnable);
			
			Thread.sleep(10); // 콘솔 출력.... 0.01초
		}
		

		executorService.shutdown();  //작업종료..
	} // main
 
}
