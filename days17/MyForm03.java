package days17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MyForm03 
               extends Frame   {
	 
	public MyForm03() {
		this.setTitle("첫 윈폼");  // setter title
		this.setSize(300, 300); // setter size
	    this.setVisible(true);    // setter visible
	    // 닫기[X] 버튼 : 프로그램 종료 
	    this.addWindowListener(  
	    		// 익명 구현 객체
	    		// 익명 inner 클래스 ( 중첩클래스)
	    		new WindowAdapter() {
	    			@Override
	    			public void windowClosing(WindowEvent e) {
	    				System.out.println("> 프로그램 종료!!!");
	    				System.exit(-1);
	    			}
				}
	    		
	    		); //   this.addWindowListener(  
	    
	} 
	
}




