package days11;

public class Ex03 {

	public static void main(String[] args) {
		// 삽입정렬 ( Insertion Sort )      //뒤로 밀고 그자리에 집어넣는 코딩 로직 찾아보기...
		int [] m = { 3,5,2,4,1 };    //  1,2, 0,1 =3
		
		dispM(m);
		insertionSort01(m);
		insertionSort02(m);
		dispM(m);
		
		
	}

	private static void insertionSort02(int[] m) {
		
		
		
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]", m[i]);
		}
		System.out.println();
	}

	private static void insertionSort01(int[] m) {
		for (int i = 1; i <m.length; i++) {
			for (int j = i-1;  j >= 0  ; j--) {
				System.out.printf("%d>%d",j,j+1);
				if ( m[j]> m[j+1] ) {    //자리바꿈
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				dispM(m);
			}
			System.out.println();
		}
		
	}
}
