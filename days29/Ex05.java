package days29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex05 {

	public static void main(String[] args) {
		// 1. 네트워크..?

		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내주소 : "+ local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("네이버 주소 : " +remote.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
