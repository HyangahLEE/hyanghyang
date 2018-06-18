package days19;

import java.util.Comparator;
import java.util.Objects;

import days13.Point;

 


class Student{
	
	int sno;
	String name ;
	Student(){}
	Student(int sno,String name){
		this.sno=sno;
		this.name = name;
	}
	
}


class studentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return Integer.compare(s1.sno, s2.sno);
	}
	
	
	
	
}

public class Ex02 {

	public static void main(String[] args) {
	

		Student  s1 = new Student(1,"홍길동");
		Student  s2 = new Student(1,"홍길동");
		Student  s3 = new Student(2,"이석화");
		
		int result =Objects.compare(s1, s2,  new studentComparator());
		System.out.println(result);
		
		
	}
	

}

