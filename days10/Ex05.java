package days10;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 1게임 [][][][][][]  1~45 중복되지않은 정수
		// 2게임 [][][][][][]
		// 3게임 [][][][][][] 
		System.out.print("> 로또 몇 게임할거니? ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int [][] lottos = new int[n][6];	
		
		 fillUpLottos(lottos);  // 로또 번호 채워넣는 함수
		 printLottos(lottos);  // 로또 번호 출력하는 함수

	}
	
	private static void printLottos(int[][] lottos) { 
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d게임 - ", i+1);
			printOneLottos(lottos[i]);
		}
	}

	private static void fillUpLottos(int[][] lottos) { 
		 for (int i = 0; i < lottos.length; i++) {
			fillUpOneLottos(lottos[i]);
		}
	}
	
	private static void printOneLottos(int[] lottos) {
		for (int i = 0; i < lottos.length; i++) { 
			System.out.printf("[%02d]", lottos[i]);
		}
		System.out.println();
	}

	private static void fillUpOneLottos(int[] lottos) { 
		int index = 0;
		while (index < lottos.length) {
			int lottoNumber = (int)(Math.random()*45+1); 
			// System.out.println(lottoNumber);
			if( !isDuplicationCheck(lottos, lottoNumber, index) ) {
				lottos[index] = lottoNumber;
				index++;
			}
		} 
	}

	private static boolean isDuplicationCheck(
			int[] lottos, int lottoNumber, int index) {		
		for(int i=0; i<index; i++) {
			if( lottos[i] == lottoNumber) return true;
		}		 
		return false;
	} //
	
	 

} // class
