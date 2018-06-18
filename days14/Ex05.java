package days14;

public class Ex05 {
	
	// 중복선언할 수 없다...
/*	public  int sum(int a, int b) {
		return a+b;
	}
	private int sum(int a, int b, int c) { 
		return a + b + c;
	}
	private int sum(int a, int b, int c, int d) { 
		return a + b + c + d;
	}
	
	private int sum(int [] m) { 
		int result = 0 ;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}*/
    
	
	// int ... args  가변인수   
	public int sum(int ... args) {
		int result = 0;
		for (int i : args) {
			result += i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Ex05 obj = new Ex05();
		//          객체명.메서드(int, int)
		int hap = obj.sum(1,2);
		System.out.println(hap); 
		System.out.println(obj.sum(1, 2, 3 ));
		System.out.println(obj.sum(1, 2, 3, 4 ));
		
		int [] m = {1,2,3,4,54,56};
		System.out.println(obj.sum( m ));
		
		// p 219 매개변수의 수를 모를 경우 
		// p 230 메서드 오버로딩(중복함수)
		
		System.out.printf("TEST");
		
		
		
		System.out.printf("%s  %d  %c %b %f"
				, "aaa", 12, 'a', true, 3.14); // Object... args
		
	}

	

}
