package days18;

public class ScoreOutOfBoundsException 
              extends Exception {
	
	// 필드
	// 생성자 2개 선언 ( 일반적 )
    private final int ERR_CODE;
    // 생성자
    public ScoreOutOfBoundsException() {
    	this.ERR_CODE = 1000;
    }
    public ScoreOutOfBoundsException(String message) {
    	this(1000, message);
    }
	public ScoreOutOfBoundsException(int err_code
			, String message) {
		super(message); // 에러메시지 필드 설정
		this.ERR_CODE = err_code;
	}
	// getter
	public int getERR_CODE() {
		return ERR_CODE;
	} 
}