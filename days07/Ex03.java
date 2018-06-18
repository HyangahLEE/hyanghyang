package days07;

public class Ex03 {

	public static void main(String[] args) {
		//                          01 234
		String message = "안녕하세요.홍길동입니다";
		//1. 문자열 길이(함수) : 문자열.length()
		int beginIndex = 3, endIndex =5;
		String result = message.substring(beginIndex, endIndex);
		System.out.println(result);   //"세요"
		
		System.out.println(message.length());  //14
		//2. 문자열 속에서 한 문자 얻어오는 함수 : charAt()
		for (int i = 0; i < message.length(); i++) {
			System.out.println( message.charAt(i));
			
		}
		//3. split() : "홍길동,90,34,22"
		
		// 배열 길이(크기) : 배열명.length
		
		//문자열 속에서 내가 원하는 위치의 문자열을 얻어오는함수
		
	}
}
