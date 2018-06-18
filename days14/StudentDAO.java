package days14;

// DB + 학생 저장,수정,삭제,조회 관련된 기능이 구현된 클래스
// 파일
// [배열]
public class StudentDAO {
	// fields(필드)
    // 클래스 배열 선언
	private StudentDTO [] students ;
	private int numberOfStudents = 30;
	private int cnt  = 0;

	// constructor
	public StudentDAO() { 
		students = new StudentDTO[numberOfStudents];
	}
	public StudentDAO( int number) {
		numberOfStudents = number;
		students = new StudentDTO[numberOfStudents];
	}
	
	// 학생 저장
    public int insert(StudentDTO dto) {
    	students[cnt++] = dto;
    	return 1;
    }
	// 학생 수정
    public int update(int number, StudentDTO dto) {
    	// 검색
    	students[0] = dto;
    	return 1;
    }
    
	// 학생 삭제
    public int delete(int number) {
    	// 삭제
    	return 1;
    }
    
	// 학생 조회
    public StudentDTO  select( int number ) {
    	return null;
    }
    
    public StudentDTO[]  select( String name ) {
    	return null;
    }
	
	
}
