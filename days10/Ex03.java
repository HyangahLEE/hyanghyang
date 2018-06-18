package days10;

import java.io.IOException;                   //학생 점수
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		//
		
		final int COUNT = 30;
		
		String [] names = new String[COUNT];
		double [] avgs = new double[COUNT];
		
		int [][] scores = new int[COUNT][5];   //2차원배열
		
		int cnt = 0; // 입력받은 학생수
		char con = 'y';
		Scanner scanner = new Scanner(System.in);
		
		// 한 학생의 정보      --> 구조체 또는 클래스
		String name;
		int kor, eng, mat , tot , rank;
		double avg;
		
		do {
			System.out.printf("%d번 학생 정보 입력 ? ", cnt+1);
			name =  getName();  //scanner.next();
			kor =  getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();
			
			tot = kor + eng + mat;   // 
			avg = (double)tot / 3;   // 
			rank = 1;
			
			// 각각의 배열에 저장...
			names[cnt] = name;
			scores[cnt][0] = kor;
			scores[cnt][1] = eng;
			scores[cnt][2] = mat;
			scores[cnt][3] = tot;
			avgs[cnt] = avg;
			scores[cnt][4]  = rank;
			
			cnt++; //cnt ==1
			
			System.out.print("> 계속 입력 ? ");
			con =  (char) System.in.read();
			System.in.skip( System.in.available() ); //
		} while (   Character.toUpperCase(con) == 'Y' );
		
		//등수매기기
		for (int i = 0; i < cnt; i++) {
			//scores[i][3]  등수를 매길 학생 i 의 총점.
			int a_tot = scores[i][3];
			//int rank =1;    //a_tot 내점수
			for (int j = 0; j < cnt; j++) {
			
				if (a_tot < scores[j][3] ) scores[i][4]++;
			}
			
		}
		//출력
		
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s\n"
				,"이름","국어","영어","수학","총점","평균","등수");
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					names[i], scores[i][0], scores[i][1], scores[i][2], scores[i][3], avgs[i], scores[i][4]);
			
		}
		System.out.println("\n---------------------------------------------------");
	}

	public static String getName() {
		
		char [] name = new char[5];  
		Random rnd = new Random();
		
		for (int i = 0; i < name.length; i++) {
			name[i] = (char) (rnd.nextInt(26)+65);
		}		 
		return new String( name );
	}

	public static int getScore() {
		
		Random rnd = new Random();  
		return rnd.nextInt(101) ;
	}
	}

