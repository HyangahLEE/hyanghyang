package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Student {
	
	// fields
	private int no; // 학번
	private String name ;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private int rank;
	// constructor
	public Student() {
		super(); 
	}
	public Student(int no, String name, int kor, int eng, int mat, int tot, double avg, int rank) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
	}
	
	// getter, setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	} 

	@Override
	public String toString() { 
		return String.format(
				"[%d] %s\t%d\t%d\t%d\t%d\t%.2f\t%d"
				,no, name,kor ,eng,mat,tot,avg,rank);
	}
}

// 열거형 자료형
// JDK 5.0 열거형  이넘(enum)
enum StudentSortOptions {  SCORE, NAME, NO  }

class StudentComparator implements Comparator{ 
	
	private  StudentSortOptions  sortOption ;  // 1 성적   2  이름  3 학번 
	
	public StudentComparator(StudentSortOptions sortOption) { 
		this.sortOption = sortOption;
	} 
	
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		// -1 0 1
		// 성적 asc
		switch(this.sortOption) {
		case  SCORE :  // 성적 asc
			return Integer.compare(s2.getTot() , s1.getTot());
		case NAME:  // 이름 asc
			return s1.getName().compareTo(s2.getName());
		case NO:  // 학번 asc
			return Integer.compare(s1.getNo() , s2.getNo());
		}
		
		return Integer.compare(s1.getNo() , s2.getNo());
	} 
}

public class Ex05 {
	// Student [] students = new Student[30];
	public static ArrayList list = new ArrayList();

	public static void main(String[] args) {
		// 클래스 배열 대신에 ArrayList 컬렉션클래스를 사용해서
		// 학생의 성적 관리...하는 코딩...
		
		// 1. 학생 정보 입력
		list.add(new Student(11,"이석화",90,90,90,270,90,2));
		list.add(new Student(22,"김재곤",100,100,100,300,100,1));
		list.add(new Student(33,"이혜원",80,80,80,240,80,3));
		list.add(new Student(44,"박주영",50,50,50,150,50,4));
		
		// 2. [성적],이름,학번 순으로 정렬.
		list.sort(new StudentComparator( StudentSortOptions.NAME ));
		
		// 3. 학생 정보 출력
		// list.size()    list.get(index)
		Iterator  ir =  list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
	}

}