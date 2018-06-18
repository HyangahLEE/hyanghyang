package days04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//국어 점수를 입력받아서
		//수,우,미,양,가 등급을 출력.
		int kor;
		Scanner scanner = new Scanner(System.in);

		System.out.println("> kor input ? ");
		kor = scanner.nextInt();

		char grade = '수';
		if ( 0<= kor  && kor <= 100 ) {
			if(kor >=90 ) kor ='수';
			else if (kor >80) grade = '우';
			else if (kor >70) grade = '미';
			else if (kor >60) grade = '양';
			else grade = '가';

			System.out.printf(" > grade = %c\n", grade );			

		}else { System.out.println("국어 점수 입력 잘못!!");}
		//The operator <= is undefined for the argument type(s) boolean, int
		//-------->
		//3 +5 + 2

		/*	if (90 < = kor && kor < = 100)      { System.out.println("수"); }
	else if (80 < = kor && kor <    90) { System.out.println("우"); }
	else if (70 < = kor && kor < = 79) { System.out.println("미"); }
	else if (60 < = kor && kor <    70) { System.out.println("양"); }
	else if (0   < = kor && kor <    60) { System.out.println("가"); }

	else // 그 외의 모든경우
		System.out.println("국어 점수 입력 잘못!!");*/
		//System.out.println(kor);



		}//main
	}//class
