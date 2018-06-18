package days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

class SocketInfo{

	Socket socket;
	String strUserName;
	String strip;

	//이 필드들을 저장할 객체 SocketInfo
	//append하면 유저 a와 통신할 객체가 그 포트로 들어가서 이 필드의 객체 정보를 하나 만들어서 a한테 (각각의 유저)에게 수신됨


}

class WorkThread extends Thread{

	ChatServer chatServer = null; // workthread 에서  this를 받아올 객체
	SocketInfo socketInfo = null;

	public WorkThread() {}

	public WorkThread(ChatServer chatServer, SocketInfo socketInfo) {
		super();
		this.chatServer = chatServer;
		this.socketInfo = socketInfo;
	}

	@Override
	public void run() {
		String msg;
		String userName;

		try {
			System.out.println(this.socketInfo.socket + " 접속됨.");
			BufferedReader br= new BufferedReader(new InputStreamReader(this.socketInfo.socket.getInputStream()));//
			userName = br.readLine();
			this.socketInfo.strUserName  = userName;
			msg = String.format(">>> %s 님께서 입장하셨습니다.\n", userName);
			// 모든사람들에게 입장알려주기
			for (SocketInfo si : chatServer.v) {
				if( si == this.socketInfo ) {
					PrintWriter pw = new PrintWriter(si.socket.getOutputStream(), true); //autoFlush()
					pw.println(msg);
				}
			}
			
			//각각의 접속자로부터 전달된 메세지를 모든 접속자에게 전달하기.
			String data = null;
			while ((data = br.readLine())!=null) {
				msg= String.format("[%s] : %s\n", this.socketInfo.strUserName,data);
				for ( SocketInfo si  : chatServer.v) {
					if( si != this.socketInfo ) {
						PrintWriter pw =                                               // autoFlush()
								new PrintWriter(si.socket.getOutputStream(), true);
						pw.println(msg);
					} // if
				} //for
				
			}//while
		} catch (Exception e) {
			System.out.println(this.socketInfo.strip + " 연결 끊어짐.");
			try {
				msg = String.format("<<<  (%s) 님이 퇴장하셨습니다.\n", this.socketInfo.strUserName);
				//모든 사용자들 에게도 알려주기.. (퇴장)
				for (SocketInfo si : chatServer.v) {
					if( si == this.socketInfo ) {
						PrintWriter pw = new PrintWriter(si.socket.getOutputStream(), true); //autoFlush()
						pw.println(msg);
					}
				}

			} catch (Exception e2) {
			}
			
			chatServer.v.remove(this.socketInfo);
		}
	}
}

public class ChatServer {

	// 접속한 클라이언트들의 각각 객체 정보
	Vector<SocketInfo> v = new Vector<>();
	ServerSocket serverSocket = null;
	int port = 5001;


	//main 스레드가 클라 한테 대기하고 소켓 업뎃할 수 있도록
	public ChatServer() {
		Socket socket = null;// 접속할 클라 객체
		try {
			this.serverSocket = new ServerSocket(port);
		} catch (IOException e) {

			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("[1.채팅 서버 시작]");
		System.out.println("[2.클라이언트 접속 대기 중]");

		try {
			while (true) {
				socket = serverSocket.accept();
				SocketInfo si = new SocketInfo();
				si.socket = socket;
				si.strip = socket.getInetAddress().getHostAddress(); //클라 ip값 얻어오기
				//si.strUserName
				v.addElement(si);
				System.out.printf("[3. %s 클라이언트가 접속됨]\n", si.strip);

				//접속한 클라이언트와 통신할 스레드 객체 생성.. 
				WorkThread th = new WorkThread(this, si);
				th.start();
				System.out.printf("[4. %s 클라이언트와 통신할 스레드 가동됨]\n", si.strip);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	public static void main(String[] args) {

		new ChatServer() ;

	}

}
