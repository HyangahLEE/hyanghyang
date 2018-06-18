package days10;

public class Ex06 {

	public static void main(String[] args) {
		// [가변 배열]p211~.잘안씀 개념만잡기.(2차원 이상 배열을 생성할때 마지막 차수에 길이 (행, 열)에서 열 ,,
		//다른 길이의 배열을 생성함으로써 좀 더 유동적인 배열.
		
		//30
		//27
		//20
		//30
		
		int [][] ban = new int [4][];
		ban[0] =  new int[30];
		ban[1] =  new int[27];
		ban[2] =  new int[25];
		ban[3] =  new int[30];
		
		for (int i = 0; i < ban.length; i++) {
			for (int j = 0; j < ban[i].length; j++) {
				System.out.print("[]");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
