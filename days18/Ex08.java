package days18;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		
		getKor();

	}

	private static int getKor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		
		if(!(kor>=0 && kor<=100))
			//예외 강제로 발생시키는 문 : throw문
			throw new ArrayIndexOutOfBoundsException();
		return kor;
		
	}

}
