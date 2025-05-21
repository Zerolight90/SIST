package pm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex7_Mouse extends JFrame implements KeyListener{

	EX7_Panel p1;
	
	
	public Ex7_Mouse() {
		p1 = new EX7_Panel();
		this.add(p1);// 현재 창의 가운데에 Ex7_Panel을 추가했다.
		
		setBounds(300, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//이벤트 감지가 등록
		this.addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex7_Mouse();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 누를때 마다 수행하는 곳
		// 이때 방향키만 얻어 낸다.
		int keyCode = e.getKeyCode();
		
		//keyCode 가 방향키인지 구분하여 처리하는 비교문
		switch(keyCode) {
		case KeyEvent.VK_UP : 
			p1.y -= 5;
			break;
		case KeyEvent.VK_RIGHT:
			p1.x +=5;
			break;
		case KeyEvent.VK_DOWN:
			p1.y +=5;
			break;
		case KeyEvent.VK_LEFT:
			p1.x-=5;
			break;
		
		}//switch의 끝
		
		p1.repaint();//그림을 다시 그린다.
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
