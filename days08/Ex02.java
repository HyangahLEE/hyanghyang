package days08;

public class Ex02 {
	public static void main(String[] args) {
		//제어문 if/switch/for/while/do~while/break/continue~
		//확장 for문 (foreach문) 형식**
		/*for (자료형 변수명 : 배열 또는 컬렉션) {

		}*/
		/*String [] names = new String[10];
		names[0] = "이석화";
		names[1] = "이혜원";
		names[0] = "배수빈";*/

		//배열 초기화           //names 에서 가져와서 하나만 name에 출력하겟다.
		String [] names = {"이석화","이혜원","배수빈"};
		for (String name : names) {
			System.out.println(name);

		}
		//System.out.println( names.length);   //배열크기 3

		/*for (int i = 0; i < names.length; i++) {
			System.out.println( names[i]);*/
	}

}

