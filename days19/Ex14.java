package days19;

public class Ex14 {

	public static void main(String[] args) {
		// length()
		// p 506 문자열 대치 : replace()
		
		// 소스에 이석화   3군데 있는 데 ..     이석화.. 또는 ... 있는 이석화 -> 이덕화
		String source = "이   안녕하세요. 이석화.. 이석화... 이석화 입니다.";
		String name ="홍길동";
		/*
		이석화..
		이석화...
		
		이석화(.){2,3}
		*/
		// System.out.println( source.replaceAll("(이석화..|이석화...)", "이덕화") );
		System.out.println( source.replaceAll("이석화(\\.){2,3}", "이덕화") );
		
		//source.replaceFirst(정규표현식, replacement)
		//source.replaceAll(정규표현식, replacement)
		// System.out.println( source.replaceAll("이석화", name) );
		
		
		//System.out.println( source.replace("이석화", name) );
		// CharSequence 자료형 : String
		// interface CharSequence -> String 매개변수 다형성
		
		//StringBuffer sb = new StringBuffer("홍길길");
		//System.out.println( source.replace("이석화", sb) );
		
		
		
		//source.replace(char oldChar,char newChar)
		/*
		String data =  source.replace('이', 'X');
		System.out.println(data);		
		System.out.println(source); // 원래 문자열은 변경X (불변)
		*/
		
		

	}

}
