package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex07 {

	public static void main(String[] args) {
		Student s =
				new Student(1, "홍길동", 89, 78, 99, 266, 88, 1);
		 try(
				 FileOutputStream out = new FileOutputStream("student.dat");
				 ObjectOutputStream oos = new ObjectOutputStream(out)
				 ) {
			/*
			 java.io.NotSerializableException: days26.Student
				at java.io.ObjectOutputStream.writeObject0(Unknown Source)
				at java.io.ObjectOutputStream.writeObject(Unknown Source)
				at days26.Ex07.main(Ex07.java:16)
			*/	
			 oos.writeObject(s); 
			 System.out.println("> 객체 저장 완료!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
