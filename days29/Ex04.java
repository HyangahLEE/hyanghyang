package days29;
 
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04 {
	// 1. 스레드풀 객체 선언
	private ExecutorService executorService;

	// 생성자
	public Ex04() {
		// 1-1. 스레드 풀 객체 생성.
		this.executorService = Executors.newFixedThreadPool(8);
	}
	
	public static void main(String[] args) {
		// p 643
		Ex04 example = new Ex04();
		
		example.doWork("3","3"); // 처리
		
		example.doWork("3","삼"); // 오류
		
		example.finish();

	}

	private void finish() { 
		this.executorService.shutdown();
	}

									//제네릭은 무조건 클래스!
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		
		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("> failed() 콜백 메소드 실행 : " + exc.toString());
			
		}
		
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("> completed() 콜백 메소드 실행 : " + result);
			
		}
	};
	
	
	
	
	// 왜 매개변수의 final 키워드 붙어있나용ㅇㅇㅇ?
	// 메소드 안에 있는 중첩클래스 밖에 있는 매개변수를 인식하기 위해서는 final이 붙어야 한다. 그렇군요!
	private void doWork(final String x,final String y) { 
		//2. 작업(Task) + 3. 작업요청
	
	Runnable task = new Runnable() {
		
		@Override
		public void run() {
			try {
				int intX = Integer.parseInt(x);
				int intY = Integer.parseInt(y);
				int result = intX + intY;
				//처리했을 때의 콜백함수
				//콜백 함수에 전달할 값이 필요하다면 2번쨰 인자값 을 줄거다.
				// 제네릭에 viod줬ㅈ으니까 null넣었음
				callback.completed(result, null);
			} catch (Exception e) {
				//실패했을 때의 콜백함수
				callback.failed(e, null);
			}					
		}
	};
	
	executorService.submit(task);
	//작업요청!!!!
	
	}

}