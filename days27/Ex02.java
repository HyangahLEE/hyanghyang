package days27;

class Worker extends Thread{
	public String market;
	
	public Worker(String market) {
		this.market= market;
	}

	public Worker(String market, String name) {
	this.market=market;
	this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - %s 장보기 %d%% 진행중~\n",
					Thread.currentThread().getName(), market, i );
		}
		System.out.printf(">%s 장보기 완료!!! \n", this.market);	
	}
}

public class Ex02 {

	public static void main(String[] args) {
		for (int i = 0; i <=100; i++) {
			if(i==25)  {
				Worker Hyangah = new Worker("E-mart","t1");
			}
			
			System.out.printf(">[%s] -%d%% 방청소\n", Thread.currentThread().getName(),i);
			
		}
		System.out.println("> main - 방청소 완료!!!");
	}

}
