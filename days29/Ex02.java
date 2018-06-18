package days29;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex02 {

	public static void main(String[] args) {
		// p 637
		// [리턴값이 있는 작업통보]
		
		int nThreads = Runtime.getRuntime().availableProcessors();
		System.out.println(nThreads);
		// 1. 스레드 풀 생성
		ExecutorService executorService =
				Executors.newFixedThreadPool(nThreads);
		System.out.println("[작업 처리 요청]");
		
		// 2. 작업 객체 생성
		Callable<Integer> task = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10 ; i++) {
					sum +=i;
				}
				return sum;
			}
		};
		
		// 3. 스레드풀 안의 작업큐 -> 요청.
		Future<Integer> future = executorService.submit(task);
		
		try {
			int sum =  future.get() ;    // 완료 후 리턴타입 null
			
			System.out.println("[처리 결과] " + sum );
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
