package days25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
	 
	public static void main(String[] args) {
		// 텍스트 파일 복사
		String sourceFile = ".\\src\\days24\\Ex02.java";
		String copyFile = "C:\\Users\\SIST163\\Documents\\Copy_Ex02.java";
		fileCopy(sourceFile, copyFile);

	}

	private static void fileCopy(String sourceFile, String copyFile) {
		long start = System.nanoTime(); 

		int  readByte = 0;

		// File 클래스 :  파일 또는 디렉토리를 관리할 수있는 클래스
		File sfile = new File(sourceFile);

		int readData = 0 ;

		try(   FileReader fr =new FileReader(sfile );
				FileWriter fw =new FileWriter(copyFile) ) {

			// int b = fr.read() -> fw.write(b);
			 
			while( ( readData = fr.read() ) != -1 ) {
				fw.write(readData);
			}
		 
			/*
			// p 1007 참조 char [] buffer 
			int readCharNo = 0;
			char [] buffer = new char[1024];

			// 1024    883
			while(( readCharNo = fr.read(buffer) ) != -1) {
				fw.write(buffer, 0, readCharNo);
			}
			*/
			fw.flush(); // 
			
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
