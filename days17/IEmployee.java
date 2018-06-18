package days17;

public interface IEmployee {
	// 상수
	int MALE = 1;     // public static final
	int FEMALE = 0;
	// 추상메소드
	void dispEmpInfo(); // public abstract
	int getPay() ;
	// 디폴트메소드 JDK 8
	// 정적메소드 JDK 8
}
