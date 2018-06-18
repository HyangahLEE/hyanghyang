package days25;

import java.io.FileOutputStream;

public class Ex04 {

	public static void main(String[] args) {
		String name = "ex04_test.txt";
		// p 1001 write(byte [] b) 
		try(  FileOutputStream fos = new FileOutputStream(name )  ){
			byte [] data = "ABC".getBytes();
			fos.write(data);  // 버퍼  -> 출력
			fos.flush();  
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
		

	}

}
