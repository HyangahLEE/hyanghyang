package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Board {
	//필드
	String subject;
	String writer;
	String content;
	
	public Board() {}
	
	//생성자
	public Board(String subject, String writer, String content) {
		super();
		this.subject = subject;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		
		return String.format("%s\t%s\t%s\n", subject, writer, content);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// p729 Vector
		//1. Collection -List
		//2. ArrayList == Vector
		//차이점 ? 동기화처리가 되어져 있다. 멀티스레드에 사용가능

		Vector list = new Vector();
		
		list.add(new Board("첫 게시글","향아","졸려"));
		list.addElement(new Board("두번째 게시글","은덩","나두"));
		list.addElement(new Board("세번째 게시글","호덩","나동"));
		
		
		//모든 게시글 출력
		System.out.println(list.size());//요소 개수
		
		
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			Board board =(Board) list.get(i);
			System.out.printf("%s\t%s\t%s\n",board.subject,board.writer, board.content);
		}
		
		int len2 = list.size();
		for (int i = 0; i < len2; i++) {
			Board board =(Board) list.get(i);
			System.out.printf(board.toString());
		}
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Board board = (Board) ir.next();
			System.out.println(board);
		}
		
		
		Enumeration er = list.elements();		
		while (er.hasMoreElements()) {
			Board board = (Board) er.nextElement();
			System.out.println(board);
		}
		
		
		
		
	}

}
