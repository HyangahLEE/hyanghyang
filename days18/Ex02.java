package days18;

import java.util.Scanner;

import days17.Regular;

public class Ex02 {

	public static void main(String[] args) {
		// [ chapter 10 예외 처리 ]
		/* p 422
		 * 1.  [오류]
		 *    ㄱ. 에러( Error ) - 컴퓨터 하드웨어 오작동...
		 *    ㄴ. 예외( Exception ) == 오류 - 에러( Error )
		 *        - 사용자의 잘못된 조작 또는
		 *        - 개발자의 잘못된 코딩으로 발생하는 프로그램 오류.
		 *            ( 문법적인 오류 )  // 컴파일 에러
		 *          int i = "100"; 
		 *          int i = 100
		             System.out.print(i);
		 * 2. 예외 발생하면 프로그램은 곧 바로 종료한다. 
		 * 3. 예외 발생하면 종료하지 않도록 처리(정상 실행 상태가 유지)가
		 *     필요하다. -- 예외 처리 
		 * 4.  예외는 2가지 종류
		 *     ㄱ. 일반 예외( Exception ) == 컴파일 오류
		 *       int i
		          System.out.println(i);
		 *     ㄴ. 실행(런타임) 예외( Runtime Exception ) 
		 *     int [] m = null;
				// java.lang.NullPointerException
				System.out.println(m[0]);    
			5. 자바에서는 예외를 클래스로 관리한다. 
			    [VM]은 프로그램을 실행하는 도중에 예외가 발생하면
			     [해당 예외 클래스의 객체]를 생성한다. 	
			     개발자 예외에 대해 처리할 수 있도록..제공... 
			     예)
			     VM
			     java.lang 패키지 안의 NullPointerException 예외클래스 객체
			6. 모든 예외 클래스 부모 클래스는  Exception 클래스이다.
			    Exception
			       자식
			         RuntimeException
			             NullPointException, ClassCastException...
			7. 실행 예외
			   ㄱ.            
		 * */ 
		 /*
		 int [] m = null;  // new int[10];
		 //
		 //
		 //
		 System.out.println(m[0]);   // 런타임에러
		*/
		
		/*
		// java.lang.NullPointerException
		Regular emp  = null				; // 객체 생성 X
		emp.getPay(); // new Regular() 인스턴스 메소드
		*/
		
		// java.lang.NullPointerException
		// F3
		/*
		String data = null;
		System.out.println(data); // this
		// System.out.println(data.toString()); // this 
		   String 클래스 에서 오버라이딩(재정의)
		*/
		
		
		/*
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("> kor input ? ");
		 // java.util.InputMismatch예외
		 int kor = scanner.nextInt(); // 10a 엔터
		 System.out.println(kor);
		 */

	}

}





