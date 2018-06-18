package days09;

import java.util.ArrayList;

public class Ex08 {

	public static void main(String[] args) {
		// 컬렉션 
		ArrayList m = new ArrayList(); 
		
		// int [] m = { 5, 10, 15, 3, 0 };
		m.add(5);
		m.add(10);
		m.add(15);
		m.add(3); 
		System.out.println( m );
		
		m.add(3, 100);
		System.out.println( m );
		
		// Type mismatch: 
		// cannot convert from 요소(element) type Object to int
		/*
		for (Object n : m) {
			System.out.println( n );
		}
		*/
		/*
		System.out.println( m );
		
		m.remove(2);  // 삭제

		System.out.println( m );
       */
	}

}
