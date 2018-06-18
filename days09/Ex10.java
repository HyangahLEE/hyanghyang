package days09;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		// 한 반에 30명의 학생
		// 이름, 국어, 영어, 수학, 총점, 평균, 등수   -- 성적처리
		// 입력( 이름, 국, 영, 수 )
		// 성적처리( 총, 평 )
		// *** 등수
		// 출력
		
		final int COUNT = 30;
		
		String [] names = new String[COUNT];
		int [] kors = new int[COUNT];
		int [] engs = new int[COUNT];
		int [] mats = new int[COUNT];		
		int [] tots = new int[COUNT];
		double [] avgs = new double[COUNT];
		
		int [] ranks = new int[COUNT];
		
		int cnt = 0; // 입력받은 학생수
		char con = 'y';
		Scanner scanner = new Scanner(System.in);
		
		// 한 학생의 정보는 아래 변수에 우선 저장 후 ---> 각 배열 저장.
		String name;
		int kor, eng, mat , tot , rank;
		double avg;
		
		
		do {
			System.out.printf("%d번 학생 정보 입력 ? ", cnt+1);
			name =  getName();  //scanner.next();
			kor =  getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();
			
			tot = kor + eng + mat;  // 
			avg = (double)tot / 3;  // 
			rank = 1;
			
			// 각각의 배열에 저장...
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt]  = rank;
			
			cnt++; 
			
			System.out.print("> 계속 입력 ? ");
			con =  (char) System.in.read();
			System.in.skip(  System.in.available() ); //
		} while (   Character.toUpperCase(con) == 'Y' );
		
		/*
		1번 학생 정보 입력 ? 이석화 90 99 89
		계속 입력 ? y
				
		2번 학생 정보 입력 ? _
		계속 입력 ? n
		*/
		//		
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s\n"
				,"이름","국어","영어","수학","총점","평균","등수");
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
		System.out.println("\n---------------------------------------------------");
		
	}

	private static String getName() {
		char [] name = new char[5];  
		//  'k' 'e' 'n' 'i' 'k'  -> "kenik"
		// char []   -> String 형변환
		// 'A'  'Z'
		// 65   92 
		// rnd.nextInt(28)+65
		Random rnd = new Random();
		for (int i = 0; i < name.length; i++) {
			name[i] = (char) (rnd.nextInt(26)+65);
		}		 
		return new String( name );
	}

	private static int getScore() {
		Random rnd = new Random();  
		// 0<=   rnd.nextInt(101)  < 101
		return rnd.nextInt(101) ;
	}

}
	//[배열]
	// 삽입 삭제, 검색, 수정, 추가   ex06_02
	
	//[ex10 예제]

