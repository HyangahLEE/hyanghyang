package days12;

public class Ex01 {
	
	public static void main(String[] args) {
		int [][] m = new int[5][5];
		
		//fillM01(m);
		// fillM02(m);  // 사진 왼쪽 90 도 회전
		// fillM03(m);
		// fillM04(m);//합
		
		//magicSquare(m);  // 마방진
		// 골뱅이
		snail(m);
		
		dispM(m);
		
		
	}

	private static void snail(int[][] m) {
		
		
	}

	// 마방진 
	private static void magicSquare(int[][] m) {
		int row = 0, col = 2 ;  // m.length/2;
		int k = 0;
		while(++k<=25) {       // 1<=25
			m[row][col] = k;   	
			if( k%5 ==0) row++;
			else {				row--;col++;			}					
			if( row==-1) row=4;// 행 벗어나는 경우			
			if( col==5)   col=0;  // 열 벗어나는 경우			                     
		    //k++;
		} // while		
	} // fillM

	private static void fillM04(int[][] m) {
		 
		for (int i = 0, k=1; i < 4; i++) {
			for (int j = 0; j <  4; j++, k++) {
				m[i][j]=k;
				// 같은 행의 마지막 열
				m[i][4] += k;
				// 같은 열의 마지막 행
				m[4][j] += k;
				//
				m[4][4] +=k;
				dispM(m);
			}
		}
	}

	private static void fillM03(int[][] m) {
		// i=0  j=0                      0
		// i=1  j=0 1                   4   3
		// i=2  j=0 1 2                4   3   2             
		// i=3  j=0 1 2 3           
		// i=4  j=0 1 2 3 4          4 3 2 1 0
		for (int i = 0, k=1; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][4-j] = k++;
			}
			
		}
		
	}

	private static void fillM02(int[][] m) {
		// i=0   j=0,1,2,3,4
		// i=1   j=0,1,2,3,4
		// i=3   j=0,1,2,3,4
		// i=4   j=0,1,2,3,4
		
		for (int i = 0, k=1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 // m[i][j] = 5-i + j*5;
				m[4-j][i] = k++;
			} 
		}
		
		
		
	}

	private static void fillM01(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[i][j] = 5*i+j+1;
			}
			 
		}
		
	}

	private static void dispM(int[][] m) {
		 
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}
		 
		
	}

}
