package days17;

public abstract class Employee 
            implements IEmployee {
	// field
	private String name;		// 사원명
	private String addr;		// 주소
	private String tel;			// 연락처
	private String hiredate;	// 입사일자
	
	// constructor
	public Employee() {
		System.out.println("> Employee 기본 생성자 호출됨.");
	}
	// Alt + Shift + S
	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}
	
	// method
	public void dispEmpInfo() {
		System.out.printf(
				"> 사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n"
				, this.name, this.addr, this.tel, this.hiredate);
	}
	
	// 추상메소드 ? 이유
	// 실체 클래스에서 급여 계산이 모두 실체 따라 달라지기에...
	//protected abstract int getPay() ;
}
