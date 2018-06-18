package days03;

public class Ex08 {

	public static void main(String[] args) {
		
		//논리연산자
		// 1) 일반논리연산자 :  !  &&  ||
		//      ㄱ. ! 부정(Not)연산자  !true             false
		//                                   !false            true
		System.out.println(!true); //트루 펄스 바뀜
		//  The operator ! is undefined for the argument type(s) int   (err)
		System.out.println( !(5>3) );    // 우선순위 보기
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		
		//      ㄴ. && 일반논리 AND 연산자(논리곱)              ***암기
 		//        true   &&  true   true      1    1    1      
		//        true   &&  false   false    1    0    0      *  두개 중에 하나라도 참이면 참이다. *
		//        false  &&  true    false    0    1    0
		//        false  &&  false   false    0    0    0
		
//		System.out.println( 3>5 || 5>3 );      //true
		
        //	  	System.out.println( 5>3 && 2>1);
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		//      ㄷ. || 일반논리 OR 연산자(논리합)
		
		
		// 2) 비트논리연산자 :  ~ & | ^
			//      ㄱ. ~ 비트부정(틸드) 연산자
		System.out.println( ~5 );  //-6
		//  ~00000101
		//    11111010 
		// -                1
		//    11110101
        //보수
		//    00000110
		//10진수
		//      4+2+0=6
		//                 -6
		
		
		
			//      ㄴ. & 비트논리 AND 연산자(논리곱)
//	                  System.out.println( 10 & 5 );  
		
		
		
		
		
		
		
			//      ㄷ. | 비트논리 OR 연산자(논리합)
		  System.out.println( 10 & 5 );  //   15
		  //10                  00001010
		  //  5                  00000101
		  //  |                   00000000
           // 		                 11111111 
		  
		  
		  
		 //        ㄹ. ^ XOR 연산자 (e[X]clsiuve OR)
		                                      //배타적인
		
		
		
/*		//비교연산자  : true, false  (boolean)
 *     instanceOf 연산자 x 클래스의 인스턴스 비교연산자. (아직안함)
		//>  <  >=  <=
		System.out.println( 5 > 3 );  // true
		System.out.println( 5 < 3 );  // false
		System.out.println( 5 >= 3 ); // true 
		System.out.println( 5 >= 3 ); // false
		//주의  ** 
		//5와 3이 같냐?    ==   
		System.out.println( 5 == 3);
		//5와 3이 다르냐?  !=
		System.out.println(5 != 3);
		*/
		
}
}