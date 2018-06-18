package days23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Person2 {
	String name;
	int age;
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	} 
}

class DescendingComparator 
       implements Comparator<Person2>{

	@Override
	public int compare(Person2 o1, Person2 o2) {
		if( o1.age < o2.age) return 1;
		else if ( o1.age  == o2.age ) return 0;
		return -1; 
	}
	
}

public class Ex14 {

	public static void main(String[] args) {
          TreeSet<Person2> treeSet =
        		  new TreeSet<>(new DescendingComparator());
          
          treeSet.add(new Person2("홍길동",45));
          treeSet.add(new Person2("감자바",25));
          treeSet.add(new Person2("박지원",31));
          
          Iterator<Person2> ir =  treeSet.iterator();
          while (ir.hasNext()) {
			Person2 person = (Person2) ir.next();
			System.out.println(person.name +" : " + person.age);
		}
         
     // Chapter 18, 13 예습...
	}

}
