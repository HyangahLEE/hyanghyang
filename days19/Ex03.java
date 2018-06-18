package days19;

import java.util.Objects;

public class Ex03 {

	public static void main(String[] args) {
		// p 480  Object.toString()
		//           Objects.toString()  재정의
		
		
		
		// p 478  널 여부 조사 ( isNull(), nonNull(), requireNonNull() )
		String name = null;
		// name == null? "홍길동":name;
		// if( name == null) name ="홍길동"
		System.out.println( Objects.toString(name, "홍길동") );
		
		//  requireNonNull()   name 널일경우 다른 문자열로 치환..
		/*
		try {
			//String data = Objects.requireNonNull(name, "이름이 없습니다.");
			String data = Objects.requireNonNull(name
					, () -> "이름이 없습니다.");  // 람다식
		} catch (Exception e) {
			 System.out.println("■  "+e.getMessage());
		}
		*/
		
		/*
		// System.out.println( Objects.isNull(name) );  // true(null)
		//if( !Objects.isNull(name) ) {
		if( Objects.nonNull(name) ) {
			System.out.println( name.toString() );
		} 
		*/
		/*
		if( name  !=  null ) {
			System.out.println( name.toString() );
		}
		*/
		/*
		try {
			System.out.println( name.toString() );
			//
			//
			//
		}catch(NullPointerException e) { 
		}catch (Exception e) { 
		}
		*/

		
		
	}

}
