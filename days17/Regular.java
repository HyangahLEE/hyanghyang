package days17;

public class Regular extends Employee{
	 
	// field
	private int pay;   // 기본급
	// constructor
	public Regular() {
		System.out.println("> Regular 기본 생성자 호출됨.");
	} 

	public Regular(String name, String addr
			, String tel, String hiredate
			, int pay) {
		super(name, addr, tel, hiredate); 
		this.pay = pay;
		System.out.println("> Regular 5 생성자 호출됨.");
	} 
	
	// method
	// Cannot reduce the visibility of the inherited method from IEmployee
	@Override
	public  int getPay() { 
		System.out.println("> Regular 급여 계산 메소드 호출됨.");
		return this.pay;
	}
	
	@Override
	public void dispEmpInfo() { 
		super.dispEmpInfo(); // Employee.dispEmpInfo()  
		System.out.printf("> pay : %d\n", this.pay); 
		
		// The field Employee.name [is not visible]
		/*
		System.out.printf(
				"> 사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d \n"
				, this.name, this.addr, this.tel, this.hiredate, this.pay);
		*/
	}
	

}
