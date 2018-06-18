package days25;

import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		// p 1007 
		// write(char [])
		// write(char [], int off, int len)
		
		// p 1008 FileWriter(문자스트림) <--> FileOutputStream
		String message = "안녕하세요!!!\r\n감자바 입니다. ";
		String fileName = "ex06_test.txt";
		// 문자열(String) -> 파일 저장
		try(FileWriter fw = new FileWriter(fileName )){
			
			fw.write(message);
			
			fw.flush(); // 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("END");
	}

}
