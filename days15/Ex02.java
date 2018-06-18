package days15;

import java.util.Calendar;


class Man{
	private static Man man = null;
	
	private Man(){}
	
	public static Man getInstance() {
		// 
		if( man == null) {
			man = new Man();
		}
		 return man;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// The constructor Man() is not visible
		// Man m = new Man();
		Man m0 = Man.getInstance();
		Man m1 = Man.getInstance();
		Man m2 = Man.getInstance();
		
		/*
		System.out.println( m0.hashCode() );
		System.out.println( m1.hashCode() );
		System.out.println( m2.hashCode() );
		*/
		//new Person();
		//new Person();
		//                           클래스명 .static메서드()   싱글톤
		//Calednar calednar = Calendar.getInstance();
		
		/*
		 * 1. 싱글톤( Singleton ) : 단 하나만의 객체만 생성.
		 *    ㄱ.  가끔 전체 프로그램에서 [단 하나의 객체]만 만들도록 보장해야
		 *    할 경우가 있다. 
		 *    ㄴ. new 연산자 객체 생성 X   private
		 *    ㄷ. 
		 *    
		 * */ 
		
		
		
	}

}
