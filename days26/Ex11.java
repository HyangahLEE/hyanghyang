package days26;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex11 {

	public static void main(String[] args)
			                             throws IOException {
		// [ RandomAccessFile 클래스]
		String s = "I Love normal Java";//문자열변수
		String q = "javabook";
		
		String fileName = "random.txt";
		
		try( RandomAccessFile raf = //객체생성. 읽기쓰기.
				 new RandomAccessFile(fileName, "rw")){
			// raf.seek(pos);
			// raf.close();
			// raf.length()
			// raf.getFilePointer()  파일포인터
			raf.writeBytes(s);//선언   //I Love normal Java
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터치시면 계속합니다. ");
		System.in.read(); System.in.skip(2);
		
		try( RandomAccessFile raf =
				 new RandomAccessFile(fileName, "rw")){ 
			long pos = 7; //7위치 찾아서 q쓴다,  //posit 위치.
			raf.seek( pos ); // FilePointer 이동..
			raf.writeBytes(q); //  I Love javabooknormal Java
			
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





