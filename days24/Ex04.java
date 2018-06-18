package days24;

public class Ex04 {
	public static void main(String[] args) {
		// 윈 +  R  [ services.msc ]
		// p 771 동기화된 컬렉션.
		// p 773 병렬 처리를 위한 컬렉션.
		
		// ArrayList에서 객체를 삭제하면 삭제된 위치는 비어있다. X
		
		//      0      1    2     3
		//list [10][200][3]
		//  for문     3 요소 제거
		/*
		for( int i =0 ;  i<= 3; i++) {
	        (list.get(i) == 3 )  제거
		}
		   i =0   10==3 X
		   i = 1  3==3
		   i = 2  200 ==3
		*/
		
	}
}





