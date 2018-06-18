package days09;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int [] m = new int[3];
		m = fillM(m);                   //메인에 있는 m 을 temp 를 이용해 참조해주는작업,  m = fiil(m),/ return = m; /  int [] fillM
		dispM(m);  //출력?
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
			if( i % 10 ==9) System.out.println();
		}
		System.out.println();
		
	}

	private static int [] fillM(int[] m) {
		Scanner scanner = new Scanner(System.in);
		int idx = 0;
		char con = 'n';
		int inc = 3;
		
		do {
			// m.lenght (3)  ==  idx(3) 배열의 크기를 size(3) 늘리자.
			if( m.length == idx ) {
				//System.out.println(" 더 이상 입력할 수 없다. !!!");
				//break;
				int [] temp = new int[m.length + inc]; 
				/*
				temp[0] = m[0];
				temp[1] = m[1];
				temp[2] = m[2];
				*/
				
				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				}
				
				m = temp;
			}
			System.out.printf("> %d 요소값을 입력하세요 ? ", idx);
			int  n = scanner.nextInt();
			m[idx++] = n; 	
			System.out.print("> 계속 입력할거냐? "); 
			con = scanner.next().charAt(0); 
		} while (  Character.toUpperCase(con) == 'Y' );
		
		return m;
	}

}

