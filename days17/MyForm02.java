package days17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MyForm02 
               extends Frame   {
	 
	public MyForm02() {
		this.setTitle("첫 윈폼");  // setter title
		this.setSize(300, 300); // setter size
	    this.setVisible(true);    // setter visible
	    // 닫기[X] 버튼 : 프로그램 종료
	     //                                 무명(익명) 클래스
	    WindowListener listener = new WindowListener(){

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("> 프로그램 종료!!!");
				System.exit(-1);
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
	    	
	    };
	    this.addWindowListener(   listener  );
	    
	} 
	
}




