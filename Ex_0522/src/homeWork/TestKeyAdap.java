package homeWork;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyAdap extends KeyAdapter {
	
	
	TestFrame f; //이곳에 반드시 TestFrame을 받아햐 하는것은 아니다 
  				//즉, 필요한 객체의 변수를 선언해도 된다. 다시 말해서 TestPanel을 선언해도 된다.
	
	public TestKeyAdap(TestFrame f) {
		
		this.f = f;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키를 누를때 마다 호출 되는 곳
		//이때 왼쪽방향키와 오른쪽 방향키만 선별하자
		
		int keyCode = e.getKeyCode(); //방향키를 받아내는 변수
		
		switch(keyCode) {
		case KeyEvent.VK_LEFT:
			//TestPanel 안에 있는 x의 값을 -5를 해준다.
			
			f.p.x -= 5; //TestFrame <-TestPaenl <- x값
			if(f.p.x<0) {
				f.p.x=0;
			}
			break;
	
		case KeyEvent.VK_RIGHT:
			f.p.x+=5;
			if(f.p.x > f.p.getWidth()-80) {
				f.p.x= f.p.getWidth()-80;
			}
			break;	
			
		}//switch의 끝
		
		f.p.repaint(); //x좌표가 변경되었으니, 그림을 다시 그린다.
	}

}
