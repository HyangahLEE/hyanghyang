package days30;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

//객체가 네트워크 스트림을 통해서 전달 : 직렬화 
class PointMsg implements Serializable{

	int x;
	int y;

}


public class MouseServerTest extends Frame implements Runnable{

	Canvas gp;
	ObjectInputStream ois = null;// 객체단위로 쓰기읽기 작업하려고 인풋아웃풋 생성
	ObjectOutputStream oos =null;
	ServerSocket serverSocket = null; // 네트워크로 보내니까 소켓생성

	//디폴트 생성자
	public MouseServerTest() {
		// 1. 디자인 + 수신용 스레드.start()

		this.gp = new Canvas();
		this.gp.setBackground(Color.orange);
		this.add(this.gp);
		this.gp.addMouseListener(new MouseHandler());//마우스 관련 이벤트를 등록해주는 이벤트

		this.setTitle("Server");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);

		// 닫기버튼 종료기능 추가
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Socket socket = null;
		try {
			this.serverSocket = new ServerSocket(5001);
			socket = this.serverSocket.accept();//특정포트번호 포인트 하겠다.클라가 접속하기전까지 main스레드 블로킹
			//누군가 접속해서 소켓객체 참조
			this.ois = new ObjectInputStream(socket.getInputStream());
			this.oos.flush();
			this.oos = new ObjectOutputStream(socket.getOutputStream());
			
			//객체상태로 왔다리 갔다리

			//수신하는 스레드 객체
			Thread receiveth = new Thread(this);
			receiveth.start();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}


	public static void main(String[] args) {

		new MouseServerTest();

	}//main

	//중첩클래스 선언 MouseHandler() -> 이벤트 처리할 떄만 쓸꺼기 때문에
	class MouseHandler extends MouseAdapter{
		public void mousePressed(MouseEvent e) {// 마우스 관련된 모든 작업
			Graphics g= gp.getGraphics();//캔버스(gp)위에 그리기 도구(메소드, 필드) 가져오기
			String msg = null;
			int x = e.getX(); int y= e.getY();
			msg = String.format("(%d, %d)", x , y );
			g.drawString(msg, x, y);

			// main() 스레드가 송신 : 그 좌표 객체 상대방 전송...

			try {
				PointMsg pm = new PointMsg();
				pm.x = x; pm.y = y;
				oos.writeObject(pm);// 보내는 객체로 write}
			} catch (IOException e1) {
			} catch (Exception e1) {			
			}
		}


	}

	@Override
	public void run() {
		// 수신용 receiveth.run()
		// 소켓을 닫으면 -1이 넘어온다.
		try {
			while (true) {
				Object obj = this.ois.readObject();
				if(obj instanceof PointMsg) {
					PointMsg pm = (PointMsg) obj;
					//얻어오는 좌표값 화면에 뿌리기 
					Graphics g= gp.getGraphics();//캔버스(gp)위에 그리기 도구(메소드, 필드) 가져오기
					String msg = null;
					int x = pm.x; int y= pm.y;
					msg = String.format("(%d, %d)", x , y );
					g.drawString(msg, x, y);
				}
			}
		} catch (Exception e) {
		}




	}
}//class
