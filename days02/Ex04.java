package days02;

public class Ex04 {

	public static void main(String[] args) {
		/*
		System.out.println("이향아");
		// Object... args    
		System.out.printf("이석화\n");
		// %d ,%x , %o, %s
		String name = "이석화";
		System.out.printf("> 이름은 %s 입니다.\n",name);
		*/
		
		//                1$
		//                                  #
		//                                         전체자리수
		// %[argument_index$][flags][width][.precision]conversion
		// %                                                              d
		// %                                                              x
		// %                                                              o
		// %                                                              s
		String name = "이향아";
		int n = 100;
		System.out.printf("[%s]-(%2$-20d)-(%2$#x)\n",name, n);
		
		// 실수          %f
		//    (기본값) 소숫점 6자리 까지 출력
		// 평균 출력 소수점 2자리 출력
		double age = 98.123456789;
		System.out.printf("%010.2f \n", age);
		
		boolean flag = true;
		System.out.printf("%B", flag);
	}

}
