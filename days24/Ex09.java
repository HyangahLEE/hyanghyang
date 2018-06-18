package days24;

import days13.Car;

//  제네릭 클래스
class Product<T, M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}

public class Ex09 {

	public static void main(String[] args) {
		// p 659 멀티 타입 파라미터  Box<T>
		Product<Car, String> product2 = new Product<>();

	}

}
