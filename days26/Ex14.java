package days26;

class Task implements Runnable{

	@Override
	public void run() {  //스레드가 해야할 일을 가지고 있는 객체(스레드 xx)
		 for (int i = 1; i <= 100; i++) {
				System.out.printf("> %s -  장보기 %d%% 진행중~\n",
						Thread.currentThread().getName(), i );
			 }
	     System.out.println("> 장보기 완료!!! ");
	}
	
}

public class Ex14 {
	
	//main스레드-청소
	public static void main(String[] args) {
		 // 청소...
	     for (int i = 1; i <= 100; i++) {
	    	
	    	if( i==10) {
	    		Runnable target = new  Task();
				// 장보기...  이용우 스레드(일꾼)을 생성해서 독립적으로 장보기시키자.
	    		Thread 이용우일꾼 = new Thread( target );
	    		이용우일꾼.setName("t1");
	    		이용우일꾼.start(); // target.run() 독립적으로 처리...
	    	}
	    	 
			System.out.printf("> %s -  청소 %d%% 진행중~\n",
					Thread.currentThread().getName(),
					i);
		 }
	     System.out.println("> 청소 완료!!! ");
	     // e-마트 .. 장보러갈 일..      [이용우] 스레드 생성 -> 장보기..
	     /*
	     for (int i = 1; i <= 100; i++) {
				System.out.printf("> %s -  장보기 %d%% 진행중~\n",
						Thread.currentThread().getName(),
						i);
			 }
	     System.out.println("> 장보기 완료!!! ");
	     */
	}

}
