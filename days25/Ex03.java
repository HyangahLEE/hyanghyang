package days25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	
	public static void fileCopy( String sourceFile, String copyFile ) {
		long start = System.nanoTime(); 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int  readByte = 0;
		
		// File 클래스 :  파일 또는 디렉토리를 관리할 수있는 클래스
		File sfile = new File(sourceFile);
		try {
			fis = new FileInputStream(sfile );
			fos = new FileOutputStream(copyFile);
			while(( readByte = fis.read() ) != -1) {
				// System.out.println(readByte);
				fos.write( readByte );
			}
			fos.flush();
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
		
		long end = System.nanoTime();
		System.out.println( (end-start) + " ns");
		// DecimalFormat 클래스 사용해서 세 자리마다 콤마 출력
		System.out.println( sfile.length() +" bytes 복사 완료!!! " );
		System.out.println("= FileCopy END =");
	}

	public static void main(String[] args) {
		String sourceFile = "C:\\Program Files\\EditPlus\\editplus.exe";// args[0];
		String copyFile   = "C:\\Users\\SIST163\\Documents\\editplus_copy.exe";

		fileCopy(sourceFile, copyFile);

	}

}



