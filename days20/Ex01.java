package days20;

public class Ex01 {

	public static void main(String[] args) {
		//****String.fotmat****
		String name = "홍길동";
		int age = 20;
		//문자열 변환
		//내가 원하는 형태로 바꿔서 출력,네트워크 가능 
		//print는 콘솔창에 출력만 가능
		//이름은 "홍길동"이고 ,나이는 20살 입니다. 
		String data = String.format("이름은 \"%s\"이고 ,나이는 %d살 입니다. ", name,age);
		//출력형식, 출력하고자하는 매개변수
		System.out.println(data);
	}

}
