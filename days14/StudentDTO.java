package days14;

// 한 학생 정보를 저장해서 전달할 때 사용하는  클래스 : DTO
public class StudentDTO {
	// fields
	private int number; // 학번
	private String name ;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private int rank;
	
	// constructors
	public StudentDTO() {}  // default(기본) constructor
	public StudentDTO(int number, String name, int kor, int eng, int mat, int tot, double avg, int rank) {
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
