package days24;

import java.util.Stack;

import javax.swing.ComboBoxEditor;

class Coin{
	private int value;
	public Coin(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	} 
}

public class Ex02 {

	public static void main(String[] args) {
		// p768 Stack 컬렉션 클래스
		// push() : 스택에 입력(추가)
		// peek() : 스택에서 맨 위에 있는 개체 얻어오는 메서드, 제거X
		// pop()   :                        "                         , 제거O
		
		// <E> 제네릭 컬렉션 클래스  
		// [E]element
		//  JDK 7 이후                  new Stack<>(); 
		// Vector<> 제네릭컬렉션 클래스를 상속받은 자식클래스
		// Vector 특징? List계열 + 동기화처리(멀티스레드)
		// LIFO 후입선출 자료구조....
		Stack<Coin> coinBox = new Stack<>();
		
		// coinBox.add(e);		coinBox.get(0);
		
		coinBox.push(new Coin(100));  // first
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(1));      // last
		
		// 출고(소비자)<- 마트 우유 <- 입고(판매자)
		
		// 마지막 요소 얻어오기..
		// coinBox.get( coinBox.size()-1 );
		
		// 스택에 있는 모든 요소를 꺼내와서 출력...
		/*
		while( !coinBox.isEmpty() ) {
			System.out.println( coinBox.pop().getValue() );
		}
		*/
		
		/*
		System.out.println( coinBox.isEmpty() );  // false
	    System.out.println( coinBox.size() );        // 6
	    System.out.println( coinBox.empty()  );   // false
	    
	    System.out.println( coinBox.peek().getValue() );
	    System.out.println( coinBox.size() );        // 6 제거 X
	    
	    System.out.println( coinBox.pop().getValue() );
	    System.out.println( coinBox.size() );        // 5 제거 O
        */	    
	}

}
