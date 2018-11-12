package days18;
 

import java.util.ArrayList;
import java.util.Date;

import days17.Temp;

public class Ex14 {

	public static void main(String[] args) {
		Temp obj = new Temp();
		System.out.println(obj.hashCode() );  // 2018699554
		//           객체의 문자 정보 ?
		// full클래스명    @hashcod(16진수)
		// days17.Temp@7852e922
		System.out.println(obj.toString());
		
		Date now = new Date();
		// Fri May 25 15:32:54 KST 2018
		System.out.println(now.toString());
		
		ArrayList  list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		// [1, 2, 3]
		System.out.println(list.toString());
		
		// String name = null;
		// System.out.println(name);
		// System.out.println(name.toString());

	}

}
