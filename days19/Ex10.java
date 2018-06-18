package days19;

public class Ex10 {

	public static void main(String[] args) {
		// [ 자바 API (  문자열 다루는 클래스  ) ] p 496
		// 1. String
		// 2. StringBuilder
		// 3. StringBuffer
		// 4. StringTokenizer
		
		//String name = new String("홍길동");
		// String name = "홍길동";  // 인스턴스 
		 
		// byte [] 을 String 형변환 
		// byte [] bytes;
		// String data = new String(bytes);
		// String data = new String(bytes, "UTF-8");
		// [][][][][x][x][x][x][x][][][][][][][][][][][]
		// String data = new String(bytes, int offset, int length,"UTF-8");
		
		// byte 정수 자료형
		byte [] bytes = { 72, 101,108,108,111,32 };
		String str1 = new String(bytes);
		System.out.println(str1);  // "Hello"
		

	}

}
