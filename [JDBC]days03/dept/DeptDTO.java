package days03.dept;

public class DeptDTO {

	
			/*DEPTNO NOT NULL NUMBER(2)    
		DNAME           VARCHAR2(14) 
		LOC             VARCHAR2(13) */
		// 단지 하나의 데이터를 주고받을 수 있는 객체 
		
	private int deptno;
	private String dname;
	private String loc;
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	
	
	

}
