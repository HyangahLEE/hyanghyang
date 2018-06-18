package days28;

import java.util.Vector;

class VideoShop{
	private Vector<String> buffer  = new Vector<>();
	public VideoShop() {
		this.buffer.addElement("은하철도 999-0");
		this.buffer.addElement("은하철도 999-1");
		this.buffer.addElement("은하철도 999-2");
		this.buffer.addElement("은하철도 999-3");
	}
	public synchronized String lendVideo() {
		
	/*	if(this.buffer.size()==0) {
			
			return null; // 대여자 wait() 일시정지..
			
		}
		*/
		String tname = Thread.currentThread().getName();
		if(this.buffer.size()==0) {
			
			try {
				System.out.println(tname + " 대기상태 진입!!" );
				this.wait(); // 공유자원 -> 스레드 기다리라
				System.out.println(tname + " 대기상태 해제!!" );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		String v= this.buffer.remove(buffer.size()-1);
		return v;
	}
	public synchronized void returnVideo(String video) {
		this.buffer.addElement(video);
		//this.notify();
		this.notifyAll();
		//일시정지 스레드 중에 공유 자원 wait() 스레드 알려줘서 빠져나와라
	}
}

class Person extends Thread{
	@Override
	public void run() {
		//스레드 객체의 run() 안에 동기화 처리 가능
	//	synchronized (Ex04.vShop) {
			
			try {
		    	//String v = Ex04.vShop.lendVideo();
				//	if( v == null ) {System.out.println("삐삑 대여 불가 뚜뚠"); return;}
				//String v = null;
				String v = Ex04.vShop.lendVideo();
				while( (v = Ex04.vShop.lendVideo()) == null) {
					System.out.println(" 0.2초 후 다시 방문");
					this.sleep(200);
				}
				
				
				System.out.println(this.getName() +" : " + v + " 대여");
				System.out.println(this.getName() +" : " + v + " 보는중");
				this.sleep(5000);
				System.out.println(this.getName() +" : " + v + " 반납");
				Ex04.vShop.returnVideo(v);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	//	}
		
	
	}
}

public class Ex04 {
	
   public static VideoShop vShop = new VideoShop();

	public static void main(String[] args) {
		// 1. ***    공유 객체의 메소드를 동기화 처리
		// 2. 공유 객체를 사용하는 스레드의 run() 메소드를 동기화 처리.
		
		// 3. synchronized ( 동기화 처리 )의 한계...-> 개선

		System.out.println("프로그램 시작");
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}