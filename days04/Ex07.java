package days04;

import java.util.Scanner;
 
public class Ex07 {                 // switch 문 사용해서 수우미양가.출력 // 국어 점수를 입력받아서 수, 우, 미, 양, 가 등급을 출력.

	public static void main(String[] args) {                    //break문 case 사용할때 걸려서 계속 내려오는걸방지

		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> kor input ? ");
		kor = scanner.nextInt();
		//
		char grade = getGrade(kor);
		System.out.printf("> %d (%c)\n", kor, grade);
	}

	// 100              
	// 90~99/10 수
	private static char getGrade(int score) {
		char grade ;
		switch (  score/10  ) {  // 8		
			case 10:case 9:
				grade='수'; break;
			case 8: grade='우';  break; 
			case 7: grade='미';  break; 
			case 6: grade='양';  break; 
			default: grade='가'; break; 
		}		
		return grade;
	}

}