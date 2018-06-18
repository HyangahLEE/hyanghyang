package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class Ex16 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days24\\Ex02.java"; // 문자 스트림
		/*
		문자스트림    : [FileReader]/FileWriter
		바이트스트림 : FileInputStream/FileOutputStream
		*/
		
		// 화면 출력
		PrintStream ps = System.out;
		// 파일 출력(저장)
		//FileWriter  fw ;
		// 라인단위 처리할 수 있는 기능있는 보조스트림 : BufferedReader/
		//                                                        BufferedWriter
		//                                                     라인단위로 처리    readLine()
		
		try(
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)
				){
			
				String line = null;
				int lineNumber = 1;
				while(   (line=br.readLine() ) != null ) {
					System.out.printf("%d : %s\n", lineNumber++, line);
				}
		
			
		}catch(Exception e) {
			
		}
		 
		
		/*
		try(  FileReader fr = new FileReader(fileName) ){
			int readChar ; // [][][X][X] <- 2바이트
			  while(   ( readChar = fr.read() ) != -1 ) {
				  //p{
				   * s.printf("%c", (char)readChar);  // 13, 10
				  ps.println(readChar);
			  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
