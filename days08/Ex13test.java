package days08;     //재귀함수.

import java.util.Scanner;

public class Ex13test {

	public static void main(String[] args) {
		
		int m , n ;
		Scanner scanner =new Scanner(System.in);
		System.out.print(" >밑, 지수 입력 ? ");
		m = scanner.nextInt();
		n = scanner.nextInt();
		
		System.out.println(pow(m,n));
	}//main

	private static double pow(int m, int n) {
		double s = 1;
		for (int i = 1; i <= Math.abs(n) ; i++) 
			s *= m;
		return n >0? s : 1/s;
		
	}
	}
	
