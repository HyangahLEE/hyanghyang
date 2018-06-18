package days25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;

public class Ex05 {

	public static void main(String[] args) {
		// p 1002 flush() , close() 메소드
		// p 1002 Reader(문자스트림)  <-> InputStream(바이트스트림)
		//    1. FileReader , BufferedReader , InputStreamReader 등등
		//    2. read() , read(char [] ) , read(char[], int off, int len )
		
		String fileName = ".\\src\\days24\\Ex02.java";
		InputStream in = System.in;
		PrintStream out = System.out;
		 
		int readData = 0;
		boolean flag = true;
		try ( Reader reader = new FileReader(fileName ) ){
			//    int [][][8][8] =    [8][8]
			while(   (readData=reader.read() ) != -1 ) {
				// System.out.println(readData);
				// int -> char 형변환				  
				out.print((char)readData); // -32768~32767
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}
		System.out.println("END");
	}

}
