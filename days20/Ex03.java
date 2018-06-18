package days20;

public class Ex03 {

	public static void main(String[] args) {
		// p 514 StringBuffer , StringBuilder 클래스
		/*
		String data = "a";  // 17472858442 ns
		long start = System.nanoTime();

		for (int i = 0; i < 300000; i++) {
			data += "a";
		}
		
		long end = System.nanoTime();
		System.out.println(end - start +" ns");
		*/
		
		StringBuilder sb = new StringBuilder("a");  // 6868432 ns
		long start = System.nanoTime();

		for (int i = 0; i < 300000; i++) {
			sb.append("a");
		}
		
		long end = System.nanoTime();
		System.out.println(end - start +" ns");
	}
	

}






