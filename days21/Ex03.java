package days21;

import java.text.DecimalFormat;

public class Ex03 {

	public static void main(String[] args) {
		
		
		String pattern = "%#00.00";
		DecimalFormat df = new DecimalFormat(pattern);
		double purity = 0;
		for (int i = 0; i < 10; i++) {
			purity =Math.random();
			purity = Math.rint(purity*10000)/10000;
			System.out.printf("> "
					+ "%s\n",df.format(purity));
		}
		
		
		
		
		
	}
}
