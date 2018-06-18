package days12;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int [] m = new int[10];
		// 1~100 랜덤한 정수를 채워넣고.....
		for (int i = 0; i < m.length; i++) {
			  m[i] = (int)(Math.random()*100)+1;
			  System.out.printf("[%d]", m[i]);
		}
		System.out.println();
		// 가장 큰 값 인덱스, 가장 작은 값 인덱스을 구해서 출력.
		int max=0,  min=0;
		for (int i = 0; i < m.length; i++) {
			//max = m[i] > max ? m[i] :max;
			//min = m[i] < min ? m[i] : min;
			max = m[i] > m[max] ? i :max;
			min = m[i] < m[min] ? i : min;
		}
		System.out.printf(
				"> max=%d(%d), min=%d(%d)\n",
				m[max], max, m[min], min);
		// 찾을 정수 ?  73
		Scanner  scanner = new Scanner(System.in);
		System.out.printf("> 찾을 정수 ? ");
		int n = scanner.nextInt();
		// 근사치
		int approximateValueIndex = 0;
		int approximateValue = Math.abs(n-m[0]);
		for (int i = 0; i < m.length; i++) {
			int value = Math.abs( n-m[i] ); 
			System.out.printf("찾정:%d, 비정:%d, 거리:%d\n",
					n, m[i],value);
					
			/*
			if( n - m[i] == 0 ) {
				approximateValueIndex = i;
				System.out.printf("> %d(%d) 동일값\n", m[i], i);
			}else if(n - m[i] > 0) {
				
			}else {
				
			}
			*/
		} 
		 
	}

}
