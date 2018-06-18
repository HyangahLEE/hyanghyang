package days21;

import java.text.DecimalFormat;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		
		//p543 Format(형식)클래스
		String pattern = "\u00A4 #,###";
		DecimalFormat df = new DecimalFormat(pattern);
		Random rnd = new Random(System.currentTimeMillis());
		for (int i = 1; i <=10; i++) {
			int pay=(int)(rnd.nextInt(10000000)+1);
			System.out.printf("> pay=%d = (%s)\n",pay,df.format(pay));
		}
		
	}
}
