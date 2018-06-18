package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
/* 
// 학번(no) 학생명(name)
class Student implements Comparable<Student>{

	int no;
	String name; 
	
	public Student(int no, String name) { 
		this.no = no;
		this.name = name;
	} 
	
	@Override
	public int compareTo(Student o) {
		// 코드 작성
		if( this.no > o.no ) return  1;
		else if( this.no == o.no ) return 0;
		else return -1;
	}

	@Override
	public int hashCode() { 
		return this.no;
	}

	@Override
	public boolean equals(Object obj) { 
		if( obj instanceof Student ) {
			Student s = (Student)obj;
			if( this.no == s.no) return true;
		}
		return false;
	}
	
	
}

public class Ex08_02 {

	public static void main(String[] args) {
		// Key     Student      학번, 이름
		// Value  ArrayList     국,영,수 90,89,77
		Hashtable<Student, ArrayList<Integer>> ht =
				new Hashtable<>();
		TreeMap<Student, ArrayList<Integer>> ht =
				new TreeMap<>();
		ArrayList<Integer> scoreList = new ArrayList<>();
		
		scoreList.addAll(0, Arrays.asList(90,89,77));
		ht.put(new Student(1, "이석화"), scoreList  );
		
		scoreList.addAll(0, Arrays.asList(88,99,89));
		ht.put(new Student(2, "김재곤"), scoreList  );
		
		scoreList.addAll(0, Arrays.asList(90,79,99));
		ht.put(new Student(3, "이혜원"), scoreList  );
		// 모든 학생 정보 출력
		// 학번	학생명		국어	영어	수학	[총점	평균]
		// 학번	학생명		국어	영어	수학	[총점	평균]
		// 학번	학생명		국어	영어	수학	[총점	평균]
		Iterator<Entry<Student, ArrayList<Integer>>> ir 
		                          = ht.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<Student, ArrayList<Integer>> entry
                   = (Entry<Student, ArrayList<Integer>>) ir	.next();
			Student student = entry.getKey();
			scoreList = entry.getValue();
			
			System.out.printf("%d\t%s\t\t%d\t%d\t%d\n"
					, student.no, student.name
					, scoreList.get(0), scoreList.get(1), scoreList.get(2));
			
		}

	}

}
*/