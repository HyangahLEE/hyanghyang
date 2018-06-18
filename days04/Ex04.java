package days04;

import java.util.Scanner;

public class Ex04 {                   //if문 사용해서 윤년.평년 출력

	public static void main(String[] args) {
		// 문제) 년도를 입력받아서 윤년/평년 출력...
		System.out.print("> 년도 입력 : "); 
		Scanner scanner = new Scanner(System.in);
		int year =  scanner.nextInt();		
		if( isLeapYear(year) ) System.out.println("윤년");
		else              System.out.println("평년");
		
	}
	private static boolean isLeapYear(int year) {		
		// ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,  
		// ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 		
		// ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.		
		if(  year % 4  == 0  &&  year % 100 != 0 || year %400 == 0 ) 
				return true;
		else              
			return false;
	}

}
