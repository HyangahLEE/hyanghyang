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


class FileCopyThread extends Thread{
	Myform3  myform3;
	public FileCopyThread(Myform3 myform3) {
		this.myform3 = myform3;
	}

	@Override
	public void run() {
		//실제 독립적으로 파일을 다운로드 코딩 ...메소드
		// 별개의 스레드 t1 from Runnable
		System.out.println(">파일 복사 시작...");
		for (int i = 0; i <100; i++) {

			this.myform3.txtContent.append("C");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //잠시멈춤
		}
	}
}
class FileDownLoadThread extends Thread{
	Myform3  myform3;
	public FileDownLoadThread(Myform3 myform3) {
		this.myform3 = myform3;
	}

	@Override
	public void run() {
		//실제 독립적으로 파일을 다운로드 코딩 ...메소드
		// 별개의 스레드 t1 from Runnable
		System.out.println(">파일 다운로드 시작...");
		for (int i = 0; i <100; i++) {

			this.myform3.txtContent.append("D");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //잠시멈춤
		}
	}

}


class Myform3 extends Frame implements ActionListener{


	private Button btnFileCopy = null;
	private Button btnFileDownLoad = null;
	public TextArea txtContent = null;

	public Myform3() {
		init();
	}
	
	public void init() {
		//배치..설정
		this.setLayout(new BorderLayout());

		//버튼위에 뭐라고 찍을거니
		this.btnFileDownLoad =new Button("FileDownLoad Button");
		this.add(this.btnFileDownLoad, BorderLayout.NORTH);
		this.btnFileDownLoad.addActionListener(this);
		//버튼을 클릭할 떄 이벤트를 처리할 객체

		this.btnFileCopy =new Button("FileCopy Button");
		this.add(this.btnFileCopy, BorderLayout.SOUTH);
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
	public void actionPerformed(ActionEvent e) {
		//이벤트를 발생시킨 소스
		Button btn =(Button) e.getSource();
		if(		btn.getLabel().equals("FileDownLoad Button") ) {
			this.txtContent.append("> 파일복사 시작 ~~~~~~\n");
			FileCopyThread t1 = new FileCopyThread(this);
			t1.start();
			
		}else if(  btn.getLabel().equals("FileCopy Button")  ) {
			this.txtContent.append("> 파일 다운로드 시작!!!!!!!!\n");
			FileDownLoadThread t2 = new FileDownLoadThread(this);
			t2.start();
		}

		/*String text =	this.txtContent.getText();
		text +="> " + btn.getLabel() + "버튼 클릭됨\r\n";
		this.txtContent.setText(text);
		//메인스레드가 폼을 띄어서 스레드를 독립적으로 만듬(수행중)
		//							다운로드하는
		 */
	}
}


public class Ex06 {

	public static void main(String[] args) {

		new Myform3();

	}

}
