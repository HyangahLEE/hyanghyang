package days27;


class PrintMachine{

		public void printData(String data) {
		//	synchronized (this){//2번 동기화

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
				System.out.print("]\n");
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
	

	class PrintNameThread extends Thread{

		private String name;
		private PrintMachine printMachine;

		public PrintNameThread() {};

		public PrintNameThread(String name) {
			this.name = name;

		}

		public PrintNameThread(String name, PrintMachine printMachine) {
			this.name = name;
			this.printMachine = printMachine;
		}

		
		@Override
		public void run() {
			synchronized (this.printMachine) { //3번 동기화
				this.printMachine.printData(this.name);
			}
			
		}
	}

	public class Ex09 {

		public static void main(String[] args) {
			//p591 [동기화] 메소드와 동기화 블록

			PrintMachine pm = new PrintMachine();
			//공유자원 생성 (따로따로 만드는것보다 pm으로 만들어라)

			PrintNameThread t1 = new PrintNameThread("이향아",pm);
			PrintNameThread t2 = new PrintNameThread("신정연",pm);
			PrintNameThread t3 = new PrintNameThread("박보연",pm);
			PrintNameThread t4 = new PrintNameThread("김이슬",pm);

			t1.start(); t2.start(); t3.start(); t4.start();
		}

	}
