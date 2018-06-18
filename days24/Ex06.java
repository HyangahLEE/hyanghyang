package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		// p 654 제네릭
		// 1. JDK 5.0 추가 새로운 기능(기술)
		// 2. 잘못된 타입이 사용될 수 있는 문제를 
		//                    컴파일 과정에서 제거할 수 있다.
		// 3. 컬렉션, 람다식, 스트림, NIO에서 널리 사용된다.( 확실히 이해 )
		// 4. 클래스, 인터페이스, 메소드 제네릭을 사용할 수 있다. 
		// 5. 제네릭 장점
		//     ㄱ. 컴파일 시 강한 타입 체크 가능
		//     ㄴ. 타입(형) 변환 X
		
		ArrayList<String> nameList = new ArrayList<>();
		// ArrayList nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("감자바");
		nameList.add("이석화");
		
		//ㄴ. 타입(형) 변환 X
		String name = nameList.get(1);
		System.out.println(name);
		/*
		// ArrayList nameList = new ArrayList();
		// Object -> String 타입(형) 변환
		String name =  (String) nameList.get(1); 
		System.out.println(name);
		*/
		/*
		Iterator ir = nameList.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		*/
		// nameList.add(90);  // ㄱ. 컴파일 시 강한 타입 체크 가능

	}

}





