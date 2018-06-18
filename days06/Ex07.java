package days06;

public class Ex07 {

	public static void main(String[] args) {
		/*
		int x = 100;		
		System.out.println(x);		// 100
		changeX(x);		
		System.out.println(x);    // 100
        */
		
		/*
		int [] m = new int[2];
		m[0] = 10;
		m[1] = 20;
		*/
		// *** 배열의 초기화 ***
		int [] m = {10 , 20};
		// Call By Reference
		dispM(m);  // 배열, 클래스 , 인터페이스  
		             changeM(m);
		dispM(m);
	}
	
	private static void changeM(int[] m) { // x , y
		 int temp = m[0];
		 m[0] = m[1] ;
		 m[1] = temp;
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d] ", m[i]);
		}
		System.out.println();
	}
	
	public static void changeX(int x) {
		x = 200;
	}

}