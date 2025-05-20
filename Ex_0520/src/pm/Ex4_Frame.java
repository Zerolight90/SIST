package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ex4_Frame extends JFrame implements WindowListener{
	

	public Ex4_Frame() {//기본 생성자
		this.setTitle("프레임 창");
		
		this.setSize(500, 400);
		this.setLocation(300, 100);
		this.setVisible(true);
		
		//이벤트 감지자 등록
		this.addWindowListener(this);//현재 객체에서 윈도우 이벤트가 발행할떄 마다 addwindows Listener로 시정딘 this에게 해당 함수를 호출 한다
									 //예를 들어 종료버튼(X)를 클릭하면 this(현재객체)애서 windowsClosing이라는 함수를 호출한다.
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		Ex4_Frame f = new Ex4_Frame();
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//창의 종료버튼(X)을 클릭할 때 자동 호출되는곳
		System.exit(0);//지금 즉시 프로그램  장료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아이콘화");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("비아이콘화");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
