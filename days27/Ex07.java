package days27;

class 노가다Worker extends Thread{
	
	@Override
	public void run() {
	//	for (int i = 1; i <=100; i++) {
			System.out.println("> 삽질..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	//}
}

public class Ex07 {

	public static void main(String[] args) {

		노가다Worker hyangah = new 노가다Worker();
		
		System.out.println("1"+hyangah.getState());
		hyangah.start();// Start -> Runnable
		System.out.println("2"+hyangah.getState());
		
		
		try {
			Thread.sleep(100);
			System.out.println("3"+hyangah.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		try {
			Thread.sleep(5000);
			System.out.println("4"+hyangah.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
