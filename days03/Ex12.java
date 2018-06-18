package days03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// p101
		// score   국어점수를 입력받아서
		// grade  등급(A, B, C, D, F )
		char  grade;
		int score  ;   //  0<=   <=100
		System.out.print("> score input ? ");
		
		Scanner scanner = new Scanner(System.in);
		// java.util.InputMismatchException
		//  "10A"
		score = scanner.nextInt();
		grade =  score>=90 ? 'A' :  score >=80? 'B' : score >=70?'C': score>=60?'D':'F';
		System.out.printf("> score=%d, grade=\'%c\'\n", 
				score, grade);

	}

}