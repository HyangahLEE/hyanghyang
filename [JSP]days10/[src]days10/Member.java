package days10;

import java.io.Serializable;

//자바빈즈
public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214595747955552717L;
	private String memberid;
	private String password;
	private String name;
	private String email;
	
	public Member() {
		super();
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
