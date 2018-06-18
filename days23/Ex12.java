package days23;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex12 {

	public static void main(String[] args) {
		// TreeSet 영어 단어 무작위로 저장 후 c~f 사이 범위의 
		// 영어 단어 검색하는 예제..
		
		TreeSet<String> set = new TreeSet<>();
		set.add("apple");
		set.add("forever");
		set.add("description");
		set.add("ever");
		set.add("zoo");
		set.add("base");
		set.add("guess");
		set.add("cherry");
		
		//                    c<=    <=f
		NavigableSet<String> rangeSet = 
				set.subSet("c" ,true ,"f", true);
		
		for (String word : rangeSet) {
			System.out.println(word);
		}

	}

}
