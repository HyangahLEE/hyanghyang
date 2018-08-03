package days27;

// 인쇄(출력) 기계.....
class PrintMachine{
	// "[/***/이/향/아/***/]"
	// [[[[************차은우
	//public synchronized void printData(String data) {
//	synchronized (this){//2번 동기화
	public void printData(String data) {
		
		//synchronized (this) {
			try {
				System.out.print("[");
				Thread.sleep(500);
				System.out.print("***");
				Thread.sleep(500);
				for (int i = 0; i < data.length() ; i++) {
					System.out.print( data.charAt(i) );
					Thread.sleep(500);
				}
				Thread.sleep(500);
				System.out.print("***");
				Thread.sleep(500);
				System.out.print("]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		//}
		
	}
}

/*1번동기화****
		 * public synchronized void printData(String data) {


		try {

			System.out.print("[");
			Thread.sleep(500);
			System.out.print("***");
			Thread.sleep(500);
			for (int i = 0; i <data.length(); i++) {
				System.out.print(data.charAt(i));
				Thread.sleep(500);
			}
			System.out.print("***");
			Thread.sleep(500);
			System.out.print("]");
			Thread.sleep(500);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/


// 스레드( Thread )
class PrintNameThread extends Thread{	
	private String name;                     //
	private PrintMachine printMachine;  //	
	public PrintNameThread() {}	 
	public PrintNameThread(String name
			                , PrintMachine printMachine) {
		this.name = name;
		this.printMachine = printMachine;
	} 

	@Override
	public  void run() {
		synchronized (printMachine) {//3번 동기화
			this.printMachine.printData(this.name);	
		}
	}
	
}

public class Ex09 {

	public static void main(String[] args) {
		// p 591 [동기화] 메소드와 동기화 블록
		// 향아T  -> 공유자원(봉투) ->   혜원T
		//   A                                    B
		// 동기화 : 빈봉투안에 내용물을 집어넣고 나서 풀 붙이기...
		
		// 인쇄기계.printData(data)
		// 인쇄이름스레드 run() {  인쇄기계.printData(name)  }
		/*
		PrintNameThread t1 = new PrintNameThread("이석화", new PrintMachine());
		PrintNameThread t2 = new PrintNameThread("김재곤", new PrintMachine());
		PrintNameThread t3 = new PrintNameThread("이혜원", new PrintMachine());
		PrintNameThread t4 = new PrintNameThread("박주영", new PrintMachine());
		*/
		
		// 공유자원
		PrintMachine pm = new PrintMachine();
		
		// 공유자원 : 모든 각각의 스레드가 공유해서 사용하는 인쇄기계( pm )
			PrintNameThread t1 = new PrintNameThread("이향아",pm);
			PrintNameThread t2 = new PrintNameThread("신정연",pm);
			PrintNameThread t3 = new PrintNameThread("박보연",pm);
			PrintNameThread t4 = new PrintNameThread("김이슬",pm);
		
		t1.start();t2.start();t3.start();t4.start();  // RUNNABLE 상태
		
		

	} // main

}
