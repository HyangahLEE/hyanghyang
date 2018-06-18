package days30;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import days30.MouseServerTest.MouseHandler;

public class MouseClientTest extends Frame implements Runnable{// 송수신 독립적으로 하기위헤 Runnable

	Canvas gp;
	ObjectInputStream ois = null;// 객체단위로 쓰기읽기 작업하려고 인풋아웃풋 생성
	ObjectOutputStream oos =null;
	
	//디폴트 생성자
	public MouseClientTest() {
		this.gp = new Canvas();
		this.gp.setBackground(Color.orange);
		this.add(this.gp);
		this.gp.addMouseListener(new MouseHandler());//마우스 관련 이벤트를 등록해주는 이벤트
		
		this.setTitle("Client");
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
			// 								서버 ip주소, 포트 // 이걸로 연결되어있기 때문에 connect(endpoint)안써도댐.
			socket	= new Socket("211.63.89.171",5001);
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
		
		
	}//디폴트 생성자
	
	public static void main(String[] args) {
		//MouseClientTest
		new MouseClientTest() ;

	}//main

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
