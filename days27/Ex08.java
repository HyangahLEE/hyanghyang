package days27;

class PriorityThread extends Thread{
	public void run() {
		int i =0;
		System.out.printf(">> %s [우선권:%d] 시작\n"
				, this.getName(), this.getPriority());
		while(i<10000) {
			i++;
			try {
				this.sleep(1);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		System.out.printf("<< %s [우선권:%d] 종료\n"
				, this.getName(), this.getPriority());
	}
}

public class Ex08 {

	public static void main(String[] args) {
		//
		System.out.println("> main 스레드 시작 ");

		PriorityThread [] p = new PriorityThread[10];
		for (int i = 0; i < 10; i++) {
			p[i] = new PriorityThread();
			p[i].setName("t"+(i+1));
			p[i].setPriority(i+1);
		}
		for (int i = 0; i < p.length; i++) {
			p[i].start();
		}
		
		System.out.println("> main 스레드 종료 ");
	}

}
