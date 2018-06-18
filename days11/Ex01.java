package days11;

import java.util.Arrays;
import java.util.Scanner;

import days10.Ex04;

public class Ex01 {

	public static void main(String[] args) {
		// [ 검색( search ) ]
		// 1. 순차검색( SequenceSearch )
		// 2. 이진검색( BinarySearch )
		int [] m = new int[1000];
		int i = 0;
		while( i< m.length ) {
			int n =  (int) (Math.random()*100000 +1);
			if(!Ex04.isDuplicationCheck(m, n, i)) {
				m[i] = n;
				i++;
			}
		}
		// Arrays 클래스     sort()
		Arrays.sort(m);
		// 
		dispM(m); 
		//
		Scanner  scanner = new Scanner(System.in);
		System.out.print("> 찾을 정수 입력 ? ");
		int n = scanner.nextInt();
		int idx = binarySearch(m,n);
		// 
	}

	private static int binarySearch(int[] m, int n) {
		//int idx = -1;
		int bot=0, top=m.length-1, mid;
		int cnt = 0 ;
		while ( bot <= top ) {
			cnt++;
			mid = ( top + bot )/ 2;
			if( m[mid] == n) {
				System.out.printf("> 검색 횟수 : %d \n",cnt);
				return mid;
			}
			else if(m[mid] > n ) top = mid-1;
			else if(m[mid] < n ) bot = mid+1;
		} // 
		System.out.printf("> 검색 횟수 : %d \n",cnt);
		return -1;
		
		// 1)2)3)4)  반복     조건()????
		// 1) 가운데(mid) 위치 계산
		// 2) 그 배열의 가운데 위치하는 값 == 찾을정수         return 찾은위치
		// 3)                                     >            가운데값보다 큰 반을 버리고 
		//                                                   새로운 top 계산 = 가운데위치-1
		// 4)                                     <         가운데값보다 작은 반을 버리고
		//                                                  새로운 bot 계산 = 가운데위치+1
		
		//Arrays 클래스 binarySearch() 함수
     	//Arrays.binarySearch(arg0, key)
		
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]", m[i]);
			if( i%10 == 9 ) System.out.println();
		} 
	}

}
	

	