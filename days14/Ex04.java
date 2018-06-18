package days14;

public class Ex04 {
	
	// p 222 리턴값이 없는 메소드 : void 
	public void disp() {
		System.out.println("A");
		System.out.println("B");
		return ; // 메서드를 호출한 곳으로 돌아가겠다.
		// Unreachable code
		//System.out.println("C");
	}

	public static void main(String[] args) {
		Ex04 obj = new Ex04();
		//int result = obj.disp();
		

	}

}





//[ 공지 사항 ]
		// 내일(2018.05.18(금)) 
		// 5시 20분 ~ 6시 00분 
		// 사장님 특강...