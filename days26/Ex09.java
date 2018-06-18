package days26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
// 부모클래스가 Serializable인터페이스를 구현하고
// 자식클래스가 Serializable인터페이스를 구현하지 않았다면.
// 자식클래스 모두 직렬화 된다. ( 부모 필드 + 자식  필드 )
class Parent implements Serializable{
	public String field1;
}

class Child extends Parent{
	public String field2;
}
*/

// 부모 Serializable X
class Parent{
	public String field1;
}

// 자식 Serializable O
class Child extends Parent  implements Serializable{
	public String field2;
	
	// 부모필드는 직렬화에 포함 X -> 해결.. 
	// 자식 클래승에 wirteObject(), readObject() 메소드를 선언해서
	// 직접 부모객체의 필드를 직렬화에 포함.....
	private void writeObject(ObjectOutputStream out)
	   throws IOException{
		out.writeObject( this.field1 );
		//
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in)
	    throws IOException, ClassNotFoundException{
		// this.field1 = (String) in.readObject();
		this.field1 = in.readUTF();
		//
		in.defaultReadObject(); 
	}
	
	
}

public class Ex09 {

	public static void main(String[] args) {
		// Child obj객체  -> 
		// ObjectOutputStream oos ;
		// oos.writeObject(obj);
		
		try( 
				FileOutputStream in = new FileOutputStream("student.dat");
				ObjectOutputStream oos = new ObjectOutputStream(in)
				) { 
			  Child child = new Child();
			  child.field1 ="홍길동";
			  child.field2= "이향긔";
			  oos.writeObject(child);
		     System.out.println("= END =");
			
		} catch (Exception e) { 
		}
		
		
		try(FileInputStream fis = new FileInputStream("student.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);	) {
			
			Child c = (Child) ois.readObject();
			System.out.println("f1 :" + c.field2);
			System.out.println("f2: "+ c.field2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
