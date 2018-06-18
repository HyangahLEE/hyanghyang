package days27;

class Task implements Runnable{

	public String market;

	public Task() {}
	public Task(String market) {
		this.market = market;
	}

	@Override
	public void run() {  //스레드가 해야할 일을 가지고 있는 객체(스레드 xx)
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - %s 장보기 %d%% 진행중~\n",
					Thread.currentThread().getName(), market, i );
		}
		System.out.printf(">%s 장보기 완료!!! \n", this.market);
	}

}

public class Ex01 {

	public static void main(String[] args) {
		for (int i = 0; i <=100; i++) {
			if(i==20)  {
				Runnable target = new Task("E-MART");
				Thread Hyangah = new Thread(target);
				Hyangah.setName("t1");
				Hyangah.start();
			}else if(i==50){
				Runnable target = new Task("HI-MART");
				Thread Eunwoo = new Thread(target);
				Eunwoo.setName("t2");
				Eunwoo.start();
			}
			
			System.out.printf(">[%s] -%d%% 방청소\n", Thread.currentThread().getName(),i);
			
		}
		System.out.println("> main - 방청소 완료!!!");
	}

}
