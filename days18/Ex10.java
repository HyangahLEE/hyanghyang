package days18;

public class Ex10 {

	public static void main(String[] args) throws ScoreOutOfBoundsException,NullPointerException {
		//강제로 예외를 발생시킬때 : throw문 사용
		if(args.length==1)
			throw new ScoreOutOfBoundsException("xx");
		else 
			throw new NullPointerException();
	}

}
