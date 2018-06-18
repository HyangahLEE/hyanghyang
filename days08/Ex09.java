package days08;

public class Ex09 {   //마름모 방법3

	public static void main(String[] args) {
		// 마름모
        /*		
		__*__
		_***_
		*****
		_***_
		__*__

		*/
		/*
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5 ; j++) {
				if( i+j >=4 && j-i <=2 &&  i-j <=2 && i+j <=8)System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}
        */
		
		/*
		int s=1 , e=5;
		for (int i = 1; i <=5 ; i++) {
			// i = 1
			for (int j = 1; j <=5 ; j++) {
				if( s<= j && j<=e  ) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
			
			if( i<3 ) { s++; e--; }
			else { s--; e++; }
		}
		*/
		
		int s=1 , e=5 , direction = 1;    //방향바꾸는것
		for (int i = 1; i <=5 ; i++) {
			// i = 1
			for (int j = 1; j <=5 ; j++) {
				if( s<= j && j<=e  ) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
			
			if( i==3) direction = -1;
			 s += direction * 1; // s++  s += 1; // s = s+1
			 e -= direction * 1;  // e--   e-=1      // e = e -1
		}
		
		/*
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5 ; j++) {
				// 모래시계
				//if(i <= j && i + j <= 6 || i >= j && i + j >= 6)
				//                 System.out.print("*");
				//else System.out.print("_");
				
				// 나비
				if(i < j && i + j < 6 || i > j && i + j > 6)
					                System.out.print("_");
				 else System.out.print("*");
			}
			System.out.println();
		}
		*/
	}

}
