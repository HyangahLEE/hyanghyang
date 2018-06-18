package days09;

public class Ex05 {

	public static void main(String[] args) {
		int [] m = {1,2,3};
		for (int i : m) {
			System.out.println(i);
		}
		
		fillM(m);

		System.out.println(">>>" + m[1] );
	}

	private static void fillM(int[] m) {

		m[1] = 200;
		
	}

}
