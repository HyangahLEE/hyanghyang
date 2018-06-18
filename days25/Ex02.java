package days25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) {
		// write(int i)  
		OutputStream os = null;
		// 현재디렉토리 -             C:\D\Class\JavaClass\javaPro  == test.txt
		String name = "test.txt";  // 현재디렉토리에  파일명 저장
		try {
			//                                                  boolean append
			//os =  new FileOutputStream(name, true);  // 예외처리...
			os =  new FileOutputStream(name);  // 예외처리...
			byte [] data = "\nhello world~".getBytes(); // String -> byte[] 변환
			
			// Ex02.java
			// 1byte -> 파일 쓰지(저장)
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]); // IOException 예외 처리...
			}
			
			os.flush(); // 
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();  // 예외 처리...
			} catch (IOException e) { 
				e.printStackTrace();
			}  
		} // finally
		
		System.out.println(" = END = ");
		
		

	}

}
