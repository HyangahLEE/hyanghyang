package days29;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerExample {

	public static void main(String[] args) {
		//서버

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			SocketAddress endpoint = new InetSocketAddress("localhost", 5001);
			serverSocket.bind( endpoint ); // 서버가 있다면 그 ip와 포트를 열어서 가리켜라 '종착지'
			
			while(true) {
				System.out.println("[연결을 기다리는 중...]");
				Socket socket = serverSocket.accept(); //전화를 켜둔 상태 클라가 나한테 연결할 수 있도록 전화가 올 때 까지 블로킹하고있다.
				//연결이 되면 소켓이 담김
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();// 접속한 클라의 어드레스 정보 얻어오기
				//System.out.println("연결 수락! 띠용!" + isa.getHostName());
				System.out.println("연결 수락! 띠용!" + isa.getAddress());
			
			
			}			
		} catch (IOException e) { e.printStackTrace(); }
		

		//서버소켓이 닫히지 않았다면
		if(!serverSocket.isClosed()){
			try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}}
		
		
	}
	

}
