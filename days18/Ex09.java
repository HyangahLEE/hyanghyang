package days18;

class Score{
	// field
	private int kor;
	// getter , setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) throws ScoreOutOfBoundsException {
		if(!( kor >=0 && kor <=100) )
			throw new ScoreOutOfBoundsException(1004
					,"> 점수 범위(0<= kor <=100) 벗어남.");
		else  this.kor = kor;
	}	
	
}

public class Ex09 {

	public static void main(String[] args) {
		Score s1= new Score();
		Score s2= new Score();
		
		try {
			s1.setKor(100);
			System.out.println(s1.getKor());
			s2.setKor(200);
			System.out.println(s2.getKor());
		} catch (ScoreOutOfBoundsException e) {
			System.out.println("--ERR---");
			/*
			System.out.println("에러 코드값 : " + e.getERR_CODE() );
			에러 코드값 : 1004
			*/
			/*
			System.out.println( e.toString() );
			days18.ScoreOutOfBoundsException: > 점수 범위(0<= kor <=100) 벗어남.
			*/
			/*
			System.out.println(e.getMessage());
			> 점수 범위(0<= kor <=100) 벗어남.
			*/
			// e.printStackTrace(); ***
			/*
			days18.ScoreOutOfBoundsException: > 점수 범위(0<= kor <=100) 벗어남.
			at days18.Score.setKor(Ex09.java:13)
			at days18.Ex09.main(Ex09.java:29)
			*/
		}
		
		 

	}

}