package days06;

public class Ex05 {

/*	Call by Name    
	Call by Value
	Call by Reference*/
	
	
	public static void main(String[] args) {
		int x = 10, y =20;
		System.out.printf("> x=%d, y=%d\n",x,y);
		
		
		/*
		{
			int temp = x;                // x,y 바꾸는 함수식
			x = y;
			y = temp;
		}
        */
		// 함수 호출
		swapXY(x,y);
		
		// 두 기억공간의 값을 바꾸는 함수 선언
		
		System.out.printf("> x=%d, y=%d\n",x,y);
	}

	private static void swapXY(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

}

	