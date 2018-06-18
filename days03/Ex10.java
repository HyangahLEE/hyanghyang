package days03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 이름 10명을 저장할 배열을 선언하세요..
		// 선언 형식 :   자료형 [] 배열명 = new 자료형[배열크기]**
		String[] names = new String[20];
		// String[] args
		int cnt = 0;  // 입력받은 학생수 변수
		Scanner scanner = new Scanner(System.in);

		// 반복  == 반복문 처리...
		System.out.printf("> %d 번 학생 이름 입력 ? ", cnt+1);
		String name = scanner.next();
		names[0] = name;
		cnt++;

		System.out.printf("> %d 번 학생 이름 입력 ? ", cnt+1);
		name = scanner.next();
		names[1] = name;
		cnt++;


		System.out.printf("> %d 번 학생 이름 입력 ? ", cnt+1);
		name = scanner.next();
		names[2] = name;
		cnt++;


		System.out.printf("> %d 번 학생 이름 입력 ? ", cnt+1);
		name = scanner.next();
		names[3] = name;
		cnt++;
	}
}