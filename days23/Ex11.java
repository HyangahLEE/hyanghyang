package days23;

import java.util.TreeSet;

public class Ex11 {

	public static void main(String[] args) {
		// p 750 검색 기능을 강화시킨 컬렉션...
		// 1. TreeSet       / TreeMap
		//           Set계열  /       Map계열
		
		// Key
		// Value
		// Eelement
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int score = 0;
		score = scores.first();
		System.out.println(score);
		
		score = scores.last();
		System.out.println(score);
		
		// 
		score = scores.lower(95);  // 바로 아래 객체를 리턴
		System.out.println(score);		
		
		score = scores.higher(95); // 바로 위 객체를 리턴
		System.out.println(score);
		
		// 
		score = scores.lower(95);  // 바로 아래 객체를 리턴
		System.out.println(score);		
		
		score = scores.floor(95); // 바로 위 객체를 리턴
		System.out.println(score);
		 	
		
		score = scores.ceiling(85); // 바로 위 객체를 리턴
		System.out.println(score);

		// 
		System.out.println("==============");
		while( !scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score);
		}
	}

}




