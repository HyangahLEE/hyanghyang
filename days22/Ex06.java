package days22;
class Node{
	
	public int value;
	public Node() {}
	public Node(int value) {
		super();
		this.value = value;
	}
	
	//자기 자신의 주소값을 참조할 필드 선언
	public Node next = null;

}
public class Ex06 {

	public static void main(String[] args) {
		//p731 링크드리스트(LinkesList)
		// 1. Collection -List
		//5. 순서가 있고 빈번히 삽입, 삭제하는 경우가 있다면
		// LinkedList 컬렉션 클래스를 사용하자.
		
		Node node1= new Node(100);
		Node node2 = new Node(200); node1.next=node2;
		Node node3 = new Node(300); node2.next=node3;
		Node node4 = new Node(300); node3.next=node4;
		node4.next=null;
			
		Node node5 = new Node(500);
		node5.next = node3;
		node2.next =node5;
		
		Node node = node1;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
			
	
		
		
		
	}

}
