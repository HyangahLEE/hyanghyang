package days27;

import java.awt.Frame;
import java.io.IOException;

//독립적으로 파일 다운로드(복사)...
class Myform extends Frame implements Runnable{


	public Myform() {
		init(); //관리하기 위해서
	}

	public Myform (String title) {
		this.setTitle(title);
		init();
	}
	public void init() {	
		this.setSize(500, 500);
		this.setVisible(true);


	}

	@Override
	public void run() {
		//독립적으로 파일 다운로드(복사)...
		
	}
}

public class Ex03 {

	public static void main(String[] args) throws IOException {

		System.out.println("> main 스레드 시작**");

		System.in.read();//잠시멈춤//엔터
		System.in.skip(2);
		new Myform("A 파일 복사중ㅣ..");

		
		System.in.read();//잠시멈춤
		System.in.skip(2);
		new Myform("B 파일 복사중..");
		
		System.out.println("> main 스레드 종료!!");

	}

}
