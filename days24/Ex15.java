package days24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex15 {

	public static void main(String[] args) {
		// p 996 InputStream
		//          바이트 스트림(입력), 최상위 부모클래스
		//          바이트, 바이트배열, 정수
		//          FileInputStream, BufferedInputStream
		//              , DataInputStream 등등
		

		// int read()
		// int read(byte [] b)
		// int read(byte [] b, int off, int len)
		

		// 키보드 -> 바이트 입력 스트림 OPEN
		/*
		InputStream  is = System.in;
		
		try {
			int  n =  is.read();  // [97][13][10]
			System.out.printf("%1$d - %1$c\n", n);
		} catch (IOException e) { 
			e.printStackTrace();
		}
		*/
		
		// 그림파일 -> 출력...
		// BBS_201707141109490060.jpg 
		// 절대경로  C:\D\Class\JavaClass\javaPro
		// 상대경로 .
		// 절대경로 C:\D\Class\JavaClass\javaPro\src\days24
		// 상대경로 .\src\days24
		String name = ".\\src\\days24\\BBS_201707141109490060.jpg";
		try {
			InputStream is  = new FileInputStream(name);
			int readByte;
			// 파일의 끝을 만나면 read()메소드는 -1을 반환한다. 
			while ( ( readByte= is.read() ) != -1 ) {
				System.out.println(readByte); // -128~127 정수 byte
				// 네트워크 전송... ( 파일 전송 )
			} 
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}

}



