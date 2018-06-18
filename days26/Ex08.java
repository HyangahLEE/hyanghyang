package days26;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex08 {

	public static void main(String[] args) {
		try( 
				FileInputStream in = new FileInputStream("student.dat");
				ObjectInputStream ois = new ObjectInputStream(in)
				) { 
			     Student s = (Student) ois.readObject();
			     System.out.println(s.getName() +" : " + s.getAvg());
			     
			     System.out.println("= END =");
			
		} catch (Exception e) { 
		}

	}

}
