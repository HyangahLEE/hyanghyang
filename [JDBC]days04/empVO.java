package days04;

public class empVO {
	
	//fields
	private int empno;
	private String dname;
	private String ename;
	private double sal;
	private int grade;
	
	//constructor
	public empVO(int empno, String dname, String ename, double sal, int grade) {
		super();
		this.empno = empno;
		this.dname = dname;
		this.ename = ename;
		this.sal = sal;
		this.grade = grade;
	}
	
	//getter
	public int getEmpno() {
		return empno;
	}
	public String getDname() {
		return dname;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return String.format("%d\t %s\t %s\t %.2f\t %d",this.getEmpno(),this.getDname()
				,this.getEname(),this.getSal(),this.getGrade());
	}
	
	
	
}
