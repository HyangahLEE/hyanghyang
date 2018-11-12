package days18;

import java.io.IOException;

import org.omg.CORBA.Request;

import days17.Regular;

public class Ex05 {

	public static void main(String[] args) {
		// Regular emp = new Regular();
		// 
		String className = "days17.Regular";
		// Unhandled exception type ClassNotFoundException
		// forName() : 클래스의 객체를 리턴하는 메소드
		try {
			// p 493 동적 객체 생성
			Class<Regular> clazz = (Class<Regular>) Class.forName(className);// Regular emp;
			//Regular emp =  clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// Unhandled exception type IOException
		//System.in.read();

	}

}
