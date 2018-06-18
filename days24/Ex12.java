package days24;

// 제네릭 클래스
class Product2<T, M>{
	T kind;
	M model;
}
//제네릭 클래스 상속
class ChildProduct<T, M, C> extends Product2<T, M>{
	C company;
}

public class Ex12 {

	public static void main(String[] args) {
		// p 669 제네릭 타입의 [상속]과 구현.
		/*
		Product<String, String> p = new Product<>();
		p.kind = "";			p.model = "";
		*/
	}

}
