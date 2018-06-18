package days28;



//Data 클래스의 정수 기억 필드 i가 공유자원(클래스 자체가 공유자원이 됨 i하나밖에 없기때문에)
class Data{
	public int i = 0;
}
//독립적으로 일하는 스레드 객체
class Tom extends Thread{

	@Override
	public void run() {

		for (int i = 0; i <100000; i++) {

		
				Ex02.data.i++;
		
			// ++ 증감연산자
						// 어떤 기억공값을 1증가 시키는 연산자
						// i = i + 1;      ==         i++
						//   대입하기 직전에     i 읽어와서 +1   Jane 런상태..
		}
		System.out.println("> Tom : "+ Ex02.data.i);
		//2만이 안나오는 경우? 출력하기 직전에 cpu가 뻇김
	}
}


class Jane extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <100000; i++) {

				Ex02.data.i++;

			//++ 증감연산자
			//어떤 기억공간의 값을 1증가 시키는 연산자
		}
		System.out.println("> Jane : "+ Ex02.data.i);
	}
}

public class Ex02 {

	public static Data data = new Data();

	public static void main(String[] args) {
		// ppt 295 동기화
		//Ex02 클래스에 하나 만들어지는 공유자원 coz of 'Static'



		System.out.println("> main 스레드 시작 <");

		Tom t = new Tom();
		Jane j = new Jane();


		t.start();
		j.start();
		System.out.println("> main 종료 <");


	}

}
