package days17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class 용우리스너 implements WindowListener{
  
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

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class MyForm 
               extends Frame 
               implements WindowListener{
	// 필드
	// 메서드
	// 기본 생성자
	public MyForm() {
		this.setTitle("첫 윈폼");  // setter title
		this.setSize(300, 300); // setter size
	    this.setVisible(true);    // setter visible
	    // 닫기[X] 버튼 : 프로그램 종료
	    // 자바에서 이벤트 처리 ? 리스너( listener), 어댑터( adapter )
	    
	    //this.addWindowListener(new 용우리스너());
	    
	    //this.addWindowListener(this);
	    
	    
	}

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
}




