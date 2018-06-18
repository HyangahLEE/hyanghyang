package days27;

class ThreadA extends Thread{

	public boolean stop = false; //종료 플래그 
	public boolean work = true;

	@Override
	public void run() {
		while(!stop) {//무한반복
			if(work) {

				System.out.println("ThreadA 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료!!!");
	}


}


class ThreadB extends Thread{

	public boolean stop = false; //종료 플래그 
	public boolean work = true;

	@Override
	public void run() {
		while(!stop) {//무한반복
			if(work) {
				System.out.println("ThreadB 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료!!!");
	}//run()


}//ThreadB

public class Ex10 {

	public static void main(String[] args) {

		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();

		ta.start();
		tb.start();
		//
		//작업안할 때도 cpu를 가지고 있음 -> yield() 써서 안쓰고 있으면 양보하라
		try {	Thread.sleep(3000 );} catch ( InterruptedException e ) { e.printStackTrace();	}
		ta.work =false;
		
		try {	Thread.sleep(3000 );} catch ( InterruptedException e ) { e.printStackTrace();	}
		ta.work= true;
		
		try {	Thread.sleep(3000 );} catch ( InterruptedException e ) { e.printStackTrace();	}
		ta.stop = true;
		tb.stop = true;
		
		
	}

}
