package days23;

import java.util.LinkedHashSet;

public class Ex04 {

	public static void main(String[] args) {
		// 로또 번호  발생 -> HashSet   중복X, 순서X
		// [ 중복X , 순서O ] LinkedHashSet 컬렉션 클래스
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("이석화");
		hs.add("김재곤");
		hs.add("이혜원");
		Ex02.dispSet(hs);  // 순서유지O(List):  이석화/김재곤/이혜원/
		hs.add("이혜원");
		Ex02.dispSet(hs);  // 중복허용X(Set): 이석화/김재곤/이혜원/
		
		hs.add(null);
		Ex02.dispSet(hs);  // null 허용O : 이석화/김재곤/이혜원/null/
		
		hs.add(null);
		Ex02.dispSet(hs);  // null 중복 허용 X
		
		
	}

}
