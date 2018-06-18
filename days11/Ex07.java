package days11;

public class Ex07 {

	public static void main(String[] args) {
		int [][] m = new int[5][5];
		//fillM01(m);
		//fillM02(m);
		//fillM03(m);
		// 마방진....
		magicSquare(m);
		
		dispM(m);
	}

	private static void fillM03(int[][] m) {
		//1.
		for (int i = 0, n=1 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][i%2==0?j:4-j] = n++;
				 
				/*
				if( i % 2 ==0 )  m[i][j] = n++ ; 
				else                 m[i][j] = (i+1)*5 - j;
				*/
//m[i][j] = ( i % 2 ==0 ) ?n++:(i+1)*5 - j;
				//i=1   10   (i+1)*5
				//i=3   20
			} 
		}
		// 2.
	}

	private static void fillM02(int[][] m) {
		// 0 0    4 4
		// 0 1    4 3
		// 0 2    4 2
		for (int i = 0, n=1 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[4-i][4-j] = n++ ; 
			} 
		}
		
		/*
		for (int i = 0, n=25 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[i][j] = n-- ; 
			} 
		}
		*/
	}

	private static void fillM01(int[][] m) {
		// i=0  j=0,1,2,3,4
		// i=1  j=0,1,2,3,4
		// i=2  j=0,1,2,3,4
		// i=3  j=0,1,2,3,4
		for (int i = 0, n=1 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[i][j] = n++ ; 
			} 
		}
	}
	
	
 
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		} 
		
		//int  [] m ;
		//int m [];
	}
 
	
	private static void magicSquare(int[][] m) {
		/* 1.  row    col
		 * 2.  row=0   col=2    [1]=k
		 * 3.  다음에 채워넣을 값 k가 5의 배수니?
		 *      ㄱ. Yes    행증가
		 *      ㄴ. No     행감소, 열증가
		 * */
		
		
	}

}
