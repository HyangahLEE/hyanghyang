package days17;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. 사원이라면 공통적으로 가지고 있어야 할 멤버 : Employee
		 *                                                       추상클래스 선언
		 * 2. 정규직(Regular) 사원 클래스  extends   Employee
		 * 3. 영업직(SalesMan) 사원 클래스  extends    Regular
		 * 4. 임시직(Temp) 사원 클래스  extends Employee
		 * */ 
		// Cannot instantiate the type Employee
		// 1. 추상 클래스는 객체 생성할 수 없다.
		//Employee emp = new Employee() ; 
		
		// 2. 무명클래스 ? 의미 파악
		/*
		Employee emp = new Employee() { 
			@Override
			protected int getPay() { 
				return 0;
			}
		};
		*/
		
		// 추상클래스 업캐스팅.
		Employee emp = new Regular("이석화", "위례 신도시"
				, "010-1234-1323", "2018-01-22", 3000000);
		// System.out.println( emp.getPay() );
		emp.dispEmpInfo();

	}

}
