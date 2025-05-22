package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ex3_MouseMotion extends MouseMotionAdapter {
	
	
	Ex3_Frame f; //생성자에서 인자로 받아서 저장해야 함
	public Ex3_MouseMotion() {
		
	}
	
	public Ex3_MouseMotion(Ex3_Frame n) {
		//n은 지역변수 이므로 곧 사라진다. 그래서 맴버변수에 저장하자
		
		f = n;
		
		
	}
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		//드래그할 때 위치값(x,y)얻기
		
		int x= e.getX();
		int y= e.getY();
		
		//위에서 얻은 x,y값을 Jpanel의 x,y에 전달해야 한다. 
		//그리고 Jpanel에 다시 그리도록 해야한다.(repaint호출)
		
		f.p.x =x;
		f.p.y =y;
		f.p.repaint(); //위에서 x,y값이 변경되었으므로 그림을 다시 그린다.
		
		
	}

	
	
}
