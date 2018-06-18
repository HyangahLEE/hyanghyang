package days17;

// 자식클래스를 가질 수 없는 최종 클래스.
public final class SalesMan extends Regular{
	
	// field
	private int sales;  // 판매량
	private int comm; // 커미션
	// constructor
	public SalesMan() {
		System.out.println("> SalesMan 기본 생성자 호출됨.");
	} 

	public SalesMan(String name, String addr
			, String tel, String hiredate
			, int pay, int sales, int comm) {
		super(name, addr, tel, hiredate, pay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	} 
	
	// method
	@Override
	public int getPay() {
		System.out.println("> SalesMan 급여 계산 메소드 호출됨.");
		return super.getPay() + this.sales * this.comm ;
	}

	@Override
	public void dispEmpInfo() { 
		super.dispEmpInfo(); // Regular.dispEmpInfo()
		System.out.printf("> sales : %d, comm : %d\n", this.sales, this.comm); 
	}
}
