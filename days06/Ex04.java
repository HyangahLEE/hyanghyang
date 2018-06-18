package days06;

public class Ex04 {                                 //암기.이해하기**

	public static void main(String[] args) {
		// 기본형 8개는 반드시 초기화한 후 사용.
		// int i;
		// System.out.println(i);
		
		// 로또 
		// 1 ~ 45 
		// * 자동           / 수동
		// 참조형 : 배열, 클래스 , 인터페이스
		//            초기화 하지 않아도 그 자료형의 기본값으로 초기화되어있다.
		int [] lottos = new int[6];
		
	    fillUpLottos(lottos);  // 로또 번호 채워넣는 함수
		printLottos(lottos);  // 로또 번호 출력하는 함수
	}
 

	private static void fillUpLottos(int[] lottos) {
		//  0		1		*2		3		4		5
		// [5] 	[10]	[0]	[0]	[0]	[0]
		int index = 0;
		while (index < lottos.length) {
			int lottoNumber = (int)(Math.random()*45+1);
			// 중복이 되면    true
			// 중복이 안되면 false
			if( !isDuplicationCheck(lottos, lottoNumber, index) ) {
				lottos[index] = lottoNumber;
				index++;
			}
		}
	}

		/*
		for (int i = 0; i < lottos.length; i++) {
			int number = (int)(Math.random()*45+1);
		    // i = 0
			//중복되면  true
			//중복안되면 false
			// if( 중복체크조건식 == true) {
			// if( 중복체크조건식 ) {
			
			//if( 중복체크조건식 == false ) {
			if( !중복체크조건식  ) {
				그 방에 채워넣기.
				lottos[i] = number ;
			}else {
			   i--;	
			}
		}	
			*/	
			  
		
		/*
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = (int)(Math.random()*45+1);
		}
		*/
  
	private static boolean isDuplicationCheck(
			int[] lottos, int lottoNumber, int index) {
		
		for(int i=0; i<index; i++) {
			if( lottos[i] == lottoNumber) return true;
		}
		 
		return false;
	}

	private static void printLottos(int[] lottos) {
		// 배열명.length == 배열크기 == 6
		for (int i = 0; i < lottos.length; i++) {
			//System.out.println(lottos[i]);
			System.out.printf("%-3d", lottos[i]);
		}
		System.out.println();
		/*
		System.out.println(lottos[0]);
		System.out.println(lottos[1]);
		System.out.println(lottos[2]);
		System.out.println(lottos[3]);
		System.out.println(lottos[4]);
		System.out.println(lottos[5]);
		*/
	}

}