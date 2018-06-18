package days23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import days13.Point;

public class Ex02 {

	public static void main(String[] args) {
		// p 736 Hash[Set] 
		// Set  set = new HashSet();
		// *** 동일한 객체 ?  [1] hashCode() -> equals() -> 동일한 객체 저장X
		
		HashSet hs = new HashSet();
		
		hs.add("이석화");
		hs.add("김재곤");
		hs.add("이혜원");
		hs.add("박주영");
		hs.add("김의");
		hs.add("강다예");
		// hs.add("박주영");
		
		// 모든 이름을 출력.... iterator
		// 저장된 순서대로 출력 안됨.( 특징 )
		dispSet(hs);		
		// 김재곤 자퇴
		hs.remove("김재곤");		
		dispSet(hs);
		
		System.out.println( hs.contains("김재곤") ); // false
		
		hs.clear(); // 모든 요소 (Element) 삭제
		
		
		
		/*
		HashSet hs = new HashSet();
		
		Point p1 = new Point(1, 2);		
		hs.add(p1);
		System.out.println( hs.size() ); 
		hs.add(p1); // 동일한 객체 저장X  true hashCode()
		System.out.println( hs.size() );		
		Point p2 = new Point(1, 2);		
		// 2018699554 / 1311053135
		System.out.println(p1.hashCode() +" / " + p2.hashCode());
		hs.add(p2);		
		System.out.println( hs.size() );
        */
	}

	public  static void dispSet(HashSet hs) {
		Iterator ir = hs.iterator();
		while (ir.hasNext()) {
			//String name = (String) ir.next();
			Object name = (Object) ir.next();
			System.out.print(name+"/");
		}
		System.out.println();
	}

}



