package days29;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 결과를 저장할 외부 객체
class Result{
	int accumValue;
	synchronized void addValue(int value) {
		this.accumValue += value;
		// this.accumValue = this.accumValue + value;
	}
}

class Task implements Runnable{
	Result result;
	Task(Result result){
		this.result = result; 
		// 처리 결과를 저장할 외부 저장객체를 생성자를 통해 주입받음. 
	}
	@Override
	public void run() { 
		int sum = 0;
		for (int i = 1; i <=10 ; i++) {
			sum += i;
		}
		this.result.addValue(sum);
	}
	 
}

public class Ex03 {

	public static void main(String[] args) {
		// p 638 작업 처리 결과를 외부 객체에 저장....
		int nThreads = Runtime.getRuntime().availableProcessors();
		System.out.println(nThreads);
		// 1. 스레드 풀 생성
		ExecutorService executorService =
				Executors.newFixedThreadPool(nThreads);
		System.out.println("[작업 처리 요청]");
		
		// 2. 작업 요청 객체
		// main 메소드 안에 클래스....( 중첩 클래스 )
		Result result = new Result(); // 공유 객체
		
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		// 3. 작업 요청
		Future<Result> fufure1 = executorService.submit(task1, result);
		Future<Result> fufure2 = executorService.submit(task1, result);
		
		try {
			result = fufure1.get();
			result = fufure2.get();
			
			System.out.println("[처리 결과] " + result.accumValue );
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
