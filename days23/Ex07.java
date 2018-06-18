package days23;

import java.util.HashMap;
import java.util.Hashtable;

public class Ex07 {

	public static void main(String[] args) {
		//Hashtable<Key타입, Value타입>
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		/*
		Hashtable ht = new Hashtable();
		Object   value =  ht.get("이석화");
		int team = (int)value;
		System.out.println(team);
		*/
		// key  학생명   value  1조
		ht.put("이석화", 1);
		// ht.put(4,"김재곤"); 컴파일 오류 발생
		ht.put("김재곤", 4);
		
		// 
		System.out.println( ht.size() );  // 2
		
		int team = ht.get("이석화");
		System.out.println(team);
		

	}

}
