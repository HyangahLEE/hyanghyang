package days09;

public class Ex07_02 {                               //시험

	public static void main(String[] args) {
		/*
		int [] m = new int[5];
		m[0] = 5;
		m[1] = 10;
		m[2] = 15;
		m[3] = 3;
		*/
		int [] m = { 5, 10, 15, 3, 7 };
		int index = 2;            // 삭제  
		// [5][10][15][3][0]
		// [5][10][3][0][0]
		//                            remove(m, index);
		
		// index = 3      100   // 삽입
		// [5][10][15][3][7]
		// [5][10][15][100][3][7]
		add( m,  3, 100);

	}

	private static void add(int[] m, int index, int value) {               //시험ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//  0   1   2    3   4
		// [5][10][15][3][7]
		// [ 5][10][15][][3][7]
		//방크기 1증가 코딩, 끼워넣고자하는 index 위치부터 한칸씩뒤로 옮기는작업, 그 index 위치3에 value값 끼워넣기
		
		// 1) 방크기 1 증가
		int [] temp   = new int[m.length + 1];    // 
		// [5][10][15][    (3)  ][3][7]
		// 2) index 위치부터 1칸씩 뒤로 이동.
	
		for (int i = 0; i < m.length; i++) {
			if(index > i) temp[i] = m[i];            //만약에 index 가 i 보다 작으면 그대로 방을 두고 아니고 i 보다 크면 i+1 
			else         temp[i+1] = m[i];
		}
		// 3) index 위치에 value 값 끼워넣기
		// [5][10][15][ value ][3][7]
		temp[index] = value;                           //value 값  삽입.
		
		// 4) 
		m = temp;                                            //시험ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	}

	private static void remove(int[] m, int index) {
		// [5][10][*15*][3][1000]
		 // [5][10][3][1000][1000]
		
		// m[2] = m[3];
		// m[3] = m[4];
		for (int i = index; i < m.length-1; i++) {
			 m[i] = m[i+1];
		}
		// m[m.length-1] = 0;
		int [] temp = new int[m.length-1];
		for (int i = 0; i < temp.length; i++)  
			temp[i] = m[i]; 
		m  = temp;		
	}

}