package days22;

import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {

		Vector vt = new Vector();
		vt.add("이향아");
		vt.addElement("이향아");
		vt.addElement("이향아");
		vt.addElement("이향아");
		vt.addElement("이향아");
		System.out.println(vt);
		
		//vt.set(1, "김현영");
		vt.setElementAt("김현영", 1);
		System.out.println(vt);
	
		vt.removeElementAt(0);
		System.out.println(vt);
		
		vt.insertElementAt("신정연", 3);
		System.out.println(vt);
		
		vt.capacity();//방개수
		vt.size();//안에 들어갈수 있는 요소의 개수
	}

}
