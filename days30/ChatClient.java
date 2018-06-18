package days30;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import days30.MouseServerTest.MouseHandler;

public class ChatClient extends Frame implements Runnable, ActionListener{// 송수신 독립적으로 하기위헤 Runnable

	//fields
	ObjectInputStream ois = null;// 객체단위로 쓰기읽기 작업하려고 인풋아웃풋 생성
	ObjectOutputStream oos =null;
	PrintWriter pw;//전송시킴
	BufferedReader br;// 전송할떄 한 라인씩 뿌리기
	// TextBox
	TextField tf ; // 한 라인 문자열 - 전송할 문자열
	TextArea ta; //여러라인 문자열 - 채팅 내용

	String userName = "향긔향긔★";

	//디폴트 생성자
	public ChatClient() {
		// 
		this.ta = new TextArea();
		this.ta.setEditable(false);// 수정 ㄴㄴ
		this.tf = new TextField();
		this.tf.addActionListener(this);

		this.add(this.tf, BorderLayout.SOUTH);
		this.add(this.ta, BorderLayout.CENTER);

		this.setTitle("Client");
		this.setSize(400, 400);
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
			socket	= new Socket("211.63.89.163",5001);
			//누군가 접속해서 소켓객체 참조
			this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.pw = new PrintWriter(socket.getOutputStream(),true);// 소켓에 전송

			this.pw.println(userName);// 서버에게 userName을 제일 처음 전송..

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
		new ChatClient() ;

	}//main


	@Override
	public void run() {
		//독립적으로 스레드객체(receiveth) 하나가 수신
		try {
				while (true) {
					if(this.ta.getText().equals("")) {
						this.ta.append(br.readLine());
					}else {
						this.ta.append("\n"+br.readLine());
						this.tf.transferFocus();// 입력창 포커스
					}
				}
		} catch (Exception e) {
			System.exit(-1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭할때 텍스트박스 엔터칠때...
		//main 스레드가 tf에 메시지를 입력 후 엔터치면 ->전송 (독립적으로 일을함)
		
		String msg;
		msg =String.format("\n[%s]: %s" , this.userName , this.tf.getText());
		
		this.tf.setText("");
		this.ta.append(msg);// 내 메시지 화면에 뿌리기
		this.pw.println(msg);// 메시지 보내기
				
		
	}

}//class
