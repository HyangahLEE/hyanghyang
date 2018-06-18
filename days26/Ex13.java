package days26;

public class Ex13 {

	public static void main(String[] args) {
		// Java 스레드 사용하는 방법
		// 1. Runnable 인터페이스    구현
		// 2. Thread    클래스          상속
		
		// main 스레드  -  main() 메소드 독립적으로 수행.
		/*
		Thread t = Thread.currentThread();
		String t_name = t.getName();
		*/
		
		String t_name = Thread.currentThread().getName();
		System.out.println("> 현재 main() 메소드를 실행하는 스레드명  : " 
		                         + t_name );

	}

}
