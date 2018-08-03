package days27;

import java.awt.Frame;
import java.io.IOException;

//독립적으로 파일 다운로드(복사)...
class MyForm extends Frame implements Runnable{    //다중상속안됨 **( 러너블을 인플리먼트해서 독립적으로 파일다운로드 하는 코딩해야함)
	
	public MyForm(){
		
	}
	
	public MyForm(String title) {
		this.setTitle(title);
		init(); // 초기화함수 //관리하기 위해서
	}

	// init  =  MyForm 클래스를 초기화 해주는 메소드
	public void init() {
		this.setSize(500, 500);
		this.setVisible(true);
	}

	@Override
	public void run() {
	// 독립적으로 파일 다운로드(복사)하는 코딩...
		
	}
	
	
	
}

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		System.out.println(" > main 스레드 시작..");
		
		System.in.read();  // 잠시 멈춤...엔터
		System.in.skip(2);
		new MyForm("A 파일 복사중...");
		
		System.in.read();  // 잠시 멈춤...엔터
		System.in.skip(2);
		new MyForm("B 파일 복사중...");
		System.out.println(" > main 스레드 종료...");
		
		// 588 스레드의 우선순위.
		
		
		// p 586 스레드의 이름
		// 1.Thread.currentThread().getName()
		// 2. t1.setName("??")
		// 3. 기본적으로 Thread-n 이름이 자동 부여된다
		// 4. main 스레드
		
		
		
	}
}
