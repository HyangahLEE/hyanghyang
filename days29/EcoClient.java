package days29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class EchoClient {

	public static void main(String[] args) {
		// 에코 클라이언트 
        Socket socket = null;
		
		try {
			// connect() 없지만
			// 소켓 객체가 생성되면 자동 접속(connect) 성공..
			socket = new Socket("211.63.89.163", 5001);
			// 
			InputStream is    = socket.getInputStream();
			OutputStream os = socket.getOutputStream(); 
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(os));
			// 1. 클라이언트가 접속되자마자....
			bw.write("감자바.\n");
			bw.flush();
			// 2. 서버에서 메시지 에코..... 
			String message = br.readLine();
			System.out.printf("%s\n", message);
			
		} catch (IOException e) { 
			e.printStackTrace();
		}

		if(!socket.isClosed() ) {
			try {
				socket.close(); // 연결 끊기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
