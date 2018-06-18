package days28;

// 은행 ( 공유 자원 ) 
class Bank_02{
	private int money = 3000; // 예금액.
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	// 입금 메소드
	public void plusMoney(int money) {
		
		
			int m  = this.getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			this.money = m + money;
		
		
	}
	// 출금 메소드
	public void minusMoney(int money) {
		int m = this.getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		this.money = m - money;
	}

}

class Lee_02 extends Thread{
	@Override
	public void run() {
		// 돈 버는 역할..
		synchronized (Ex03_02.leebank) {
			Ex03_02.leebank.plusMoney(3000);
			
		}
		System.out.println("> plusMoney(3000) : " + Ex03_02.leebank.getMoney());
	}
}

class LeeWife_02 extends Thread{
	@Override
	public void run() {
		// 돈 쓰는 역할..
		synchronized (Ex03_02.leebank) {
			Ex03_02.leebank.minusMoney(5000);
		}
		
		System.out.println("> minusMoney(5000) : " + Ex03_02.leebank.getMoney());
	}
}

public class Ex03_02 {

	public static Bank_02 leebank = new Bank_02();
	public static void main(String[] args) {
	
		System.out.println("> 현재 예금액 : " + Ex03_02.leebank.getMoney());

		Lee_02 l = new Lee_02();
		l.start();

		LeeWife_02 w = new LeeWife_02();
		
		try {//main스레드
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		w.start();

		System.out.println(">main 종료");
	}

}