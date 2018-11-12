package days18;

import days13.Point;

class Counter{
	
	private int no;
	
	public Counter(int no) {
		this.no= no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + " 번 객체의 finalize()가 실행됨.");
	}
	
}

public class Ex15 {

	public static void main(String[] args) {
		// p 472 객체 소멸자( finalize() )
		
		Counter counter = null;
		for (int i = 1; i <= 50 ; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
		
		/*
		int [] m = new int[3];
		Point p = new Point();
		
		m = null;
		p = null;
		*/

	}

}
