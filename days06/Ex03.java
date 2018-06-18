package days06;

public class Ex03 {

	public static void main(String[] args) {
		// 1 ~ 45 랜덤한 정수 -> 6개
		// > Math클래스 : 산술적 계산 기능(함수)들이 구현된 클래스
		// Math.max(a, b);
		// Math.min(a, b);
		
		// 0.0 <=  double Math.random() < 1.0
		// 0.0*45 <=  double Math.random()*45 < 1.0*45
		// 1 <=   (int)(Math.random()*45)+1 < 46
		
		// 3 ~ 42      -2
		// 1 ~ 40
		// 3 <=  (int)(Math.random()*40)+3 < 43
		
		// 1 <=   정수  <= 45
		/*
		int lottoNumber ;
		for (int i = 0; i < 1000; i++) {
			lottoNumber = (int)(Math.random()*45+1);
			//System.out.println(  lottoNumber );
			if( 0>lottoNumber || lottoNumber > 45) 
				System.out.println("***");
		}
		*/
         
	}

}

	

