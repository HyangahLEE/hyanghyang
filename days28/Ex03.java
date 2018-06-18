package days28;

// 은행 ( 공유 자원 ) 
class Bank{
	private int money = 3000; // 예금액.
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	// 입금 메소드
	public void plusMoney(int money) {
		
		synchronized (this) {
			int m  = this.getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			this.money = m + money;
		}
		
	}
	// 출금 메소드
	public synchronized 
	void minusMoney(int money) {
		int m = this.getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		this.money = m - money;
	}

}

class Lee extends Thread{
	@Override
	public void run() {
		// 돈 버는 역할..
		Ex03.leeBank.plusMoney(3000);
		System.out.println("> plusMoney(3000) : " + Ex03.leeBank.getMoney());
	}
}

class LeeWife extends Thread{
	@Override
	public void run() {
		// 돈 쓰는 역할..
		Ex03.leeBank.minusMoney(5000);
		System.out.println("> minusMoney(5000) : " + Ex03.leeBank.getMoney());
	}
}

public class Ex03 {

	public static Bank leeBank = new Bank();
	public static void main(String[] args) {
	
		System.out.println("> 현재 예금액 : " + Ex03.leeBank.getMoney());

		Lee l = new Lee();
		l.start();

		LeeWife w = new LeeWife();
		
		try {//main스레드
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//*왜 main 을  sleep 시켜줬나용?
		
		w.start();

		System.out.println(">main 종료");
	}

}