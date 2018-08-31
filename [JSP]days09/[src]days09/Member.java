package days09;

import java.io.Serializable;

//자바빈
public class Member implements Serializable {

	private String id;
	private String pwd;
	private String grade;
	
	public Member() {}

	public Member(String id, String pwd, String grade) {
		this.id = id;
		this.pwd = pwd;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
