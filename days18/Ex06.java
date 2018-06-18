package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		// p 438 자동 리소스 닫기
		// JDK 7 (  try~ with ~ resources )
		// ? 예외 발생 여부와 상관없이 사용했던 리소스 객체( 파일스트림,
		//   서버 소켓, 각종 채널 )의 close() 메소드를 호출해서
		//   안전하게 리소스를 닫아주는 try 블록
		
		// SIST_강남_김수지_20180514(월)_조편성01.txt
		//    ( 파일 읽어서 라인단위로 출력 )
		
		FileReader fr = null;         // 파일 읽기 위한 객체
		BufferedReader br = null; // 라인 단위 처리... 
		String fileName = "C:\\D\\Test\\20180525(금)\\■ 수업자료.txt";
		int lineNumber = 1;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			//String line = br.readLine();
			//System.out.printf("%d : %s",lineNumber, line);
			String line;
			while((line = br.readLine())!= null) {
				System.out.printf("%d : %s\n",lineNumber++, line);
			}
			
		} catch (Exception e) { 
			
		} finally {
			try {
				fr.close(); //  fr 객체가 NullPointerException 이다.
				br.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}

	}

}


