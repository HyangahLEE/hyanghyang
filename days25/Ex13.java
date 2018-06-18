package days25;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		// p 1028 보조 스트림.
		// 1. [다른 스트림]과 연결되어 여러 가지 [편리한 기능]을 제공해 주는 스트림
		// 2. 필터(filter) 스트림 == 보조 스트림
		// 3. 보조 스트림의 일부가 FilterInputStream, FilterOutputStream의 자식
		//    클래스이기 때문에  필터 스트림이라고 부르기고 한다....
		// 4. 보조 스트림은 혼자서(자체적으로) 입출력 할 수 없는 스트림...
		
		//System.out.print("> 한 문자 입력 ? ");  // a 엔터
		// 스트림     [97][13][10]
		//               1    1     1 바이트
		/*
		InputStream  is =  System.in;  // 바이트 스트림( 입력 ), 1byte
		int n = 0;
		try {
			n = is.read();  // 'a'   ASCII  97
		} catch (IOException e) { 
			e.printStackTrace();
		}
		System.out.printf("%d - %c\n", n, (char)n);
        */
		
		//  키보드 -> InputStream(System.in) -> 문자 변환
		// InputStreamReader 보조클래스( InputStream )
		
		InputStream 	is =  System.in;  // 주 업무 스트림   바이트 ( 1byte )
		Reader isr = new InputStreamReader(is); // 바스 -> 문스  :  문자처리
		int readCharNo;
		char [] cbuf = new char[100];  // 임시 버퍼
		 // EOF
		 while( (readCharNo = isr.read(cbuf)) !=-1 )
		 {
			 String line = new String(cbuf, 0, readCharNo );
			 System.out.println(line);
		 }
		 isr.close();
		
		
		
	}

}




