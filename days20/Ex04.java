package days20;

public class Ex04 {

	public static void main(String[] args) {
		
		String str1 = "안녕하세요. 홍길동입니다." ;
		char [] buffers = new char[str1.length()];
		int len = str1.length() - 1;
		for (int i = 0; i < buffers.length; i++) {
			  buffers[len - i ] = str1.charAt(i);
		}
		// char [] -> String
		String str2  = new String(buffers);
		System.out.println(str2);
		
		
		
		
		System.out.println(str1);
		
		
		// "홍길동"을 찾아서 그 뒤에 "장군" 문자열 추가...
		// System.out.println( str1.replace("홍길동", "홍길동장군")  );
		/*  삽입, 추가, 삭제 등등 String 클래스 
		int idx = str1.indexOf("홍길동");  // 7
		int len = "홍길동".length();
		System.out.println( 
			 str1.substring(0, 7 + len ) +"장군" + str1.substring( 7 + len) );
		*/
		
		
		
		// StringBuffer  와  StringBuilder 차이점
		// 동기화 처리 O         동기화 처리 X
		// 멀티스레드 사용 O    싱글스레드 사용 O
		
		// 동기화 ? 
		
		
		// ㄱ. String 클래스는 불변하다. 
		// ㄴ. String replace()
		//String data ="a";
		//data = data +"a";   // data = "aa" 객체

		//
		/*
		String sql ="with yourcte as ";
		sql +="(";
		sql +="select ";
		sql +="*";
		sql +="select ";
		sql +="select ";
		sql +="select ";
		sql +="select ";
		sql +="select ";
		sql +=") ";
     	*/	
	}

}
