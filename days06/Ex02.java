package days06;

public class Ex02 {     //1.로또발생 ex02.java 암기

	public static void main(String[] args) {
	//로또 요구분석
		// 1 ~ 45

		int [] lottos = new int[6];
		
		printLottos(lottos);   //로또번호출력함수
	}

	private static void printLottos(int[] lottos) {
	        	// 배열명.length == 배열크기 == 6
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = (int)(Math.random()*45+1);
			System.out.printf("%-3d",lottos[i]);
				
		}
		
	}
}

/*public class Ex01 {

	   public static void main(String[] args) {
	      int [] lottos = new int[6];      
	       fillUpLottos(lottos);  
	      printLottos(lottos);  
	      
	   }

	   private static void printLottos(int[] lottos) {
	      for (int i = 0; i < lottos.length; i++) { 
	         System.out.printf("%-3d", lottos[i]);
	      }
	      System.out.println();
	   }

	   private static void fillUpLottos(int[] lottos) { 
	      int index = 0;
	      while (index < lottos.length) {
	         int lottoNumber = (int)(Math.random()*45+1); 
	         System.out.println(lottoNumber);
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
	   }

	}*/