package days18;

public class Ex03 {

	public static void main(String[] args) {
		// 실행예외
		//1. 
		//2.ArrayIndexOutBoundsException 클래스
		/*
		int [] m = new int[3];
		m[3]=100;
		*/
		
		String n = "100";
		int value1= Integer.parseInt(n);
		
		String m = "10a";
		int value2= Integer.parseInt(m);
		//java.lang.NumberFormatException 
		//-> Integer.parseInt() 메소드로 문자열을 숫자(int)로 변환하다가 발생한 오류
		
		
		
		

	}

}
