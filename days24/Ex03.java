package days24;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	} 
}

public class Ex03 {

	public static void main(String[] args) {
		// Queue  인터페이스
		// 1. FIFO (  선입선출 )
		// 2. 피자 주문 -> 
		// 3. offer(e) :           push()
		//     peek()                             제거 X
		//     poll()     :          pop() 요소 제거 O
		// 4. LinkedList 
		Queue<Message> messageQueue =
				              new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "감자바"));
		
		//System.out.println( messageQueue.isEmpty()  );
		//messageQueue.size();
		
		// 모든 요소 출력
		while( !messageQueue.isEmpty() ) {
		    Message message =  messageQueue.poll();
		    System.out.printf("%s님에게 %s. \n"
		    		,message.to, message.command);
		}
		/*  FIFO ( 선입선출 )
		홍길동님에게 sendMail. 
		신용권님에게 sendSMS. 
		감자바님에게 sendKaKaotalk.
		
		 [*] 상품 주문/ 회원 가입 -> 메일 회원 축하. SMS 메시지.. 구현
        */
	}

}
