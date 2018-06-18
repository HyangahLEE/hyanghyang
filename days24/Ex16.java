package days24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex16 {

	public static void main(String[] args) {
		// int read(byte[] b) 
		// InputStream is = System.in;
		byte[] b = new byte[100]; // 100 바이트씩 읽어들이자..
		int readByteNo;
		String pathname = ".\\src\\days24\\BBS_201707141109490060.jpg";
		// 이미지 크기 ? 
		// 파일의 대한 정보 中  이미지크기 ? XXX byte
		File imgFile = new File(pathname);
		long fileLength = imgFile.length();
		// [D],S,Mformat
		//System.out.printf("> 이미지 파일  : %d bytes\n", fileLength );
		
		// [][][][][][][]...[99]
		try {
			InputStream is  = new FileInputStream(imgFile);
			
			while(    ( readByteNo = is.read(b) ) != -1 ) {
				for (int i = 0; i < readByteNo; i++) {
					System.out.println(b[i]);
				}
			}
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
		/*
		System.out.print("> 입력하세요 ? ");
		InputStream is = System.in;
		
		byte[] b = new byte[100];
		// [0][][][][][][] ... [99]
		try {
			int readByteNo = is.read(  b );
			
			for (int i = 0; i < readByteNo; i++) {
				System.out.println( b[i] );
			}
			// 입력받은 데이터 -> 문자열 변환.
			//  "kenik lee"
			// byte []     ->  String 형 변환 ?
			String data = new String(b, 0, readByteNo-2);
			System.out.println(data);
			
			
		} catch (IOException e) { 
			e.printStackTrace();
		}
		*/

	}

}
