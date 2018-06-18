package days23;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if( age < o.age) return -1;
		else if ( age  == o.age ) return 0;
		return 1;
	}
}

public class Ex13 {

	public static void main(String[] args) {
          TreeSet<Person> treeSet = new TreeSet<>();
          
          treeSet.add(new Person("홍길동",45));
          treeSet.add(new Person("감자바",25));
          treeSet.add(new Person("박지원",31));
          
          Iterator<Person> ir =  treeSet.iterator();
          while (ir.hasNext()) {
			Person person = (Person) ir.next();
			System.out.println(person.name +" : " + person.age);
		}
         

	}

}
