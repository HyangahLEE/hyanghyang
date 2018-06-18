package days24;

// 제네릭 클래스 선언
// [한 대문자]
// T : Type
// E : Element
// K : Key
// V : Value
// K M N 
// 제네릭 클래스.... 
class Box<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

// 템플릿 클래스
/*
class Box{
	private Object data;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
*/
/*
class Box{
	private int data;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
*/
/*
class Box{
	private String data;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
*/
/*
class Box{
	private double data;
	
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	} 
}
*/
/*
class Box{
	private boolean data;
	
	public boolean getData() {
		return data;
	}
	public void setData(boolean data) {
		this.data = data;
	}
}
*/
/*
class Box{
	private char data;  // type
	 
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
}
*/
public class Ex07 {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.setData("홍길동"); // String  코드의 안전성
	    String name =	box.getData(); // 형변환 X
	    
	    Box<Integer> box2 = new Box<>();
	    box2.setData(20);
	    int i = box2.getData();
		
		/*
		Box<String>  box = new Box();
		Box  box = new Box(); 
		// 단점 : 형변환
		box.setData(100);
		System.out.println( (int)box.getData() );
		box.setData("홍길동");
		System.out.println( (String)box.getData() );
        */
	}

}
