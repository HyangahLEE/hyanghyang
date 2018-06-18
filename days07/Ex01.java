package days07;               //시험.순차

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) { 
		// days07 패키지
		// 중복체크함수 : isDuplicationCheck()
		// 순차검색( Sequence Search )
		int [] m = new int[20];
		fillM(m); 
		dispM(m);
		// 33
		int  n ; 
		Scanner scanner = new Scanner(System.in);
		// !( 1<= n   &&  n <= 100 )
		//     n < 1  ||  n > 100
		do {
			System.out.print("> 찾을 정수(n) 입력하세요 ? ");
			n = scanner.nextInt();  // 1~100 까지의 정수
		} while (  n < 1  ||  n > 100  );
		// m 배열에서 n 정수를 찾아서 
		// index 값을 반환하는 함수 :   indexOf()
		int fromIndex = 0;
		int idx = -1;
		
		do { 
				fromIndex = idx+1;
				idx = indexOf(m, n, fromIndex);		
				if( idx != -1 )	System.out.printf("%d 위치에 있습니다.\n", idx);
				else        System.out.println("찾는 정수 없습니다.");
				
	     }while(idx != -1);
			
		 /*
		//while(idx != -1) {  // while( -1 != -1 )		
		while(true) {
			fromIndex = idx+1;
			idx = indexOf(m, n, fromIndex);		
			if( idx != -1 )	System.out.printf("%d 위치에 있습니다.\n", idx);
			else      
			{
				  System.out.println("찾는 정수 없습니다.");
				  break; // while
			}
		}
		*/ 
		
		/*
		int fromIndex = 0;
		int idx = indexOf(m, n, fromIndex);		
		if( idx != -1 )	System.out.printf("%d 위치에 있습니다.\n", idx);
		else              System.out.println("찾는 정수 없습니다.");
		
		fromIndex = idx + 1;
		idx = indexOf(m, n, fromIndex);		
		if( idx != -1 )	System.out.printf("%d 위치에 있습니다.\n", idx);
		else              System.out.println("찾는 정수 없습니다.");
		
		fromIndex = idx + 1;
		idx = indexOf(m, n, fromIndex);		
		if( idx != -1 )	System.out.printf("%d 위치에 있습니다.\n", idx);
		else              System.out.println("찾는 정수 없습니다.");
		:
		:
			idx == -1     배열 방 끝까지 비교 끝나서 이제는 더이 상 없다.
		*/	
	}
	
	private static int indexOf(int[] m, int n) {
		// 2
		for (int i = 0; i < m.length; i++) {
			if( m[i] == n) {
				//System.out.printf("%d 위치에 있습니다.\n", i);
				return i;
			}
		}
		return -1;
		
		/*  //  1
		int idx = -1;
		for (int i = 0; i < m.length; i++) {
			if( m[i] == n) {     // m[6]==29
				idx = i;             // idx = 7;
				break; // for문 빠져나옴.
			}
		}
		return idx;
		*/
	}
	
	//  fromIndex 찾을 시작위치
	private static int indexOf(int[] m, int n, int fromIndex) { 
		int idx = -1;
		for (int i =  fromIndex   ; i < m.length; i++) {
			if( m[i] == n) {     // m[6]==29
				idx = i;             // idx = 7;
				break; // for문 빠져나옴.
			}
		}
		return idx; 
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) { 
			System.out.printf("[%02d]",m[i] );
			if( i%10 ==9) System.out.println();
		}
		System.out.println(); 
	}

	private static void fillM(int[] m) {
		// 1 ~ 100 사이의 랜덤한 정수를 m 배열에 채워넣자.
		// 1 <= (int)(Math.random() *100)+1 <= 100
		// JDK 5.0 ~  java.util.Random 클래스 
		Random rnd = new Random();
		// 1<= rnd.nextInt(100)+1 < 101 
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(30);
			//System.out.printf("[%d]",m[i] );
		}
		//System.out.println(); 
		
	}

}

	   
