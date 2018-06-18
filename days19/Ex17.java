package days19;

public class Ex17 {

	public static void main(String[] args) {
		String data ="abcedf";
		// char [] buffer = [][][][][c][e][][][][][];
		// data.getChars(srcBegin, srcEnd, dst, dstBegin);
		// data.concat(str)
        //"abc"   +   "ABC" == 	"abc".concat("ABC")
		// 문자열연결연산자               String.문자열 연결 메소드
		
		// 원하는 문자열 얻어오는 메소드 : substring()
		// data.substring(beginIndex, endIndex)
		String rrn = "890212-1******";
		System.out.println( rrn.substring(2, 4) ); // 
		
		String name = "홍길동";
		//"홍길동".equals(name);  // true , false
		//"홍길동".compareTo(name) // ?   [0]  ?
		
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("aDc"));
		//                            98                     68
		System.out.println("Abc".compareTo("aBc"));
		
		// true  / false
		System.out.println("안녕하세요. 홍길동 입니다.".contains("홍길동"));
		// int (-1)  indexOf()  lastIndedxOf()
		
		/*
		data.endsWith(접미사);
		data.startsWith(접두사);
		*/
		
		//String url ="http://www.naver.com";
		String url ="www.naver.com";
		// 입력받은 URL  항상   http:// 시작을 해야지 ....
		// url.indexOf("http://") == 0
		System.out.println( url.startsWith("http://") );
		
		String dir = "c:\\test\\class";
		// charAt()
		// dir.charAt(dir.length()-1)  == '\\'
		// boolean dir.endsWith("\\")
		
		String fname = "test.txt";
		
		//String path = dir + fname;
		String path = dir.concat(fname);
		
		// dir +"\\"+ fname
		// dir.concat("\\").concat(fname)
		
		System.out.println(path);
	}

}
