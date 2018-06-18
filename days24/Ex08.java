package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap; 
 
// 학번(no) 학생명(name)
// *** 동등한 객체 : hashCode() , equals() 오버라이딩... ( 기억 ) 
class Student implements Comparable<Student>{

	int no;//학번
	String name; //이름
	
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
			Student s = (Student) obj;
			if( this.no == s.no ) return true;
		}
		return false;
	}
	
	
}

public class Ex08 {

	public static void main(String[] args) {
		// [ JSP/Servlet  사용 ]  
		// Key     Student      학번, 이름
		// Value  ArrayList     국,영,수 90,89,77
		 Hashtable<Student, ArrayList<Integer>> ht =
				new Hashtable<>(); 
		
		// TreeMap<Student, ArrayList<Integer>> ht =
		//					new TreeMap<>();
		 
		 Student s1 = new Student(1, "이석화");
		 ArrayList<Integer> list1 = new ArrayList<>();
		 list1.add(90);list1.add(89);list1.add(77);
		 
		 ht.put(s1, list1);
		 // List<Integer>  Arrays.asList();
		 // ArrayList<Integer> Arrays.asList();  
		 // java.lang.ClassCastException:
		 
		 Student s2 = new Student(2, "김재곤");
		 ArrayList<Integer>  list2 = new ArrayList<>();
		 list2.add(77);list2.add(66);list2.add(44);
		 ht.put(s2, list2);
		 
		 ArrayList<Integer>  list3 = new ArrayList<>();
		 list3.add(90);list3.add(69);list3.add(98);
		 ht.put(new Student(3, "이혜원"), list3);
		 
		 
		// 모든 학생 정보 출력
		// 학번	학생명		국어	영어	수학	[총점	평균]
		// 학번	학생명		국어	영어	수학	[총점	평균]
		// 학번	학생명		국어	영어	수학	[총점	평균]
		/*
		 1	이석화		90	89	77
		 2	김재곤		77	66	44
		 3	이혜원		90	69	98
        */
		 
		 // Ctrl + Shift + O
		 Iterator<Entry<Student, ArrayList<Integer>>>  ir =
				  ht.entrySet().iterator();
		 while (ir.hasNext()) {
			Entry<Student,ArrayList<Integer>> entry =
					(Entry<Student,ArrayList<Integer>>) ir.next();
			
			Student s = entry.getKey();
			ArrayList<Integer> score = entry.getValue();
			
			System.out.printf("%d\t%s\t\t%d\t%d\t%d\n"
					, s.no, s.name
					, score.get(0), score.get(1), score.get(2) );
			
		}
	

	}

}
