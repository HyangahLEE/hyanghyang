package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07_02 {
	/*
	5545165 ns
	1907 bytes 복사 완료!!! 
	= FileCopy END =
	*/
	/*
	3973709 ns
	1907 bytes 복사 완료!!! 
	= FileCopy END =
     */
	
	 
	public static void main(String[] args) {
		// 텍스트 파일 복사
		String sourceFile = ".\\src\\days24\\Ex02.java";
		String copyFile = "C:\\Users\\SIST163\\Documents\\Copy_Ex02.java";
		fileBufferedCopy(sourceFile, copyFile);

	}

	private static void fileBufferedCopy(String sourceFile, String copyFile) {
		long start = System.nanoTime(); 

		int  readByte = 0;

		// File 클래스 :  파일 또는 디렉토리를 관리할 수있는 클래스
		File sfile = new File(sourceFile);

		int readData = 0 ;

		try(   FileReader fr =new FileReader(sfile );
				FileWriter fw =new FileWriter(copyFile);
				BufferedReader br = new BufferedReader(fr, 1024);
				BufferedWriter bw = new BufferedWriter(fw, 1024)
				) { 
			int readCharNo = 0;
			char [] cbuf = new char[1024]; 
			while( ( readCharNo = br.read(cbuf) ) != -1) {
				bw.write(cbuf, 0, readCharNo);
			} 
			 
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} 

		long end = System.nanoTime();
		System.out.println( (end-start) + " ns");
		// DecimalFormat 클래스 사용해서 세 자리마다 콤마 출력
		System.out.println( sfile.length() +" bytes 복사 완료!!! " );
		System.out.println("= FileCopy END =");

	}

}











/*
int readCharNo = 0;
while(  ( readCharNo = fr.read( buffer) )!= -1  ) {
	fw.write(buffer, 0, readCharNo);
}
 */
