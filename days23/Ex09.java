package days23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex09 {

	public static void main(String[] args) {
		// p 748 Properties 컬렉션 클래스
		// 1. Hashtable의 자식클래스 : Map/동기화처리/ + ?
		// 2. 차이점 )   key/ value  모두      String 제한한 타입.
		// 3. ???.properties 파일
		//    ( 환경 설정 정보 - DB연결정보, 애플리케이션 정보... )
		
		Properties pt = new Properties();
		// 절대경로
		// .    현재 디렉토리
		// ..   상위 디렉토리   ..\\..\\
		// String fileName ="C:\\D\\Class\\JavaClass\\javaPro\\src\\days23\\database.properties";
		// String fileName =".\\src\\days23\\database.properties";
		String fileName ="database.properties";
		try {
			pt.load(new FileReader(fileName ));
			String driver =  pt.getProperty("driver");
			String url =  pt.getProperty("url");
			String username =  pt.getProperty("username");
			String password =  pt.getProperty("password");
			
			System.out.println(driver);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}






