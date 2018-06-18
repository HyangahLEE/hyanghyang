package days26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// p 1037 기본 타입 입출력 보조 스트림
		//          Data[InputStream] / Data[OutputStream]
		//          >     바이트 스트림
		
		// 예) 한 학생의 이,국,영,수,총,평,성  파일 저장..
		// Student 클래스 s1 = new Student();
		// 읽기<- s1 객체  -> 저장
		String name = "감자바";
		int kor = 90, eng = 88, mat = 78;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true ;   // true 남자  false 여자
		// 위의 데이타를 파일(student.txt)로 저장
		// (FileWriter) 또는 FileOutputStream 선택
		boolean append = true; //
		String fileName = "student.txt";
		
		/*
		try( FileOutputStream fos = 
				new FileOutputStream(fileName, append)) {
			// fos.write(byte [] b); fos.write(b);
			String info = String.format(
					"%s,%d,%d,%d,%d,%.2f,%b\r\n"
					, name, kor,eng, mat,tot,avg, gender);
			byte [] b = info.getBytes(); // String -> byte [] 변환
			fos.write(b);
			fos.flush();
			System.out.println("> 한 학생 정보 저장 완료!!!");
		} catch (Exception e) { 
			e.printStackTrace();
		}
		*/		
		 
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
        

	}

}








/*
 * p 994 
 * 1. IO
 * 2. 스트림( Stream ) 단방향
 * 3. 입력 스트림 : 프로그램 기준으로 도착지
 *     출력 스트림 : 프로그램 기준으로 출발지
 * 4. java.io 패키지의 주요 클래스
 *    ㄱ. File 클래스           : 파일, 디렉토리 
 *    ㄴ. Console 클래스    : 콘솔( 명령프롬프트 )
 *    
 *    문자스트림   : 2byte, 문자 또는 문자열
 *    ㄹ. Reader / Writer 추상클래스
 *    바이트스트림 : 1byte, 멀티미디어, 그림, 실행파일 등등
 *    ㄷ. InputStream / OutputStream 추상클래스 
 *    
 *    ㅁ. 파일 읽기/쓰기
 *       ㄱ. FileReader / FileWriter
 *       ㄴ. FileInputStream / FileOutputStream
 *    
 *    ㅂ.  InputStream    System.in
 *          PrintStream     System.out
 *             
 *    ㅅ. 보조 스트림
 *         InputStreamReader( Systm.in );
 *         OutputStramWriter()  책 예제 코딩.
 *    ㅈ. 이중 보조 스트림
 *         버퍼기능(성능향상) + 라인단위
 *         BufferedReader / BufferedWriter
 *         BufferedInputStream / BufferedOutputStream
 *         
 * 5. InputStream
 *     read()  read()  read()
 * 6. OutputStram
 *     write() write() write()
 * 7. flush()   의미 파악
 *     close()         
 * 8. Reader / Writer   p 1009  
 * 9. System.in  , System.out  설명  1015
 * 10. Scanner  클래스  p 1017
 *  키보드( 표준 입력 바이트 스트림 ) -> ??? 
 *  = new Scanner(System.in);      
 *  =            new Scanner(파일객체);
 *  =            new Scanner(문자열).useDi  ("\\s*fish\\s*");
 * 11. p 1018 File
 * 12
 *    = new BufferedReader (new InputStreamReader(System.in));
 *     
 * */