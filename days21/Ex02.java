package days21;

import java.text.DecimalFormat;

public class Ex02 {

	public static void main(String[] args) {
		
		String pattern = "0000";
		DecimalFormat df = new DecimalFormat(pattern);

		for (int sno = 1; sno <=30; sno++) {
			System.out.printf("%s\n",df.format(sno));
		}

	}

}
