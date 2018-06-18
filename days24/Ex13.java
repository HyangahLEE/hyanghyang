package days24;

// 제네릭 인터페이스
interface Storage<T>{
	void add(T item, int index);
	T get(int index);
}

class StorageImpl<T> implements Storage<T>{
	
	private T   [] array;  //   ㄴ
	private int [] m    ;  //          ㄱ
	
	// 생성자...
	StorageImpl(int capacity){
		 m = new int[capacity];  //       (ㄱ)
		 // array = new T[capacity];   X
		 array = (T[])(new Object[capacity]); // 문법.
	}

	@Override
	public void add(T item, int index) { 
	}

	@Override
	public T get(int index) { 
		return null;
	}
	
}

public class Ex13 {

	public static void main(String[] args) {
		// (제네릭 확인문제 풀이)

	}

}
