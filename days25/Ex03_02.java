package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_02 {
	/*
	11366588694 ns
	3390664 bytes 복사 완료!!! 
	= FileCopy END =
	*/
	/*
	65222611 ns
	3390664 bytes 복사 완료!!! 
	= FileCopy END =
	*/
	
	public static void fileBufferedCopy( String sourceFile, String copyFile ) {
		long start = System.nanoTime(); 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		final int BUFFER_SIZE = 1024;
		byte [] buffer = new byte[BUFFER_SIZE];
		 
		// File 클래스 :  파일 또는 디렉토리를 관리할 수있는 클래스
		File sfile = new File(sourceFile);
		try {
			fis = new FileInputStream(sfile );
			fos = new FileOutputStream(copyFile);
			//
			bis = new BufferedInputStream(fis , BUFFER_SIZE);   // 8192 최대 버퍼
			bos = new BufferedOutputStream(fos, BUFFER_SIZE);// 8192
			
			// 
			int readByteNo = 0;
			while (  (readByteNo= bis.read(buffer)) != -1 ) {
				bos.write(buffer, 0, readByteNo);
			}
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				bis.close(); //순서 기억...  바깥닫고
				bos.close();
				
				fis.close(); //안에닫고
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

		fileBufferedCopy(sourceFile, copyFile);

	}

}



