package days19;

import java.io.UnsupportedEncodingException;

public class Ex12 {

	public static void main(String[] args) 
			throws UnsupportedEncodingException {
		// 문자열 비교 : equals() 오버라이딩.
		String name1 = "홍길동";
		String name2 = "홍길동";		
		String name3 = new String("홍길동");
		/*
		// ==  참조타입인 경우에는 주소값 비교
		System.out.println( name1 == name2 ); // true
		System.out.println( name1 == name3 ); // false
		// equals()오버라이딩 메서드는 실제 문자열값 비교..
		System.out.println( name1.equals(name2) ); // true
		System.out.println( name1.equals(name3) ); // true
		*/
		// 대소문자 구분X
		// kenik     KeNiK              true
		
	    // name1.equals[IgnoreCase](name2);
		// name1.toUpperCase().equals(name2.toUpperCase());
		// name1.toLowerCase().equals(name2.toLowerCase() )
		
		// 문자 추출 : charAt()
		/*
		String data = "안녕하세요. 홍길동 입니다.";
		for (int i = 0; i < data.length(); i++) {
			System.out.println(data.charAt(i));
		}
		*/
		// 문자열 길이 : length() 메소드
		//System.out.println( data.length() ); // 15
		
		//int [] m = new int[10];
		//m.length  메소드 X  필드(속성)
		
		// 네트워크 코딩...( 채팅 프로그램 )
		// byte []                 ->     String 형변환
		// String                  ->      byte[] 형변환
		String msg = "안녕하세요. 홍길동입니다. ";
		
		//String msg = "홍";
		byte [] datas = msg.getBytes();
		for (byte b : datas) {
			System.out.printf("[%d]", b);
		} 
		System.out.println();
		
		datas = msg.getBytes("EUC-KR");
		int no = 1;
		for (byte b : datas) {
			//System.out.printf("%d[%d]", no++, b);
			System.out.printf("[%d]", b);
		} 
		System.out.println();
		
		datas = msg.getBytes("UTF-8");
		no = 1;
		for (byte b : datas) {
			//System.out.printf("%d[%d]", no++, b);
			System.out.printf("[%d]", b);
		} 
		System.out.println();

	}

}




