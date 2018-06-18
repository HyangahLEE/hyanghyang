package days19;

public class Ex04 {

	public static void main(String[] args) {
		// p 481 System 클래스
		// [프로그램 종료], [키보드 표준 입,출력], [메모리 정리]
		// [현재 시간 읽기], 시스템 프로퍼티 읽기,
		// 환경 변수 읽기 등...
		
		// System.exit(-1);		
		// System.gc();
		
		// 1000ms == 1초
		//long System.currentTimeMillis();  (1/1000초)
		
		// 1nano == 1/10^9초
		//long System.nanoTime();
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		// 주로 프로그램의 실행 소요 시간을 측정할 때 자주 사용한다. 
		
	}

}
