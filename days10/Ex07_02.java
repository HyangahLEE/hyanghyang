package days10;

public class Ex07_02 {    //다시 보기

	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 } ;
		dispM(m);
		bubbleSort(m);
		dispM(m);
	}

	private static void bubbleSort(int[] m) {
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 5-i; j++) {
					System.out.printf("%d-%d   ",  j-1 , j);
					if ( m[j-1] > m[j] ) {
					    System.out.print("***");
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
		
