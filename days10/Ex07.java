package days10;

public class Ex07 {

	public static void main(String[] args) {
		// 정렬( Sort )
		// 오름차순 정렬( asc ) 기본
		//  0,1,2,3,4,~
		//  a,b,c,d~z
		//  ㄱ,ㄴ,   ㅎ
		// 내림차순 정렬( desc )
		// 4,3,2,1,0~
		// z,....a
		// 힣...   
		
		// ***   [초성검색] - ㅂㅅ 검색 +  담배심부름.....
		/*
		 * 
		 * 1. 삽입법 : *삽입정렬, [쉘정렬]
		 * 2. 선택법 : *선택정렬, [힙정렬]
		 * 3. 교환법 : 1. **버블정렬, 힙정렬
		 * 4. 병합법 : *병합정렬
		 * 5. 기타    : 기수정렬
		 * 
		 * */

		// 오름차순(asc) 정렬
		int [] m = { 3,5,2,4,1 };
		dispM(m);
//		bubbleSort(m); // 버블정렬**  ==> 1,2,4,5,3
		selectionSort(m);  // 선택정렬 --> 0,1 / 0,2 / 0,3 / 0,4 비교  (자리하나 지정해서 순서대로 비교)
		dispM(m);
	}

	private static void selectionSort(int[] m) {    //선택정렬
		// 0-1  0-2  0-3  0-4
		// 1-2  1-3  1-4
		// 2-3  2-4
		// 3-4
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.printf("%d-%d   ", j-1, j);
				if( m[j-1] > m[j]) {
					System.out.print("***");  //자리바꿈 일어나는회수
				   int temp = m[j-1];
				   m[j-1] = m[j];
				   m[j] = temp;
				}
				dispM(m);
			}
		}
			
		}
	
	private static void bubbleSort(int[] m) {
		// i=1
		// j=1,2,3,4
		// i=2
		// j=1,2,3 
		
		// 0-1  1-2  2-3  3-4  **         1
		// 0-1  1-2  2-3
		// 0-1  1-2
		// 0-1
		
		for (int i = 1; i <=4 ; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.printf("%d-%d   ", j-1, j);
				if( m[j-1] > m[j]) {
					System.out.print("***");  //자리바꿈 일어나는회수
				   int temp = m[j-1];
				   m[j-1] = m[j];
				   m[j] = temp;
				}
				dispM(m);
			}
			//System.out.println();
		}
	}

	private static void dispM(int[] m) {
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d ", m[i]);
		}
		System.out.println();
		
	}

}