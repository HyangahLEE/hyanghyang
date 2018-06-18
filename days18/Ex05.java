package days18;

import days17.Regular;

public class Ex05 {

	public static void main(String[] args)  {
		//Regular emp = new Regular();
		
		String className = "days17.Regular";
		//Unhandled exception type ClassNotFoundException
		//forName() : 클래스의 객체를 리턴
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
