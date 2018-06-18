package days11;


public class Ex04 {

	public static void main(String[] args) {
		// 1차원 배열
		int [] m = {1,5,3,8,2,7,6,4};
		// 2차원 배열
		int [][] n = new int[2][4];
		
		// 1차원 배열의 값을 2차원 배열 채워넣기.
		// 열(i)                      행/열
		// 0                     0 0                i/2(열갯수)    i%2
		// 1                     0 1
		// 2                     1 0
		// 3                     1 1
		// 4                     2 0
		// 5                     2 1
		// 6                     3 0
		// 7                     3 1
		for (int i = 0; i < m.length; i++) {
			// System.out.println( m[i] );
			n[i/4][i%4] = m[i];
		}
		
		// 2차원 배열 출력
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("[%d]", n[i][j]);
			}
			System.out.println();
		}

	}

}
