package days26;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/*
public class Student 
                  implements Externalizable{  // 표시 기호..
	//  static 정적 필드          .. 직렬화 X
	//  transient  키워드 필드 .. 직렬화 X
	
	// fields
	private int number; // 학번
	private String name ;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private int rank;
	
	// constructors
	public Student() {}  // default(기본) constructor
	public Student(int number, String name, int kor, int eng, int mat, int tot, double avg, int rank) {
		super();
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
	}
	
	// getter, setter    [ alt + shift +s ]
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	// 직렬화     구현
	@Override
	public void writeExternal(ObjectOutput out) 
			throws IOException {
		//                              ObjectOutput out
		out.writeUTF(this.name);
		out.writeInt(this.kor);
		out.writeInt(this.eng);
		out.writeInt(this.mat);
		out.writeInt(this.tot);
		
		// number , rank, avg  직렬화  XX
	}
	
	// 역직렬화   구현
	@Override
	public void readExternal(ObjectInput in) 
			throws IOException, ClassNotFoundException {
		this.name =  in.readUTF();
		this.kor = in.readInt();
		this.eng = in.readInt();
		this.mat = in.readInt();
		this.tot = in.readInt();
		// number, avg , rank  X
	}
}
*/
 
public class Student 
                  implements Serializable{  // 표시 기호..
	//  *** static 정적 필드          .. 직렬화 X
	//  transient  키워드 필드 .. 직렬화 X
	
	private static final long serialVersionUID =
			8438457092357547166L;
	
	// fields
	private transient int number; // 학번
	private String name ;
	private int kor, eng, mat;
	private int tot;
	private transient double avg; // 직렬화 X
	private transient int rank;
	
	// constructors
	public Student() {}  // default(기본) constructor
	public Student(int number, String name, int kor, int eng, int mat, int tot, double avg, int rank) {
		super();
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
	}
	
	// getter, setter    [ alt + shift +s ]
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}  
} 