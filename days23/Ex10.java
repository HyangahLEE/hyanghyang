package days23;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Properties pt = new Properties();
		pt.setProperty("홍길동", "hong@naver.com");
		pt.setProperty("김길동", "kim@naver.com");
		pt.setProperty("박길동", "park@naver.com");

		// 모든 Key - Value 출력
		Set<Entry<Object, Object>> set = pt.entrySet();
		Iterator<Entry<Object, Object>> ir = set.iterator();
		while (ir.hasNext()) {
			Map.Entry<Object,Object> entry =
					(Map.Entry<Object,Object>) ir.next();
			System.out.printf("%s - %s\n"
					, (String)entry.getKey()
					, (String)entry.getValue());
			
		} // while
		
		String fileName = "member.properties";
		Writer writer;
		try {
			writer = new FileWriter(fileName );
			String comments = "쌍용교육센타 Class 5";
			// pt.store(writer , comments );
			pt.storeToXML( new FileOutputStream("member.xml") 
					, "xml sample");
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		System.out.println("= END =");
		
		
	}  // main

} // class





