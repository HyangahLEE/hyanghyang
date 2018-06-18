package days20;

import java.util.ArrayList;
import java.util.List;

import days13.Point;
import days17.Regular;

public class Ex09 {
	
	public static void disp(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		byte b = 10;
		Byte B = new Byte("10");
		
		// "90" -> 90
		int kor = new Integer("90");
		
		// int kor = Integer.valueOf("90");
		/*
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(100);
		*/
		// Object obj = 3
		// 모든 클래스의 부모 클래스는 Object ( 업캐스팅 )
		disp(new Point(1,2));
		disp(new Regular());
		
		disp( 3 );  // int -> Integer -> Object
		disp(true);
		disp(3.14);
		
		// System.out.printf("%s\n", "홍길동",20, true,new Point(1,2));
	}

}
