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
		//이미지 크기?
				//파일의 대한 정보 중 이미지크기 ? XXX byte
				File imgFile = new File(pathname);
				long fileLength = imgFile.length();
				// format  ( 데이터, 심플데이터, 데시몰포멧 )
				//System.out.printf(" > 이미지 파일 : %d bytes\n" , fileLength );
		
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



