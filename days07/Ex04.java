package days07;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		//                 [0]1234[5]6789[10]11121314[15]161718
		//                     0  -  1  -   2   -   3
		String card ="3189-2134-7433-8978";
		// long System.currentTimeMillis()
		Random rnd = new Random( );
		int idx = rnd.nextInt(4); // 0<=   정수 <4
		 
		String [] cards = card.split("-");
		cards[idx] = "****";
		
		System.out.printf("%s-%s-%s-%s\n", 
				cards[0],cards[1],cards[2],cards[3]);
		                                                                     //substring 앞에꺼짤라옴
		card = String.join("-", cards);                        //.join("-", cards); 구분자를 합치겟다.
		System.out.println(card);
		
		/*
		String card ="3189-****-7433-8978";
		String card ="3189-2134-7433-****";
		String card ="****-2134-7433-8978";
		*/
		
		/*
		String rrn = "780112-1700001";
		// rrn.substring(0, 2)
		// beginIndex만 있을 경우 문자열끝까지.....
		System.out.println( rrn.substring(7) );
		System.out.println( rrn.substring(0, 6)+"-"+"*******" );
		*/

	}

}