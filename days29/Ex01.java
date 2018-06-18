package days29;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex01 {

	public static void main(String[] args) {
		// 스레드풀(ThreadPool)  , 컨넥션풀 ( ConnectionPool )
        // p 635
		//[리턴값이 없는 작업통보]
		int nThreads = Runtime.getRuntime().availableProcessors();
		System.out.println(nThreads);
		// 1. 스레드 풀 생성
		ExecutorService executorService =
				Executors.newFixedThreadPool(nThreads);
		System.out.println("[작업 처리 요청]");
		
		// 2. 작업 객체 생성
		Runnable runnable = new Runnable() {
			public void run() {
				int sum = 0;
				for (int i = 1; i <=10 ; i++) {
					sum += i;
				}
				System.out.println("[처리 결과] " + sum);
			}
		};
		
		// 3. 스레드풀 안의 작업큐 -> 요청.
		Future future = executorService.submit(runnable);
		
		try {
			System.out.println( future.get() );    // 완료 후 리턴타입 null
			
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} catch (ExecutionException e) { 
			e.printStackTrace();
		}
		
		// 4. 스레드풀    종료.
		executorService.shutdown();

	}

}









