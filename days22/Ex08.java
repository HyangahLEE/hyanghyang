package days22;
 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex08 {

	public static void main(String[] args) {
		// p 732
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		
		processingTime(list1);
		processingTime(list2);

	}

	private static void processingTime(List list) {
		long startTime, endTime;
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) { 
			list.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		Class clz = list.getClass();
		System.out.println("> "+ clz.getName() +" 처리 시간 : " 
		+ (endTime - startTime)+" ns");
	}

}
