package days04;

import java.util.Scanner;    //    ex03 연습.if문 사용 [국어점수 입력받아서 수우미양가 출력] 
                                              
public class Ex06 {

	public static void main(String[] args) {
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("> kor input ? ");
		kor  = scanner.nextInt();
		
		char grade = '수';
		if (0 <= kor && kor <= 100 ) {
			if( 90>= kor ) kor = '수';
			else if (kor > 80) grade = '우';
			else if (kor > 70) grade = '미';
			else if (kor > 60) grade = '양';
			else grade = '가';
			
			System.out.printf(">grade = %c\n, grade ");
		} else {System.out.println("국어 점수 입력 잘못!");}
		
		
		
		
		
	}//main
}//class
