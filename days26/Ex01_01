package days26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01_01 {

	public static void main(String[] args) {
		// p 1037 기본 타입 입출력 보조 스트림
		//          Data[InputStream] / Data[OutputStream]
		//          >     바이트 스트림
		
		// 예) 한 학생의 이,국,영,수,총,평,성  파일 저장..
		String name = "홍길동";
		int kor = 90, eng = 88, mat = 78;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true ;   // true 남자  false 여자
		// 위의 데이타를 파일(student.txt)로 저장
		// (FileWriter) 또는 FileOutputStream 선택
		boolean append = true; //
		String fileName = "student.txt";
		
		try( FileOutputStream fos = new FileOutputStream(fileName, append)) {
			// fos.write(byte [] b); fos.write(b);
			String info = String.format(
					"%s,%d,%d,%d,%d,%.2f,%b\r\n"
					, name, kor,eng, mat,tot,avg, gender);
			byte [] b = info.getBytes();
			fos.write(b);
			fos.flush();
			System.out.println("> 한 학생 정보 저장 완료!!!");
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		
		/*
		try( FileWriter fw = new FileWriter(fileName , append) ){
			// fw.write(str); // String, boolean, double X  (char[], String )
			String info = String.format(
					"%s,%d,%d,%d,%d,%.2f,%b\r\n"
					, name, kor,eng, mat,tot,avg, gender);
			fw.write(info);
			System.out.println("> 한 학생 정보 저장 완료!!!");
		} catch (IOException e) { 
			e.printStackTrace();
		}
        */

	}

}
