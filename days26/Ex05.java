package days26;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex05 {

	public static void main(String[] args) {
		// p 1039 프린터 보조 스트림
		// p 1040 
		// PrintStream(바)  , Print[Writer]( 문 )
		// PrintStream System.out;  ***
		String fileName = "file.txt"; 		
		try (FileOutputStream out = new FileOutputStream(fileName );
				PrintStream ps = new PrintStream(out)){
			ps.println("[보조 스트림]");
			ps.print("마치 ");
			ps.println("프린터가 출력하는 것 처럼");			
			ps.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
