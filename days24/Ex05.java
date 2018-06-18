package days24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Ex05 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("blue", 96);
		hm.put("hong", 86);
		hm.put("white", 92);
		hm.put("kenik", 96);
		hm.put("admin", 75);
		hm.put("hyangah", 96);
		
		String name = null;
		int maxScore=0;
		int totalScore =0;
		int avg=0;
		
		ArrayList<String> names =new ArrayList<>();
		Set<Entry<String, Integer>>  cl = hm.entrySet();
		Iterator<Entry<String, Integer>> ir  = cl.iterator();
		while (ir.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) ir.next();
			
			int score = entry.getValue();
			if(maxScore < score) maxScore=score;

			if(entry.getValue()==maxScore) {name =entry.getKey();}
			totalScore += entry.getValue();
			avg=totalScore/hm.size();
			
			
		}
		
		System.out.println("평균점수 : "+ avg	);
		System.out.println("최고점수 : "+ maxScore	);
		System.out.println("최고점수를 받은 아이디: "+ name);
	}

}
