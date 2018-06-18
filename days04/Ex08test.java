package days04;

import java.util.Scanner;

public class Ex08test {

	public static void main(String[] args) {

		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.println(">kor input ?");
		kor = scanner.nextInt();

		char grade = '수';
		if (0<= kor && kor <= 100 ) {
			if( 90 >= kor) kor = '수';
			else if( 80 > kor ) grade = '우';
			else if( 70 > kor ) grade = '미';
			else if( 60 > kor ) grade = '양';
			else grade = '가';

			System.out.printf(">grade = %c\n, grade");
		}
		


	}
}
