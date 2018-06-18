package days09;

public class Ex07 {

	public static void main(String[] args) {
		int [] m = { 5, 10 ,15 ,3, 0 };
		int index = 2; //삭제
        //[5][10][15][3][0]            01234
 		//[5][10][3][0][0]
// 		remove(m,index);  //m에 index 삭제
		
		
		
		// 끼워넣는작업.   ->   방하나더만들고 뒤로밀고 그자리에 100끼워넣기
		//index = 3      100  //삽입
		//[5][10][15][3][0]
		//[5][10][15][100][0][0]
		add( m, 3, 100 );
	}

	private static void add(int[] m, int index, int value) {
		// 0    1    2     3   4
		//[5][10][15][3][7]
		//[5][10][15][ ][3][7]
		//방크기 1증가 코딩, 끼워넣고자하는 index 위치부터 한칸씩뒤로 옮기는작업, 그 index 위치3에 value값 끼워넣기
		int [] temp = new int[m.length + 1 ];  //1)
		//2
		
	}

	private static void remove(int[] m, int index) {
		 //[5][10][*15*][3][0]               01234
 		//[5][10][3][0][0]
		//m[2] = m[3];
		//m[3] = m[4];
		for (int i = index; i < m.length-1 ; i++) {
			m[i] = m[i+1];                                   //앞으로한칸 땡기는작업.
			
		}
		int [] temp = new int[m.length-1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = m[i];                                 //
		}
		m =temp;
		
	}
}
