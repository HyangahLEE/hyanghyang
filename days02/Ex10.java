package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		// 이름 입력
		// 국어, 영어, 수학 점수 입력
		// 총점 출력
		// 평균 출력

		// > 홍길동 kor=90 eng=88 mat=98 total = 276 avg=92.xx
		// 평균 소수점 2자리 까지 출력
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		// kor = eng = mat =0    한꺼번에 초기화 가능
		// kor = 0, eng = 0, mat = 0 따로 초기화하는 방법

		BufferedReader br =
				new BufferedReader(
						new InputStreamReader(System.in));
		// 암기사항

		System.out.printf("> 이름을 입력하세요 : ");
		name = br.readLine();		

		System.out.printf("> 국어점수를 입력하세요 : ");
		kor = Byte.parseByte(br.readLine());
		// string을 바이트로 형변환 해야한다.  String -> Byte

		System.out.printf("> 영어점수를 입력하세요 : ");
		eng = Byte.parseByte(br.readLine());

		System.out.printf("> 수학점수를 입력하세요 : ");
		mat = Byte.parseByte(br.readLine());

		tot =  (short) (kor+eng+mat);
		// byte+byte = int / short + byte = int  연산처리는 int가 빠르기 때문에 int로 처리하고 int형으로 반환한다.
		// () : 최우선 연산자
		// (변경하고자 하는 자료형)(값) : cast(형변환) 연산자  형변환은 자동/강제
		avg = (double)tot/3;
		// 정수 / 정수 -> 정수
		// 실수 / 정수 -> 실수  / 정수/실수 -> 실수
		
		
		System.out.printf("> 이름 : %s\n", name);
		System.out.printf("> 국어점수 : %d\n", kor);
		System.out.printf("> 영어점수 : %d\n", eng);
		System.out.printf("> 수학점수 : %d\n", mat);
		System.out.printf("> 총점 : %d\n", tot);
		System.out.printf("> 평균 : %.2f\n", avg);

		// 기본형(원시형)을 사용하기 쉽도록 클래스로 만들어 둔 것 = 래퍼(Wrapper Class)
		// byte 기본형 / Byte 클래스
		// long  기본형 / Long 클래스
		// boolean 기본형 / Boolean 클래스

		// Integer.parseInt() int 형 변환
		// Integer.parseInt() int 형 변환

	}

}
