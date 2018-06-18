package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// p 742  HashMap 컬렉션 클래스 
		//  Key Value
		// Key  동등한 객체 -> hashCode(), equals() 오버라이딩..
		// Key String클래스는 벌써  hashCode(), equals() 오버라이딩되어져 있다.
		// *** 키와 값의 타입은 기본 타입 사용할 수 없다.  /   클래스와 인터페이스 타입만 사용 가능.
		
		// HashMap<String, int> map; 잘못된 선언
		// HashMap<String, Integer> map; 
		
		HashMap  hm = new HashMap();
		hm.put("이석화", 1);
		hm.put("김재곤", 4);
		hm.put("이혜원", 4);
		hm.put("박주영", 1);
		hm.put("김의", 1);
		hm.put("강다예", 1);
		// 
		hm.put("김재곤", 3);
		
		// hm.isEmpty()
		// hm.remove("김재곤")
		// hm.replace(key, value)
		
//     김재곤은 3조
//	    강다예은 1조
//	    key은 value조
		Set  entrySet = hm.entrySet();  // Entry(엔트리==Key+Value)
		Iterator ir = entrySet.iterator();
		while (ir.hasNext()) {
			Entry entry = (Entry) ir.next();
			System.out.printf("%s은(는) %d조\n"
					, entry.getKey(), entry.getValue() ); 
		} 
		
		/*
	    //value	hm.get(key)
		Set ks = hm.keySet();
		Iterator ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.printf("%s은(는) %d조\n", key, hm.get(key));
		} 
		*/
		// 
		// System.out.println( hm.size() ); // 엔트리 갯수  6
		/*
		// 모든 학생명(key)을 출력
		Set ks = hm.keySet();
		Iterator ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.println(key);
		}
		// 모든 팀(value)을 출력
		Collection vc = hm.values();
		ir = vc.iterator();
		while (ir.hasNext()) {
			int value = (int) ir.next();
			System.out.println(value);
		}
		*/
		
		/*
		// 이름(key)을 입력받아서 몇 조 확인 ?
		String name = "김재곤";  // 김재곤    3조
		
		// hm.containsValue(value)
		if( hm.containsKey(name) ) { 
			// value
			// Object -> Integer -> int
			int team = (int) hm.get(name);
			System.out.printf(">%s 은 %d조입니다.\n", name, team);
			
		}else {
			System.out.println("> 존재하지 않는 학생명(key)입니다. ");
		}
		*/
		
		

	}

}
