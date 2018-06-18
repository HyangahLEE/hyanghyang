package days26;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex11 {

	public static void main(String[] args)
			                             throws IOException {
		// [ RandomAccessFile 클래스]
		String s = "I Love normal Java";
		String q = "javabook";
		
		String fileName = "random.txt";
		
		try( RandomAccessFile raf =
				 new RandomAccessFile(fileName, "rw")){
			// raf.seek(0);
			raf.writeBytes(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치시면 계속합니다. ");
		System.in.read(); System.in.skip(2);
		
		try( RandomAccessFile raf =
				 new RandomAccessFile(fileName, "rw")){ 
			long pos = 7;
			raf.seek( pos ); // FilePointer 이동..
			raf.writeBytes(q); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치시면 계속합니다. ");
		System.in.read(); System.in.skip(2);
		
		try( RandomAccessFile raf =
				 new RandomAccessFile(fileName, "rw")){  
			raf.seek(2);  // FilePointer 이동..
			String line =  raf.readLine();
			System.out.println(  line );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}





