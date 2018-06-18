package days29;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientExample {

	public static void main(String[] args) {
		// 클라이언트

		//전화기 만들어서 접속시도
		Socket socket = null;
		try {
			
			
			socket = new Socket();
			System.out.println("[연결 요청]");
			SocketAddress endpoint= new InetSocketAddress("211.63.89.163", 5001);
			socket.connect( endpoint ); //서버한테 전화한다 . timeout 시간이 지나면 그냥 끊어라
			System.out.println("오예 성공!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}}
	}

}
