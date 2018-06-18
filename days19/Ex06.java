package days19;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// p 488  환경 변수 읽기 ( getenv() )
		// 환경변수 ? 프로그램 상의 변수가 아니라 운영체제에서
		// 이름과 값으로 관리되는 문자열 정보.
		/*
		String name ="JAVA_HOME";
		String value =  System.getenv(name);
		System.out.println(value);
		*/
		
		// 모든 환경 변수 출력
		Map<String, String> m = System.getenv();
		Set<String> s = m.keySet();
		Iterator<String> ir =   s.iterator();
		while (ir.hasNext()) {
			String k = (String) ir.next();
			System.out.printf("%s - %s\n", k, m.get(k));
		}
		//

	}

}
