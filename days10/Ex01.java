package days10;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int [] m = {1,5,3};
		int [] n = new int[6];

		System.arraycopy(m, 0, n, 0, m.length);
		
		for (int i : n) System.out.println(i);
				
	}
}
