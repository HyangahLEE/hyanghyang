package days09;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * //1차원 배열 : 열
		//int 배열  : m
		int [] m = new int[8];
		//배열크기 : 배열명.length
		System.out.println(m.length);
		//0번째 요소, 1번째 요소(element)
		//0,1 인덱스 (index)
		for (int i = 0; i < m.length; i++) {
			System.out.printf( "m[%d]=%d",i );
		}
		System.out.println(); 
		*/
		
		
		//2차원배열 : 행 ,열**
		
		/*int [][] m = new int[2][4];
		
		System.out.println( m.length );     //행의 크기 : 2      ex)배열크기x
		System.out.println( m[0].length );  //0행의 방개수(크기)
		System.out.println( m[1].length );   //1행의 방개수(크기)
		dispM(m);   //2차원 배열 출력함수
        */		
		
		//3차원 배열 :                 면,  행, 열***      
		int [][][] m = new int [3][4][2];
		
		dispM(m);
		
		
		
		
		
		/*System.out.println( m.length );   //면 크기
		System.out.println( m[0].length );  // 0면 행크기
		System.out.println( m[1].length );  // 1면 행크기
		System.out.println( m[2].length );  // 2면 행크기
		System.out.println( m[0][0].length );  // 0면 0행의 열크기
		System.out.println( m[0][1].length );  // 0면 1행의 열크기
		//:
		//:
		System.out.println( m[2][3].length );   //
*/	}
    // ?? 면 행 열
	private static void dispM(int[][][] m) {
		for (int k = 0; k < m.length; k++) {       //면 크기
			for (int i = 0; i < m[k].length; i++) {     // 행 크기
				for (int j = 0; j < m[k][i].length; j++) {  //열 크기
					System.out.printf( "m[%d][%d][%d]=%d",k,i,j,m[k][i][j] );
				}
				System.out.println();
			}
		}
		
	}

	private static void dispM(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {      //행
			for (int j = 0; j < m[i].length; j++) {  //열
				System.out.printf( "m[%d][%d]=%d",i,j,m[i][j] );
			}
			System.out.println();
		}
		
	}
}
