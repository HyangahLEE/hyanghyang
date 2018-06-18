package days11;

import java.io.IOException;
import java.util.Scanner;

import days10.Ex03;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 2반 30명 학생
		// 이,국,영,수,총,평,등,전등
		final int COUNT = 30;
		//String [] names = new String[2*COUNT];
		String [][] names = new String[2][COUNT];
		double [][] avgs = new double[2][COUNT];

		// 면(반)   행(학생)   열(k,e,m,t,r,wr)
		int [][][] scores = new int[2][COUNT][6];

		int [] cnts = new int[2]; //   
		char con = 'y';
		int ban ;  // 1, 2
		Scanner scanner = new Scanner(System.in);

		// 한 학생의 정보 --> 구조체 또는 클래스
		String name;
		int kor, eng, mat , tot , rank, wrank;
		double avg;
		
		do {
			System.out.printf("> 몇 반학생 입력 ? ");
			ban =  scanner.nextInt();
			System.out.printf("%d반 %d번학생 이,국,영,수 입력 ? "
					                  , ban  
					                  , cnts[ban-1]+1		// ???			                    
                                     );
			name =  Ex03.getName();   
			kor =  Ex03.getScore(); 
			eng = Ex03.getScore();  
			mat = Ex03.getScore();  
			
			tot = kor + eng + mat;  
			avg = (double)tot / 3;  // 
			rank = 1;
			wrank = 1;   // 전교등수
			
			// 각각의 배열에 저장...
			// 0 , 1
			// 1 , 2
			names[ban-1][cnts[ban-1]] = name;
			
			 scores[ban-1][cnts[ban-1]][0] = kor;
			 scores[ban-1][cnts[ban-1]][1] = eng;
			 scores[ban-1][cnts[ban-1]][2] = mat;
			 scores[ban-1][cnts[ban-1]][3] = tot;
			 
			avgs[ban-1][cnts[ban-1]] = avg;
			
			 scores[ban-1][cnts[ban-1]][4]  = rank;
			 scores[ban-1][cnts[ban-1]][5]  = wrank;
			
			//cnt++;  // cnt  == 1
			cnts[ban-1]++;
			
			System.out.print("> 계속 입력 ? ");
			con =  (char) System.in.read();
			System.in.skip(  System.in.available() ); 
		} while (   Character.toUpperCase(con) == 'Y' );
		// 반등수, 전교등수 
		for (int i = 0; i < cnts.length; i++) {  // 2반
			for (int j = 0; j < cnts[i]; j++) {   // 학생수
				// scores[i][j][3] 등수를 매길 학생의 총점
				for (int i2 = 0; i2 < cnts.length; i2++) {  // 2반
					for (int j2 = 0; j2 < cnts[i2]; j2++) {   // 학생수
						if( scores[i][j][3] < scores[i2][j2][3]) {
							                    scores[i][j][5]++;
							if( i == i2 )    scores[i][j][4]++;
						}
					}
				}
			}
		}
		
		// 출력
		for (int i = 0; i < cnts.length; i++) {   // 반
			System.out.printf("> %d반 학생 정보 <\n", i + 1);
			// 출력
			System.out.println("---------------------------------------------------------------");
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s\t%s\n"
					,"이름","국어","영어","수학","총점","평균","등수","전등");
			System.out.println("---------------------------------------------------------------");
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
						names[i][j]
								, scores[i][j][0], scores[i][j][1]
								, scores[i][j][2], scores[i][j][3]
					    , avgs[i][j]
					    		 , scores[i][j][4]
					    		 ,scores[i][j][5]);
			}
			System.out.println("---------------------------------------------------------------");
			
			
		}
	}

}



//Arrays 클래스  binarySearch() 함수
// Arrays.binarySearch(a, key)