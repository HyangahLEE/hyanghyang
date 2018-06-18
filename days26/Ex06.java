package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Member{
	private String name;
	private long type;
	private boolean gender;
	
	public Member() {}
	public Member(String name, long type, boolean gender) {
		super();
		this.name = name;
		this.type = type;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	// 파일에 객체 저장
	// m01.writeExternal(fileName);
	public void writeExternal(String fileName) {
		try(
				FileWriter out = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(out);
				) {
			bw.write(this.name+"\n");
			bw.write(this.type+"\n");
			bw.write(this.gender+"\n");
			System.out.println("> 객체 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 
	public Member readExternal(String fileName) { 
		// 파일을 읽어서 객체로 만들어서 반환...
		Member m = null;
		try(
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				) {
			 String name = br.readLine();
			 long type = Long.parseLong(   br.readLine()  );
			 boolean gender = Boolean.parseBoolean( br.readLine() );
			 m = new Member(name, type, gender); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	} 
	
}

public class Ex06 {

	public static void main(String[] args) {
		// *** p 1043 객체 입출력 보조 스트림 ***
		// 1. 메모리에 생성된 객체(?)를 파일 또는 네트워크 출력<->입력
		// 2. Student 클래스 s1 = new Student();
		//     읽기<- s1 객체  -> 저장
		// 3. ObjectInputStream / ObjectOutputStream
		//     ois.readObject()        oos.writeObject()
		
		Member m01 = new Member("홍길동", 1000, true);
		String fileName = "member.dat";
		// Member 클래스 안에   writeExternal() 선언 
		// 객체를 파일로 저장.....
		m01.writeExternal(fileName);
		
		// 파일로부터 객체를 생성. 
		Member m02 = new Member();
		m02 = m02.readExternal(fileName);
		System.out.printf("%s\t%d\t%b\n"
				,  m02.getName(), m02.getType()
				, m02.isGender() ); // boolean   is~()
	}

}
