package days17;

public class Temp extends Employee{
	// field
	private int days; // 근무일수
	private int dayOfPay; // 하루 일당.
	// constructor
	public Temp() {
		System.out.println("> Temp 기본 생성자 호출됨.");
	} 

	public Temp(String name, String addr
			, String tel, String hiredate
			, int days, int dayOfPay) {
		super(name, addr, tel, hiredate); 
		this.days = days;
		this.dayOfPay = dayOfPay;
		System.out.println("> Temp 6 생성자 호출됨.");
	} 

	// method
	public int getPay() {
		System.out.println("> Temp 급여 계산 메소드 호출됨.");
		return this.dayOfPay * this.days;
	}
	

}
