package days04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*//1.조건문 : if
		 *  형식
		     if ( 조건식 true/false ) {
			
		}
		조건식이 참일때 {} 블록 안의 실행코딩을 수행
		조건식이 거짓일때 블록 건너뛰고 실행.
		
		//정수를 입력받아서 
		 // 예)짝수/홀수 출력  **짝수정의(맨끝자리수 짝수)
		*/
		int n = inputData();
		//System.out.println(n);
		
		if (n % 2 ==0) System.out.println("짝수(EVEN Number");
		else System.out.println("홀수(ODD Number");
		
	
	/*	
		if(n % 2 ==0) return true;
		else                 return false;
		
		
		boolean b = false;
		if(n % 2 ==0)   	b =true			   
	*/
				
	}

	private static int inputData() {
		//반복문, 조건반복문
		System.out.println(">점수입력 : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // A  10A  10.2 
		return n;
	}
			}

