package days23;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student{
	
	int sno;
	String name;
	
	Student(){}
	Student(int sno, String name){
		this.sno = sno;   // 3 + 4
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student s = (Student) obj;
			if( this.sno == s.sno)  return true;
			else return false;
		} 
		return false;
	}
	
	@Override
	public int hashCode() { 
		return this.sno;
	}
	
	
	
}

public class Ex08 {

	public static void main(String[] args) {
		// 제네릭 컬렉션 클래스 p 744 ~ 745
		// 1. Map 계열      Entry(key,Value) 
		Hashtable<Student, Integer> ht = new Hashtable<>();
		ht.put(new Student(1, "이석화"), 95);
		ht.put(new Student(2, "김재곤"), 90);
		System.out.println( ht.size() );  // 2
		
		ht.put(new Student(1, "이혜원"), 78);  // hashCode(), equals()
		System.out.println( ht.size() );  // 3
		
		// 학번 이름  점수  출력..  entrySet()
		// 1   홍길동   90
		// 2   김길동   94
		// Ctrl + Shift + O
		Set<Entry<Student, Integer>>  set =  ht.entrySet();
		Iterator<Entry<Student, Integer>> ir=  set.iterator();
		
		while (ir.hasNext()) {
			Entry<Student, Integer> entry 
			          = (Entry<Student, Integer>) ir.next();
			Student s =  entry.getKey();
			int score = entry.getValue();
			// Map 계열  Entry    순서X
			System.out.printf("%d\t%s\t%d\n", s.sno, s.name, score);
		}
		/*
		ht.clear();
		ht.get(key);
		ht.entrySet();
		ht.put(key, value);
		ht.size();
		ht.clone();
		ht.contains(value);
		ht.containsKey(key);
		ht.containsValue(value);
		ht.elements();
		ht.isEmpty();
		ht.keys();
		ht.putAll(t);
		ht.remove(key);
		ht.replace(key, value);
		*/
		
		
	}

}





//나시 조끼
//		http://smartstore.naver.com/tbuying2/products/2946904376?NaPm=ct%3Djhvf2dgw%7Cci%3D7c3fc51cccada436114e4743f9a22ef12c39dbbb%7Ctr%3Dslsl%7Csn%3D592948%7Cic%3D%7Chk%3Da56bb44b7a2145b01d77aacc1134d91a13efca30