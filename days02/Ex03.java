package days02;

public class Ex03 {

	public static void main(String[] args) {
		// Data Type
		byte  b  ;  //  -128~127 정수
		b = 10;
		// > b = 10[Exception in thread "main" java.util.MissingFormatArgumentException:
		// Format specifier '%x'
		//System.out.printf("> b = %d[%x][%o]\n", b , b , b);
		
		// java.util.UnknownFormatConversionException
		System.out.printf("> b = %1$d[%1$x][%1$o]\n", b);
		
		System.out.printf("%d\n",b);
		System.out.printf("%#x\n",b);
		System.out.printf("%#o\n",b);
		// [ 함수 사용시 3가지 파악 ]
		// 1. 일(기능)
		// 2. 인자, 파라미터, arguments
		// 3. 리턴값
		
		// main() 함수  : 프로그램 시작, 종료 기능(일)
		// printf() / println() / print() 함수  : 표준 출력 장치(모니터) 출력 기능(일)
		
		 
		/*
		PrintStream	printf(Locale l, String format, Object... args)
		PrintStream	printf(String "%s    %d",name, age)

		*/
		
		// 10 : 십진수 정수
		// %d : 10진수 출력 서식
		// %x : 16진수 출력 서식
		// %o : 8진수 출력 서식
		
		// 10 ->                0000 1010
		//                         00 001 010
		//                           0     1    2
		//                        0000 1010
		//                            0    a
		//      <-
		
		// 2진수 :   0 1		
		//                         12
		// 8진수 : 0 1 2 3 4 5 6 7
		// 10진수 : 0  1 2 3 4 5 6 7 8 9
		
		//                         a
		// 16진수 : 0  1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) 14 f(15)
		

	}
}