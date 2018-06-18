package days27;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.Border;
//스레드가 수행일 일을 가지고 있는 객체 [myform2]
class Myform2 extends Frame implements Runnable, ActionListener{


	private Button btnFileCopy = null;
	private TextArea txtContent = null;

	public Myform2() {
		init();

	}
	public void init() {
		//배치..설정
		this.setLayout(new BorderLayout());
		//버튼위에 뭐라고 찍을거니
		this.btnFileCopy =new Button("FileCopy Button");
		this.add(this.btnFileCopy, BorderLayout.NORTH);
		this.btnFileCopy.addActionListener(this);
		//버튼을 클릭할 떄 이벤트를 처리할 객체


		this.txtContent = new TextArea();
		this.add(this.txtContent, BorderLayout.CENTER);


		this.setSize(500, 500);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {

			public void  windowClosing(WindowEvent e) {

				dispose();
			}
		});
	}

	@Override
	public void run() {
		//실제 독립적으로 파일을 다운로드 코딩 ...메소드
		// 별개의 스레드 t1 from Runnable
		System.out.println(">파일 다운로드 시작...");
		for (int i = 0; i <100; i++) {

			System.out.println("*");
			this.txtContent.append("#");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //잠시멈춤

		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		/*String text =	this.txtContent.getText();
		text +="버튼 클릭됨\r\n";
		this.txtContent.setText(text);*/
		//메인스레드가 폼을 띄어서 스레드를 독립적으로 만듬(수행중)
		//							다운로드하는
		Thread t1 = new Thread(this);
		t1.start();
	}
}


public class Ex05 {

	public static void main(String[] args) {


		new Myform2();

	}

}
