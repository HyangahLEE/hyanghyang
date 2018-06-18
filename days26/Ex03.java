package days26;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) {
		// p 1037 기본 타입 입출력 보조 스트림
		//          Data[InputStream] / Data[OutputStream]
		//          >     바이트 스트림

		// 예) 한 학생의 이,국,영,수,총,평,성  파일 저장..
		String name = "감자바";
		int kor = 90, eng = 88, mat = 78;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true ;   // true 남자  false 여자
		
		boolean append = true; //
		String fileName = "score.dat";  
		
		try( 
				FileOutputStream out = new FileOutputStream(fileName, append);
				DataOutputStream dos = new DataOutputStream(out) ) {
			    // writeXXX()
			    dos.writeUTF(name);
			    dos.writeInt(kor);dos.writeInt(eng);dos.writeInt(mat);
			    dos.writeInt(tot);
			    dos.writeDouble(avg);
			    dos.writeBoolean(gender);
			    
			    System.out.println("> 한 학생 정보 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}




