package days24;

// 일반 Util 클래스
class Util{
	// method
	// Box<T> 메소드의 리턴자료형 : Box 제네릭클래스
	// 제네릭 메소드
	public static <T> Box<T> boxing(T t){
	   Box<T> box = null;
	   //
	   //
	   return box;
	}
}

public class Ex10 {

	public static void main(String[] args) {
		// p 660  제네릭 메소드
		// p 662 
		//                         클래스명.static제네릭메소드()
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int value = box1.getData();
		
	}

}
