package days19;

import java.util.Enumeration;
import java.util.Properties;

public class Ex05 {

	public static void main(String[] args) {
		// p 486
		// 시스템 프로퍼티(property) 읽기
		// 시스템 프로퍼티 ? JVM이 시작할 때 자동 설정되는 시스템의 속성값
		// ( 운영체제의 종류 , 자바 프로그램 실행시킨 사용자 아이디, VM 버전,
		//   파일 경로 구분자 등등 )
		// String key?   p 486 표 
		//System.getProperty(key);
		/*
		System.out.println( System.getProperty("os.name")  );
		System.out.println( System.getProperty("user.name")  );
		System.out.println( System.getProperty("user.name")  );
		System.out.println( System.getProperty("java.version")  );
		System.out.println( System.getProperty("key")  );
		System.out.println( System.getProperty("key")  );
		*/
		
		// 모든 시스템 프로퍼티 출력......
		Properties   p =  System.getProperties();  // 모든 시스템 프로퍼티들을 반환하는 메서드
		Enumeration en= p.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = (String) p.get(key);
			System.out.printf("%s - %s\n",key,value);
		}

		
	}

}






