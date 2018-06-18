package days29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.xml.crypto.Data;

public class EcoServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5001);
			System.out.println("[연결 기다림]");

			while(true) { 
				System.out.println("[연결을 기다리는 중...]");
				Socket socket = serverSocket.accept(); //전화를 켜둔 상태 클라가 나한테 연결할 수 있도록 전화가 올 때 까지 블로킹하고있다.
				InetAddress clientIA =socket.getInetAddress();			
				String ip = clientIA.getHostAddress();
				System.out.printf("> [%s] 고객 접속 - 날짜시간정보\n",ip);

				InputStream is = socket.getInputStream(); //상대방이 나한테 보낸 데이터 읽기
				OutputStream os = socket.getOutputStream();// 상대방 소켓한테 전화기를 통해 데이터를 보내겠다


				//			네퉈크로 송수신 할 스트림 br,bw
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				
				//수신데이터
				String message = br.readLine();
				
				Data now = (Data) new Date();
				System.out.printf("수신한 메시지 : %s\n", message);
				message = String.format("%s\n.", args);
				
			}			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
