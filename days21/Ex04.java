package days21;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// 
		/*Date now = new Date();
		String pattern="[W]yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(now));*/
		
		String id = "admin";
		String name = "이향아";
		String tel = "010-2733-6856";
		
		
		String.format("%s%s%s",id,name,tel);
		String pattern="";
		MessageFormat.format(pattern, id,name,tel);
	}

}
