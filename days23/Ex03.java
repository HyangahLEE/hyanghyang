package days23;

import java.util.HashSet;

public class Ex03 {

	public static void main(String[] args) {
		// 로또      6 1~45 
	    // int [] lotto = new int[6];
		HashSet   lotto = new HashSet();
		// 발생 코딩
		int lottoNumber = 0;
		while( lotto.size() <= 6 ) {
		   lottoNumber = (int)(Math.random()*45)+1;
		   lotto.add(lottoNumber);  
		   // Object o <- 업캐스팅 <- Integer 오토방식 <- int
		}
		// 출력 코딩
		Ex02.dispSet(lotto);
		

	}

}
