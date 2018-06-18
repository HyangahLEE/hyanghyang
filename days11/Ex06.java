package days11;

public class Ex06 {            //중요 !!!! 암기!!! 이해!!!

	public static void main(String[] args) {
		// 1차원배열(12)
		int [] m = { 1,2,3,4,5,6,7,8,9,10,11,12 };
		// 출력
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%02d]", m[i]);
		}
		System.out.println();
		// 2차원배열(3행4열)
		int [][] n = new int[3][4];
		for (int i = 0; i < m.length; i++) {
			 n[i/4][i%4] = m[i];
		}
		// 3행 4열 출력
		System.out.println("3행 4열");
		// 2차원배열 -> 1차원    ( 4*i+j )
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("[%02d]",n[i][j]);
			}
			System.out.println();
		}
		
		// 3행4열 -> 4행3열    2차원배열로 변경
		int [][] k = new int[4][3];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				k[(4*i+j)/3][(4*i+j)%3]=n[i][j];
			}
		}
		// 출력
		System.out.println("4행 3열");
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.printf("[%02d]",k[i][j]);
			}
			System.out.println();
		}
		

	}

}
