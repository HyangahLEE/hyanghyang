package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex10 {

	public static void main(String[] args) throws IOException {

		//이름
		//국어
		//영어
		//수학

		//총점 국어 +영어 + 수학
		//평균 = 총점 /3

		//>홍길동 kor=90 eng=88 mat=99 tot=278  avg=92.xx 
		// (조건 : 평균 소수점 2자리까지 출력)

		String name;
		int kor, eng, mat;
		int tot, avg;
		
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println(">이름을 입력하세요?");
		name =  br.readLine();
		System.out.printf(">name =%s\n",name);
		//kor = br.read()
		System.out.printf(">");
		
		
	   
	
		




	}


}
