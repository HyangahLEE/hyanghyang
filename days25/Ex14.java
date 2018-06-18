package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex14 {

	public static void main(String[] args) throws IOException {
		//[Systemin(InputStream)]->[ InputStreamReader]->라인 보조트림.
				
		InputStream 	is =  System.in;  
		Reader isr = new InputStreamReader(is);  
		BufferedReader br = new BufferedReader(isr);
		
		//BufferedReader br = new BufferedReader(
		//		new InputStreamReader(System.in));
		String line = null; 		
		line = br.readLine();  // 키보드 -> 문자스트림 -> 라인+버퍼		
		System.out.println(line );
		
		
		
		
	}

}




