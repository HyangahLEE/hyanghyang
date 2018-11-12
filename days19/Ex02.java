package days19;

import java.util.Comparator;
import java.util.Objects;

import days13.Point;

 
class Student{
	int sno;            // 학번
	String name ;    // 학생명
	Student(){}
	Student(int sno,String name){
		this.sno = sno;
		this.name = name;
	}
}
/*
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	} 
	
}
*/
 
class StudentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		/*
		if( s1.sno == s2.sno) return 0;
		else if( s1.sno < s2.sno) return -1;
		else return 1;
		 */
		
		return Integer.compare(s1.sno, s2.sno);
	}
	
}
 

public class Ex02 {

	public static void main(String[] args) {
		// p 473 Objects 클래스
		// 객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의
		// 연산을 수행하는 정적 메소드들로 구성된 클래스
		/*
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		p1.equals(p2)
		*/
		// 컬렉션 자주 compare~~() 기억
		
		Student  s1 = new Student(1,"홍길동");
		Student  s2 = new Student(1,"홍길동");
		Student  s3 = new Student(2,"이석화");
		
		//  Objects.compare() 객체 비교
		//  s1.equals(s2)   ==   s1[주소]   s2[주소]  false
		int result = Objects.compare(s1, s3,  new StudentComparator()   );
		
		System.out.println(result);
		
	}
	
	// 중첩 클래스 ? 왜 ? 
	/*
	static class Student{
		
	}
    */
	
}


