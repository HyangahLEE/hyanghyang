package days24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex17 {

	public static void main(String[] args) {
		// int  read(byte [] b, int off, int len);
		// String -> byte [] 형변환
		/*
		String message = "hello world~";
		byte [] b = message.getBytes();
		for (byte c : b) {
			System.out.println(c);
		}
		*/
		
		byte[] b = new byte[100]; // 버퍼
		int readByteNo;
		String pathname = ".\\src\\days24\\BBS_201707141109490060.jpg";
		
				File imgFile = new File(pathname); //
			
		
		try {
			//           is스트림           XXXInputStream(File)
			InputStream is  = new FileInputStream(imgFile);
			// [*][*][][][][*][*][*]  ... [99]
			//                                  is.read(b)
			while(    ( readByteNo = is.read(b, 0, b.length) ) != -1 ) {
				for (int i = 0; i < readByteNo; i++) {
					System.out.println(b[i]);
				}
			}
		} catch (IOException e) { 
			e.printStackTrace();
		}

	}

}



