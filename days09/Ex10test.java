package days09;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex10test {

	public static void main(String[] args) throws IOException {

		final int COUNT = 30;
		
		String [] names = new String[COUNT];
		int [] kors = new int[COUNT];
		int [] engs = new int[COUNT];
		int [] mats = new int[COUNT];
		int [] tots = new int[COUNT];
		double[] avgs = new double[COUNT];
		

		int cnt = 0;
		char con = 'y';
		Scanner scanner = new Scanner(System.in);

		String name;
		int kor,eng,mat,tot,rank;
		double avg;
		int ranks [] = new int[COUNT];

		do {
			System.out.printf( "%d번 학생 정보 입력?", cnt+1 );
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor +eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			//각각의 배열에 저장
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			cnt++;
			
			System.out.print("> 계속 입력? ");
			con = (char) System.in.read();
			System.in.skip( System.in.available());
		} while (Character.toUpperCase(con) == 'Y');


	}
	private static String getName() {
	
		char [] name = new char[5];
		Random rnd = new Random();
		for (int i = 0; i < name.length; i++) {
			name[i] = (char)(rnd.nextInt(28)+65);
		}
		return new String( name);

	}
	private static int getScore() {
		Random rnd = new Random();

		return rnd.nextInt(101);   
		
	}
}
