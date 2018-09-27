package days12;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//날짜(Date)
public class FormatUtil {

	public static String number(long number, String pattern) {
		//정수 123123123
		//문자열 123,123,123
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(number);
	}
	
	public static String date(Date d, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(d);
	}
	
	public static int korFloor(int kor) {
		return (int)Math.floor(kor/10);		
	}
	public static int sum(int n) {
		int sum=0;
		for (int i = 1; i <=n; i++) {
			sum+=i;
		}
		return (int)sum;		
	}
}
